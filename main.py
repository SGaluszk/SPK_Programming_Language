
from antlr4 import *
from SPKLexer import SPKLexer
from SPKListener import SPKListener
from SPKParser import SPKParser
import sys

class OurListener(SPKListener):
    data = {}
    tmp = None

    def enterProgram(self, ctx):
        pass
        #print("SPK: %s" % ctx.accept(SPKVisitor()))

    def exitIf_stat(self, ctx:SPKParser.If_statContext):
        pass

    def exitDeclaration(self, ctx:SPKParser.DeclarationContext): # CALKOWITA x = 2;
        
        if ctx.VARIABLE_NAME() not in self.data.keys():
            self.data[str(ctx.VARIABLE_NAME())] = {'type': str(ctx.TYPE_NAME()), 'value': self.tmp}
            self.tmp = None
        else:
            print('This variable name is already used!')

    def exitAssignment(self, ctx:SPKParser.AssignmentContext): # x = 2;
        print(ctx.VARIABLE_NAME())
        if ctx.VARIABLE_NAME() not in self.data.keys():
            print('This variable is not declared.')
        else:
            self.data[str(ctx.VARIABLE_NAME())]['value'] = self.tmp
            self.tmp = None

    # def enterExpr(self, ctx:SPKParser.ExprContext):
    #     if not ctx.expr():
    #         print(ctx.atom.INTEGER_NUMBER())

    def enterAtom(self, ctx:SPKParser.AtomContext):
        if ctx.INTEGER_NUMBER():
            self.tmp = int(str(ctx.INTEGER_NUMBER()[0]))
        elif ctx.FLOAT_NUMBER():
            self.tmp = float(str(ctx.FLOAT_NUMBER()[0]))


def main():
    data = open('test.txt', 'r').read()
    inputStream = InputStream(data)
    lexer = SPKLexer(inputStream)
    stream = CommonTokenStream(lexer)
    parser = SPKParser(stream)
    tree = parser.program()
    listener = OurListener()
    walker = ParseTreeWalker()
    walker.walk(listener, tree)

    print(listener.data)

if __name__ == '__main__':
    main()