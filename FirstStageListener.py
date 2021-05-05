from SPKListener import SPKListener
from SPKParser import SPKParser


class FirstStageListener(SPKListener):

    def __init__(self):
        print('FIRST STAGE')
        self.functions = {}

    def exitFunction_(self, ctx:SPKParser.Function_Context):
        function_name = str(ctx.VARIABLE_NAME())
        if function_name in self.functions.keys():
            print('Funkcja o tej nazwie została już zainicjalizowana.')
        else:
            self.functions[function_name] = {
                'arguments': [{'type': str(t), 'name': str(n)} for t, n in zip(ctx.arguments().TYPE_NAME(), ctx.arguments().VARIABLE_NAME())],
                'body': []
            }
        for stmt in ctx.bigStmt():
            self.functions[function_name]['body'].append(stmt.getText())
        print(self.functions[function_name]['body'])
