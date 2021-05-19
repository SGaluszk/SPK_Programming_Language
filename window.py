import tkinter as tk
import subprocess
import os
from tkinter.filedialog import askopenfilename, asksaveasfilename

filename = ''
def open_file():
    """Open a file for editing."""
    filepath = askopenfilename(
        filetypes=[("Text Files", "*.txt"), ("All Files", "*.*")]
    )
    if not filepath:
        return
    txt_edit.delete(1.0, tk.END)
    with open(filepath, "r",encoding="UTF-8") as input_file:
        text = input_file.read()
        txt_edit.insert(tk.END, text)
    global filename
    filename = os.path.splitext(os.path.basename(input_file.name))[0]
    window.title(f"Edytor - {filepath}")

def save_file():
    """Save the current file as a new file."""
    
    filepath = asksaveasfilename(
        defaultextension="txt",
        filetypes=[("Text Files", "*.txt"), ("All Files", "*.*")],
    )
    if not filepath:
        return
    with open(filepath, "w",encoding="UTF-8") as output_file:
        text = txt_edit.get(1.0, tk.END)
        output_file.write(text)
    window.title(f"Edytor - {filepath}")

def save():
    """Save the current file as a new file."""
    filepath = filename+'.txt'
    if not filepath:
        return
    with open(filepath, "w",encoding="UTF-8") as output_file:
        text = txt_edit.get(1.0, tk.END)
        output_file.write(text)
    window.title(f"Edytor - {filepath}")

def run_file():
    
    proc = subprocess.Popen('python main.py ' + filename, stdout=subprocess.PIPE, shell=True, universal_newlines=True)
    output = proc.stdout.read()
    txt_output.delete(1.0,tk.END)
    txt_output.insert(tk.END, output)
    f = open("scopes.txt", "rb")
    
    
    scopes = f.read()
    txt_data.delete(1.0,tk.END)
    txt_data.insert(tk.END,scopes)
    f.close()
    #sc = ast.literal_eval(scopes)
    #print(sc)

    
window = tk.Tk()
window.geometry("1100x800")

window.title("SPK Grammar Learning App")
window.rowconfigure(0, minsize=800, weight=1)
window.columnconfigure(1, minsize=400, weight=1)
#window.rowconfigure(0, minsize=800, weight=1)
window.columnconfigure(2, minsize=400, weight=1)
window.columnconfigure(3, minsize=100, weight=1)

txt_edit = tk.Text(window)
txt_output = tk.Text(window)
txt_data = tk.Text(window)

fr_buttons = tk.Frame(window, relief=tk.RAISED, bd=2)
btn_open = tk.Button(fr_buttons, text="Open", command=open_file)
btn_save_as = tk.Button(fr_buttons, text="Save As...", command=save_file)
btn_save = tk.Button(fr_buttons, text="Save..", command=save)
btn_run = tk.Button(fr_buttons, text="Run..", command=run_file)


btn_open.grid(row=0, column=0, sticky="ew", padx=5, pady=5)
btn_save_as.grid(row=1, column=0, sticky="ew", padx=5)
btn_save.grid(row=2, column=0, sticky="ew", padx=5)
btn_run.grid(row=3, column=0, sticky="ew", padx=5, pady=5)

fr_buttons.grid(row=0, column=0, sticky="ns")
txt_edit.grid(row=0, column=1, sticky="nsew")
txt_output.grid(row=0, column=2, sticky="nsew")
txt_data.grid(row=0, column=3, sticky="nsew")


window.mainloop()
os.remove("scopes.txt") 