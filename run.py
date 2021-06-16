from antlr4 import *
from SPKLexer import SPKLexer
from SPKListener import SPKListener
from SPKParser import SPKParser
from FirstStageListener import FirstStageListener
from SecondStageListener import SecondStageListener
import tkinter as tk
import os
from tkinter.filedialog import askopenfilename, asksaveasfilename
from tkinter import scrolledtext
from contextlib import redirect_stdout
import sys
from main import main_SPK

filename = ''
filepath = ''


def open_file():
    global filepath
    """Open a file for editing."""
    filepath = askopenfilename(
        filetypes=[("SPK Files", "*.spk"), ("All Files", "*.*")]
    )
    if not filepath:
        return
    # print("Robię open, oto filepath: " + str(filepath))
    txt_edit.delete(1.0, tk.END)
    with open(filepath, "r",encoding="UTF-8") as input_file:
        text = input_file.read()
        txt_edit.insert(tk.END, text)
    global filename
    filename = os.path.splitext(os.path.basename(input_file.name))[0]
    window.title(f"Nauka języka SPK - {filepath}")


def save_file():
    """Save the current file as a new file."""

    global filepath
    filepath = asksaveasfilename(
        defaultextension="spk",
        filetypes=[("SPK Files", "*.spk"), ("All Files", "*.*")],
    )
    if not filepath:
        return
    with open(filepath, "w",encoding="UTF-8") as output_file:
        print("Robię save as, oto filepath: " + str(filepath))
        text = txt_edit.get(1.0, tk.END)
        output_file.write(text)
    window.title(f"Nauka języka SPK - {filepath}")


def save():
    # print("Robię save, oto filepath: " + str(filepath))
    """Save the current file."""
    #filepath = filename+'.spk'
    if not filepath:
        return
    with open(filepath, "w",encoding="UTF-8") as output_file:
        text = txt_edit.get(1.0, tk.END)
        output_file.write(text)
    window.title(f"Nauka języka SPK - {filepath}")


def run_file():
    save()
    txt_output.configure(state="normal")
    txt_output.delete(1.0,tk.END)

    output_scopes = "Zmienne globalne:"

    output_scopes = main_SPK(f'examples/{filename}')
    txt_output.configure(state="disabled")

    txt_data.configure(state="normal")
    txt_data.delete(1.0, tk.END)
    txt_data.insert(1.0, output_scopes)
    txt_data.configure(state="disabled")


window = tk.Tk()

SIZE_X = 1200
SIZE_Y = 680
window.geometry(f'{SIZE_X}x{SIZE_Y}')

window.title("Nauka języka SPK")
window.rowconfigure(0, minsize=SIZE_Y, weight=1)
window.columnconfigure(1, minsize=400, weight=4)
window.columnconfigure(2, minsize=400, weight=4)
window.columnconfigure(3, minsize=100, weight=1)

txt_edit = scrolledtext.ScrolledText(window, undo=True, wrap=tk.WORD)
txt_output = scrolledtext.ScrolledText(window, state="disabled", wrap=tk.WORD)
txt_data = scrolledtext.ScrolledText(window, state="disabled", wrap=tk.WORD)


def redirector(inputStr):
    global txt_output
    txt_output.update_idletasks()
    txt_output.insert(tk.END, inputStr)


sys.stdout.write = redirector


def tab(arg):
    txt_edit.insert(tk.INSERT, " " * 2)
    return 'break'


def comment(arg):
    # print(txt_edit.index())
    txt_edit.insert(f'{tk.INSERT} linestart', "??")
    return 'break'


txt_edit.bind("<Tab>", tab)
txt_edit.bind("<Control-slash>", comment)

fr_buttons = tk.Frame(window, relief=tk.RAISED, bd=2)
btn_open = tk.Button(fr_buttons, text="Otwórz", command=open_file)
btn_save_as = tk.Button(fr_buttons, text="Zapisz jako...", command=save_file)
btn_save = tk.Button(fr_buttons, text="Zapisz..", command=save)
btn_run = tk.Button(fr_buttons, text="Uruchom..", command=run_file)


btn_open.grid(row=0, column=0, sticky="ew", padx=5, pady=5)
btn_save_as.grid(row=1, column=0, sticky="ew", padx=5)
btn_save.grid(row=2, column=0, sticky="ew", padx=5)
btn_run.grid(row=3, column=0, sticky="ew", padx=5, pady=5)

fr_buttons.grid(row=0, column=0, sticky="ns")
txt_edit.grid(row=0, column=1, sticky="nsew")
txt_output.grid(row=0, column=2, sticky="nsew")
txt_data.grid(row=0, column=3, sticky="nsew")


window.mainloop()