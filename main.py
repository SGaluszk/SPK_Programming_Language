from antlr4 import *
from SPKLexer import SPKLexer
from SPKListener import SPKListener
from SPKParser import SPKParser
from FirstStageListener import FirstStageListener
from SecondStageListener import SecondStageListener, ExceptionSPK
import sys

def pretty_printing(obj):
    result = "Zmienne globalne: \n"
    if not obj[0]:
        result += "Nie znaleziono żadnych zmiennych globalnych\n"
    else:
        for k, v in obj[0].items():
            result += v['type'] + " " + k + " = " + str(v['value']) + "\n"

    return result

def main_SPK(filename):

    name = filename + '.spk'
    data = open(name, 'r', encoding="UTF-8").read()
    inputStream = InputStream(data)
    lexer = SPKLexer(inputStream)
    stream = CommonTokenStream(lexer)
    parser = SPKParser(stream)
    tree = parser.program()
    walker = ParseTreeWalker()

    listener1 = FirstStageListener()
    walker.walk(listener1, tree)

    try:
        listener2 = SecondStageListener(listener1.functions, walker)
        walker.walk(listener2, tree)
    except ExceptionSPK as e:
        print(e)
    except Exception:
        pass
    
    output_scopes = pretty_printing(listener2.memory['scopes'])

    return output_scopes

if __name__ == '__main__':
    main_SPK(sys.argv[1])