
from antlr4 import *
from SPKLexer import SPKLexer
from SPKListener import SPKListener
from SPKParser import SPKParser
import sys

class OurListener(SPKListener):
    scopes = [{}]
    tmp = None

    def exitDeclaration(self, ctx:SPKParser.DeclarationContext): # CALKOWITA x = 2;
        
        if ctx.VARIABLE_NAME() not in self.scopes[-1].keys():
            self.scopes[-1][str(ctx.VARIABLE_NAME())] = {'type': str(ctx.TYPE_NAME()), 'value': self.tmp}
            self.tmp = None
        else:
            print('This variable name is already used!')

    def exitAssignment(self, ctx:SPKParser.AssignmentContext): # x = 2;
        print(ctx.VARIABLE_NAME())
        exists = False
        for scope in reversed(self.scopes):

            if str(ctx.VARIABLE_NAME()) in scope.keys():
                scope[str(ctx.VARIABLE_NAME())]['value'] = self.tmp
                self.tmp = None
                exists = True
                break
        if not exists:
            print("Error, you cannot assign value to non-existent variable.")

    def enterAtom(self, ctx:SPKParser.AtomContext):
        if ctx.INTEGER_NUMBER():
            self.tmp = int(str(ctx.INTEGER_NUMBER()[0]))
        elif ctx.FLOAT_NUMBER():
            self.tmp = float(str(ctx.FLOAT_NUMBER()[0]))

    def enterBlock(self, ctx:SPKParser.BlockContext):
        self.scopes.append({})       

    def exitBlock(self, ctx:SPKParser.BlockContext):
        self.scopes.pop(-1) 
        print("Koniec lokalnego scope'a")

    def enterPrint_(self, ctx:SPKParser.Print_Context):
        # print(self.scopes)
        if ctx.printable().VARIABLE_NAME():
            exists = False
            for i, scope in enumerate(reversed(self.scopes)):

                if str(ctx.printable().VARIABLE_NAME()) in scope.keys():
                    value = scope[str(ctx.printable().VARIABLE_NAME())]
                    exists = True
                    break
                    
            if exists:
                print(f"PRINT: {value['value']}")
            else:
                print("Error, this variable doesn't exist.")

                
        else:
            if (ctx.printable().STRING()):
                print(f"PRINT: {str(ctx.printable().STRING())[1:-1]}")

            elif (ctx.printable().INTEGER_NUMBER()):
                print(f"PRINT: {ctx.printable().INTEGER_NUMBER()}")

            elif (ctx.printable().FLOAT_NUMBER()):
                print(f"PRINT: {ctx.printable().FLOAT_NUMBER()}")

def main(filename):
    name = filename + '.txt'
    data = open(name, 'r', encoding="UTF-8").read()
    inputStream = InputStream(data)
    lexer = SPKLexer(inputStream)
    stream = CommonTokenStream(lexer)
    parser = SPKParser(stream)
    tree = parser.program()
    listener = OurListener()
    walker = ParseTreeWalker()
    walker.walk(listener, tree)
    f = open( 'scopes.txt', 'w' )
    f.write(repr(listener.scopes))
    f.close()
    print(listener.scopes)


if __name__ == '__main__':
    main(sys.argv[1])
