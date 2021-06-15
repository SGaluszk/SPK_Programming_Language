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


def main_SPK(filename):

    output_scopes = "Zmienne globalne: \n"
    name = filename + '.spk'
    data = open(name, 'r', encoding="UTF-8").read()
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

        output_scopes += pretty_printing(listener2.memory['scopes'])
    except SyntaxExceptionSPK as e:
        print(e)
    except ExceptionSPK as e:
        print(e)
    except Exception as e:
        print(e)
        print('BŁĄD! Wystąpił niezidentyfikowany błąd.')

    return output_scopes


if __name__ == '__main__':
    main_SPK(sys.argv[1])
