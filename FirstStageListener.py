from SPKListener import SPKListener
from SPKParser import SPKParser


class FirstStageListener(SPKListener):

    def __init__(self):
        print('FIRST STAGE')
        self.functions = {}

    def exitFunction_(self, ctx:SPKParser.Function_Context):
        # print(ctx.getChild(8))
        # print(ctx.block())
        # print(ctx.__dir__())

        

        # FUNKCJA f(CAŁKOWITA x){
        #     x = x + 1;
        #     WYPISZ x;
        # }

        # f(1)

        function_name = str(ctx.VARIABLE_NAME())
        if function_name in self.functions.keys():
            print('Funkcja o tej nazwie została już zainicjalizowana.')
        else:
            self.functions[function_name] = {
                'arguments': [{'type': str(t), 'name': str(n)} for t, n in zip(ctx.arguments().TYPE_NAME(), ctx.arguments().VARIABLE_NAME())],
                'block': ctx.block()
            }

    # def exitPrint_(self, ctx:SPKParser.Print_Context):
    #     print("siema jestem w princie")