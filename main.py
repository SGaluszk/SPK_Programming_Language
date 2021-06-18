from antlr4 import *
from SPKLexer import SPKLexer
from SPKParser import SPKParser
from ErrorListenerSPK import ErrorListenerSPK, SyntaxExceptionSPK
from FirstStageListener import FirstStageListener
from SecondStageListener import SecondStageListener, ExceptionSPK
import sys

def pretty_printing(obj):
    result = ""
    if not obj[0]:
        result += "Nie znaleziono żadnych zmiennych globalnych\n"
    else:
        for k, v in obj[0].items():
            result += v['type'] + " " + k + " = " + str(v['value']) + "\n"

    return result


def main_SPK(filepath):

    try:
        data = open(filepath, 'r', encoding="UTF-8").read()
    except FileNotFoundError:
        print(f"BŁĄD! Nie znaleziono pliku {filepath.split('/')[-1]}.")
        return
    inputStream = InputStream(data)

    error_listener = ErrorListenerSPK()

    try:
        lexer = SPKLexer(inputStream)
        lexer.removeErrorListeners()
        lexer.addErrorListener(error_listener)

        stream = CommonTokenStream(lexer)

        parser = SPKParser(stream)
        parser.removeErrorListeners()
        parser.addErrorListener(error_listener)

        tree = parser.program()
        walker = ParseTreeWalker()

        listener1 = FirstStageListener()
        walker.walk(listener1, tree)

        listener2 = SecondStageListener(listener1.functions, walker)
        walker.walk(listener2, tree)

        global_variables = [f"{v['type']} {k} = {v['value']};" for k, v in listener2.memory['scopes'][0].items()]
        return global_variables

    except SyntaxExceptionSPK as e:
        print(e)
        return ['---']
    except ExceptionSPK as e:
        print(e)
        return ['---']
    except Exception as e:
        print(e)
        if str(e) == 'maximum recursion depth exceeded':
            print('BŁĄD! Przekroczono limit głębokości rekursji.')
        else:
            print('BŁĄD! Wystąpił niezidentyfikowany błąd.')
        return ['---']


if __name__ == '__main__':
    if len(sys.argv) > 1:
        main_SPK(sys.argv[1])
    else:
        print('BŁĄD! Nie podano nazwy pliku.')
