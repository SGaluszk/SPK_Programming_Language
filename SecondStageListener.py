from SPKListener import SPKListener
from SPKParser import SPKParser


class SecondStageListener(SPKListener):

    def __init__(self, functions_data):
        self.memory = {
            'functions': functions_data,
            'scopes': [{}]
        }

        self.skipping = False
        print('SECOND STAGE')

    def exitDeclaration(self, ctx: SPKParser.DeclarationContext):  # CALKOWITA x = 2;
        if not self.skipping:
            if ctx.VARIABLE_NAME() not in self.memory['scopes'][-1].keys():
                type_name = str(ctx.TYPE_NAME())
                value = ctx.expr().result
                if correct_type(type_name, value):
                    self.memory['scopes'][-1][str(ctx.VARIABLE_NAME())] = {'type': type_name, 'value': value}
                else:
                    print(f'Przypisanie niewłaściwych danych ({type(value)}), oczekiwano wartość typu {type_name}.')
            else:
                print('This variable name is already used!')

    def exitAssignment(self, ctx: SPKParser.AssignmentContext):  # x = 2;
        if not self.skipping:
            exists = False
            for scope in reversed(self.memory['scopes']):

                if str(ctx.VARIABLE_NAME()) in scope.keys():
                    type_name = scope[str(ctx.VARIABLE_NAME())]['type']
                    value = ctx.expr().result
                    if correct_type(type_name, value):
                        scope[str(ctx.VARIABLE_NAME())]['value'] = value
                    else:
                        print(f'BŁĄD: Brak zgodności typów danych. Podano ({type(value)}), oczekiwano wartość typu {type_name}.')
                    exists = True
                    break
            if not exists:
                print("BŁĄD: Nie możesz przypisać wartości do niezainicjowanej zmiennej")

    def enterBlock(self, ctx: SPKParser.BlockContext):
        if not self.skipping:
            self.memory['scopes'].append({})

    def exitBlock(self, ctx: SPKParser.BlockContext):
        if not self.skipping:
            self.memory['scopes'].pop(-1)
            print("Koniec lokalnego scope'a")

    def exitPrint_(self, ctx: SPKParser.Print_Context):
        if not self.skipping:
            if ctx.expr().result:
                print(f"PRINT: {ctx.expr().result}")
            else:
                print("BŁĄD, nie ma takiej zmiennej")

            # if ctx.expr().atom().VARIABLE_NAME():
            #     exists = False
            #     variable_name = str(ctx.expr().atom().VARIABLE_NAME())
            #     for i, scope in enumerate(reversed(self.memory['scopes'])):

            #         if str(ctx.expr().atom().VARIABLE_NAME()) in scope.keys():
            #             value = scope[str(ctx.expr().atom().VARIABLE_NAME())]['value']
            #             exists = True
            #             break

            #     if exists:
            #         print(f"PRINT: {value}")
            #     else:
            #         print(f'BŁĄD: Zmienna {variable_name} nie istnieje.')

            # else:
            #     print(f"PRINT: {ctx.expr().result}")
            #     # if (ctx.expr().STRING()):
            #     #     print(f"PRINT: {str(ctx.expr().STRING())[1:-1]}")

            #     # elif (ctx.expr().INTEGER_NUMBER()):
            #     #     print(f"PRINT: {ctx.expr().INTEGER_NUMBER()}")

            #     # elif (ctx.expr().FLOAT_NUMBER()):
            #     #     print(f"PRINT: {ctx.expr().FLOAT_NUMBER()}")

            #     # elif (ctx.expr().BOOL_()):
            #     #     print(f"PRINT: {ctx.expr().BOOL_()}")

    def enterFunction_(self, ctx:SPKParser.Function_Context):
        self.skipping = True

    def exitFunction_(self, ctx:SPKParser.Function_Context):
        self.skipping = False

    def exitFunction_exec(self, ctx:SPKParser.Function_execContext):
        if not self.skipping:

            function_name = str(ctx.VARIABLE_NAME())
            if function_name in self.memory['functions'].keys():
                print(f'Wywołanie funkcji {function_name}')

                f = self.memory['functions'][function_name]

                expected_len = len(f['arguments'])
                actual_len = len(ctx.arguments_exec().expr())
                if expected_len != actual_len:
                    print(f'Nieprawidłowa liczba argumentów. Oczekiwano {expected_len}, otrzymano {actual_len}.')
                    return
            else:
                print(f'Nie zainicjowano funkcji o nazwie {function_name}.')

    def enterExpr(self, ctx:SPKParser.ExprContext):
        ctx.result = None

    def exitExpr(self, ctx:SPKParser.ExprContext):
        if not self.skipping:
            if not ctx.op and ctx.atom():
                if ctx.atom().VARIABLE_NAME():
                    variable_name = str(ctx.atom().VARIABLE_NAME())
                    exists = False
                    for scope in reversed(self.memory['scopes']):
                        if variable_name in scope.keys():
                            value = scope[variable_name]['value']
                            exists = True
                            break
                    if exists:
                        ctx.result = value
                    else:
                        # throw jakiś error
                        ctx.result = 0
                        print(f'BŁĄD: Zmienna {variable_name} nie istnieje.')

                elif ctx.atom().INTEGER_NUMBER():
                    ctx.result = int(str(ctx.atom().INTEGER_NUMBER()))
                elif ctx.atom().FLOAT_NUMBER():
                    ctx.result = float(str(ctx.atom().FLOAT_NUMBER()))
                elif ctx.atom().STRING():
                    ctx.result = str(ctx.atom().STRING())[1:-1]
                elif ctx.atom().BOOL_VALUE():
                    ctx.result = True if str(ctx.atom().BOOL_VALUE()) == 'Prawda' else False
                elif ctx.atom().list_values():
                    # tmp_list = []
                    # print(ctx.atom().list_values().getText())
                    # elements = ctx.atom().list_values().getText().split(',')
                    # for element in elements:
                    #     value = None
                    #     if element == 'PRAWDA':
                    #         value = True
                    #     elif element == 'FAŁSZ':
                    #         value = False
                    # values = ctx.atom().list_values().expr()
                    ctx.result = [expr.result for expr in ctx.atom().list_values().expr()]
                else:
                    ctx.result = ctx.atom().expr().result

            elif ctx.op and ctx.expr(0).result and ctx.expr(1).result:
                if str(ctx.MINUS()) == '-':
                    ctx.result = ctx.expr(0).result - ctx.expr(1).result
                elif str(ctx.PLUS()) == '+':
                    ctx.result = ctx.expr(0).result + ctx.expr(1).result
                elif str(ctx.MULT()) == '*':
                    ctx.result = ctx.expr(0).result * ctx.expr(1).result
                elif str(ctx.DIV()) == '/':
                    ctx.result = ctx.expr(0).result / ctx.expr(1).result


def correct_type(variable_type: str, value):
    if variable_type == 'CAŁKOWITA':
        return type(value) == int
    elif variable_type == 'UŁAMKOWA':
        return type(value) == float
    elif variable_type == 'NAPIS':
        return type(value) == str
    elif variable_type == 'LOGICZNA':
        return type(value) == bool
    elif variable_type == 'LISTA':
        return type(value) == list