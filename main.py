
from antlr4 import *
from SPKLexer import SPKLexer
from SPKListener import SPKListener
from SPKParser import SPKParser
import sys
from FirstStageListener import FirstStageListener
from SecondStageListener import SecondStageListener


def main(filename):
    f = open('scopes.txt', 'w+')
    name = filename + '.txt'
    data = open(name, 'r', encoding="UTF-8").read()
    inputStream = InputStream(data)
    lexer = SPKLexer(inputStream)
    stream = CommonTokenStream(lexer)
    parser = SPKParser(stream)
    tree = parser.program()
    walker = ParseTreeWalker()

    listener1 = FirstStageListener()
    walker.walk(listener1, tree)

    listener2 = SecondStageListener(listener1.functions, walker)
    walker.walk(listener2, tree)

    f.write(repr(listener2.memory['scopes']))
    f.close()

    # print(listener2.memory['scopes'])


if __name__ == '__main__':
    main(sys.argv[1])