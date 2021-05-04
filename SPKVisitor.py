# Generated from SPK.g4 by ANTLR 4.9.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .SPKParser import SPKParser
else:
    from SPKParser import SPKParser

# This class defines a complete generic visitor for a parse tree produced by SPKParser.

class SPKVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by SPKParser#program.
    def visitProgram(self, ctx:SPKParser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SPKParser#bigStmt.
    def visitBigStmt(self, ctx:SPKParser.BigStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SPKParser#if_stat.
    def visitIf_stat(self, ctx:SPKParser.If_statContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SPKParser#while_stat.
    def visitWhile_stat(self, ctx:SPKParser.While_statContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SPKParser#for_loop.
    def visitFor_loop(self, ctx:SPKParser.For_loopContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SPKParser#print.
    def visitPrint(self, ctx:SPKParser.PrintContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SPKParser#condition_block.
    def visitCondition_block(self, ctx:SPKParser.Condition_blockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SPKParser#block.
    def visitBlock(self, ctx:SPKParser.BlockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SPKParser#declaration.
    def visitDeclaration(self, ctx:SPKParser.DeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SPKParser#assignment.
    def visitAssignment(self, ctx:SPKParser.AssignmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SPKParser#expr.
    def visitExpr(self, ctx:SPKParser.ExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SPKParser#atom.
    def visitAtom(self, ctx:SPKParser.AtomContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SPKParser#iterable.
    def visitIterable(self, ctx:SPKParser.IterableContext):
        return self.visitChildren(ctx)



del SPKParser