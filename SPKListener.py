# Generated from SPK.g4 by ANTLR 4.9.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .SPKParser import SPKParser
else:
    from SPKParser import SPKParser

# This class defines a complete listener for a parse tree produced by SPKParser.
class SPKListener(ParseTreeListener):

    # Enter a parse tree produced by SPKParser#program.
    def enterProgram(self, ctx:SPKParser.ProgramContext):
        pass

    # Exit a parse tree produced by SPKParser#program.
    def exitProgram(self, ctx:SPKParser.ProgramContext):
        pass


    # Enter a parse tree produced by SPKParser#bigStmt.
    def enterBigStmt(self, ctx:SPKParser.BigStmtContext):
        pass

    # Exit a parse tree produced by SPKParser#bigStmt.
    def exitBigStmt(self, ctx:SPKParser.BigStmtContext):
        pass


    # Enter a parse tree produced by SPKParser#if_stat.
    def enterIf_stat(self, ctx:SPKParser.If_statContext):
        pass

    # Exit a parse tree produced by SPKParser#if_stat.
    def exitIf_stat(self, ctx:SPKParser.If_statContext):
        pass


    # Enter a parse tree produced by SPKParser#while_stat.
    def enterWhile_stat(self, ctx:SPKParser.While_statContext):
        pass

    # Exit a parse tree produced by SPKParser#while_stat.
    def exitWhile_stat(self, ctx:SPKParser.While_statContext):
        pass


    # Enter a parse tree produced by SPKParser#for_loop.
    def enterFor_loop(self, ctx:SPKParser.For_loopContext):
        pass

    # Exit a parse tree produced by SPKParser#for_loop.
    def exitFor_loop(self, ctx:SPKParser.For_loopContext):
        pass


    # Enter a parse tree produced by SPKParser#print.
    def enterPrint(self, ctx:SPKParser.PrintContext):
        pass

    # Exit a parse tree produced by SPKParser#print.
    def exitPrint(self, ctx:SPKParser.PrintContext):
        pass


    # Enter a parse tree produced by SPKParser#condition_block.
    def enterCondition_block(self, ctx:SPKParser.Condition_blockContext):
        pass

    # Exit a parse tree produced by SPKParser#condition_block.
    def exitCondition_block(self, ctx:SPKParser.Condition_blockContext):
        pass


    # Enter a parse tree produced by SPKParser#block.
    def enterBlock(self, ctx:SPKParser.BlockContext):
        pass

    # Exit a parse tree produced by SPKParser#block.
    def exitBlock(self, ctx:SPKParser.BlockContext):
        pass


    # Enter a parse tree produced by SPKParser#declaration.
    def enterDeclaration(self, ctx:SPKParser.DeclarationContext):
        pass

    # Exit a parse tree produced by SPKParser#declaration.
    def exitDeclaration(self, ctx:SPKParser.DeclarationContext):
        pass


    # Enter a parse tree produced by SPKParser#assignment.
    def enterAssignment(self, ctx:SPKParser.AssignmentContext):
        pass

    # Exit a parse tree produced by SPKParser#assignment.
    def exitAssignment(self, ctx:SPKParser.AssignmentContext):
        pass


    # Enter a parse tree produced by SPKParser#expr.
    def enterExpr(self, ctx:SPKParser.ExprContext):
        pass

    # Exit a parse tree produced by SPKParser#expr.
    def exitExpr(self, ctx:SPKParser.ExprContext):
        pass


    # Enter a parse tree produced by SPKParser#atom.
    def enterAtom(self, ctx:SPKParser.AtomContext):
        pass

    # Exit a parse tree produced by SPKParser#atom.
    def exitAtom(self, ctx:SPKParser.AtomContext):
        pass


    # Enter a parse tree produced by SPKParser#iterable.
    def enterIterable(self, ctx:SPKParser.IterableContext):
        pass

    # Exit a parse tree produced by SPKParser#iterable.
    def exitIterable(self, ctx:SPKParser.IterableContext):
        pass



del SPKParser