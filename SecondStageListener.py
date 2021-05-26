from SPKListener import SPKListener
from SPKParser import SPKParser


class SecondStageListener(SPKListener):

    def __init__(self, functions_data, walker):
        self.memory = {
            'functions': functions_data,
            'scopes': [{}]
        }
        self.walker = walker
        self.skipping = False
        self.skipExpr = False
        self.skipBlock = False
        self.skipCondition = False
        self.for_loop_level = 0
        self.while_loop_level = 0
        self.if_loop_level = 0
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
            for scope in reversed(self.memory['scopes']):
                if str(ctx.VARIABLE_NAME()) in scope.keys():
                    type_name = scope[str(ctx.VARIABLE_NAME())]['type']
                    value = ctx.expr().result
                    if ctx.list_index():
                        if type_name == 'LISTA':
                            index = ctx.list_index().expr().result
                            if type(index) == int:

                                variable = scope[str(ctx.VARIABLE_NAME())]['value']
                                if index < len(variable):
                                    variable[index] = value
                                    scope[str(ctx.VARIABLE_NAME())]['value'] = variable
                                else:
                                    print('BŁĄD: indeks listy poza zakresem.')
                            else:
                                print('BŁĄD: indeks musi być typu całkowitego.')

                        else:
                            print('BŁĄD: nie można odnieść się przez indeks do tej zmiennej. (object is not subscriptable hehe)')

                    else:

                        if correct_type(type_name, value):
                            scope[str(ctx.VARIABLE_NAME())]['value'] = value
                        else:
                            print(f'BŁĄD: Brak zgodności typów danych. Podano ({type(value)}), oczekiwano wartość typu {type_name}.')

                    return
            print("BŁĄD: Nie możesz przypisać wartości do niezainicjowanej zmiennej")

    def enterBlock(self, ctx: SPKParser.BlockContext):
        if self.skipBlock:
            self.skipping = True
            self.skipExpr = True
        self.memory['scopes'].append({})

    def exitBlock(self, ctx: SPKParser.BlockContext):
        self.skipping = False
        self.skipExpr = False
        
        self.memory['scopes'].pop(-1)
        # print("Koniec lokalnego scope'a")

    def exitPrint_(self, ctx: SPKParser.Print_Context):
        if not self.skipping:
            if ctx.expr().result is not None:
                print(f"WYPISANIE: {ctx.expr().result}")

    def enterFunction_(self, ctx:SPKParser.Function_Context):
        self.skipping = True
        self.skipExpr = True

    def exitFunction_(self, ctx:SPKParser.Function_Context):
        self.skipping = False
        self.skipExpr = False

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
    
                self.memory['scopes'].append({})

                for arg, arg_exec in zip(f['arguments'], ctx.arguments_exec().expr()):

                    value = arg_exec.result
                    if correct_type(arg['type'], value):
                        self.memory['scopes'][-1][arg['name']] = {'type': arg['type'], 'value': value}
                    else:
                        self.memory['scopes'].pop(-1)
                        print("Niezgodność typów :(")
                        return

                self.walker.walk(self, f['block'])
                self.memory['scopes'].pop(-1)

            else:
                print(f'Nie zainicjowano funkcji o nazwie {function_name}.')

    def enterExpr(self, ctx:SPKParser.ExprContext):
        ctx.result = None

    def exitExpr(self, ctx:SPKParser.ExprContext):
        if not self.skipExpr:
            if not ctx.op and ctx.atom():
                if ctx.atom().LENGTH():
                    if ctx.atom().iterable().STRING():
                        ctx.result = len(str(ctx.atom().iterable().STRING())[1:-1])
                    elif ctx.atom().iterable().list_values():
                        ctx.result = len(ctx.atom().iterable().list_values().expr())
                    elif ctx.atom().iterable().VARIABLE_NAME():
                        variable = self.get_variable_value(str(ctx.atom().iterable().VARIABLE_NAME()))
                        if type(variable) in (list, str):
                            ctx.result = len(variable)
                        else:
                            print('BŁĄD: nie można obliczyć długości tej zmiennej.')
                    

                elif ctx.atom().VARIABLE_NAME():
                    variable_name = str(ctx.atom().VARIABLE_NAME())
                    ctx.result = self.get_variable_value(variable_name)

                elif ctx.atom().INTEGER_NUMBER():
                    ctx.result = int(str(ctx.atom().INTEGER_NUMBER()))
                elif ctx.atom().FLOAT_NUMBER():
                    ctx.result = float(str(ctx.atom().FLOAT_NUMBER()))
                elif ctx.atom().STRING():
                    ctx.result = str(ctx.atom().STRING())[1:-1]
                elif ctx.atom().BOOL_VALUE():
                    ctx.result = True if str(ctx.atom().BOOL_VALUE()) == 'Prawda' else False
                elif ctx.atom().list_values():
                    ctx.result = [expr.result for expr in ctx.atom().list_values().expr()]
                elif ctx.atom().list_element():
                    list_variable = self.get_variable_value(str(ctx.atom().list_element().VARIABLE_NAME()))
                    if type(list_variable) == list:
                        index = ctx.atom().list_element().list_index().expr().result
                        if type(index) == int:
                            ctx.result = list_variable[index]
                        else:
                            print('BŁĄD: indeks musi być typu całkowitego.')
                
                else:
                    ctx.result = ctx.atom().expr().result

            elif not ctx.op and ctx.MINUS():
                ctx.result = -1 * ctx.expr(0).result

            elif ctx.op and ctx.expr(0).result is not None and ctx.expr(1).result is not None:
                if ctx.MINUS():
                    print("odejmuje")
                    ctx.result = ctx.expr(0).result - ctx.expr(1).result
                elif ctx.PLUS():
                    ctx.result = ctx.expr(0).result + ctx.expr(1).result
                elif ctx.MULT():
                    ctx.result = ctx.expr(0).result * ctx.expr(1).result
                elif ctx.DIV():
                    ctx.result = ctx.expr(0).result / ctx.expr(1).result
                elif ctx.LTEQ():
                    ctx.result = ctx.expr(0).result <= ctx.expr(1).result
                elif ctx.GTEQ():
                    ctx.result = ctx.expr(0).result >= ctx.expr(1).result
                elif ctx.LT():
                    ctx.result = ctx.expr(0).result < ctx.expr(1).result 
                elif ctx.GT():
                    ctx.result = ctx.expr(0).result > ctx.expr(1).result
                elif ctx.EQ():
                    ctx.result = ctx.expr(0).result == ctx.expr(1).result
                elif ctx.NEQ():
                    ctx.result = ctx.expr(0).result != ctx.expr(1).result
                         
    # Enter a parse tree produced by SPKParser#condition.
    def enterCondition(self, ctx:SPKParser.ConditionContext):
        self.skipExpr = False
        self.skipping = False
        self.skipBlock = False
        if self.skipCondition:
            self.skipExpr = True

    # Exit a parse tree produced by SPKParser#condition.
    def exitCondition(self, ctx:SPKParser.ConditionContext):
        self.skipExpr = True
        self.skipping = True
        self.skipBlock = True
        if self.skipCondition:
            self.skipExpr = False

    def enterIf_stat(self, ctx:SPKParser.If_statContext):
        self.skipExpr = True
        self.skipping = True
        self.skipBlock = True
        self.if_loop_level += 1
        

    # Exit a parse tree produced by SPKParser#if_stat.
    def exitIf_stat(self, ctx:SPKParser.If_statContext):
        self.skipExpr = False
        self.skipping = False
        self.skipBlock = False
        self.if_loop_level -= 1
        if self.if_loop_level == 0:
            for cond_block in ctx.condition_block():
                # print("siema, tu condition block")
                # print(cond_block.condition().expr().result)
                if cond_block.condition().expr().result:
                    # print("kondycja spełniona")
                    self.walker.walk(self, cond_block.block())
                    return
                
            if ctx.block():
                self.walker.walk(self, ctx.block())
                # print(self.memory["scopes"])
    

    def enterWhile_stat(self, ctx):
        self.while_loop_level += 1
        # self.skipping = True
        self.skipBlock = True
        self.skipCondition = True

    # Exit a parse tree produced by SPKParser#while_stat.
    def exitWhile_stat(self, ctx:SPKParser.While_statContext):
        self.while_loop_level -= 1
        self.skipCondition = False
        if self.while_loop_level == 0:

            
            self.skipBlock = False
            while ctx.expr().result:
                self.walker.walk(self, ctx.block())
                self.walker.walk(self, ctx.expr())
        # while True:
        #     if not ctx.expr().result:
        #         break
        #     self.walker.walk(self, ctx.block())
            
            

    # Enter a parse tree produced by SPKParser#for_loop.
    def enterFor_loop(self, ctx:SPKParser.For_loopContext):
        self.for_loop_level += 1
        # self.skipping = True
        self.skipBlock = True
        self.skipCondition = True
        
    # Exit a parse tree produced by SPKParser#for_loop.
    def exitFor_loop(self, ctx:SPKParser.For_loopContext):
        self.for_loop_level -= 1
        self.skipCondition = False
        if self.for_loop_level == 0:

            # self.skipping = False
            self.skipBlock = False

            iterated = None
            if ctx.iterable().VARIABLE_NAME():
                iterated = self.get_variable_value(str(ctx.iterable().VARIABLE_NAME()))
                if type(iterated) not in (list, str):
                    iterated = None
            elif ctx.iterable().STRING():
                iterated = str(ctx.iterable().STRING())[1:-1]
            elif ctx.iterable().list_values():
                
                iterated = [expr.result for expr in ctx.iterable().list_values().expr()]

            if iterated is not None:
                for i in iterated:
                    self.memory['scopes'].append({})
                    self.memory['scopes'][-1][str(ctx.VARIABLE_NAME())] = {'type': get_type_SPK(type(i)), 'value': i}
                    self.walker.walk(self, ctx.block())
                    self.memory['scopes'].pop(-1)

        
    def get_variable_value(self, variable_name): 
        #print(self.memory['scopes'])
        for scope in reversed(self.memory['scopes']):
            if variable_name in scope.keys():
                value = scope[variable_name]['value']
                return value

        # throw jakiś error
        print(f'BŁĄD: Zmienna {variable_name} nie istnieje.')
        return None

    

def get_type_SPK(python_type):
    if python_type == int:
        return "CAŁKOWITA"
    elif python_type == float:
        return "UŁAMKOWA"
    elif python_type == str:
        return "NAPIS"
    elif python_type == bool:
        return "LOGICZNA"
    elif python_type == list:
        return "LISTA"
                      
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