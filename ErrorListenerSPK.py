from antlr4.error.ErrorListener import ErrorListener
import re


class SyntaxExceptionSPK(Exception):
    def __init__(self, message, line, column):
        if 'no viable alternative at input' in message:
            bad_word = re.search("'(.+)'", message).group(0)
            self.message = f'Błąd składniowy w słowie {bad_word}.'
        else:
            self.message = 'Niewłaściwa składnia kodu.'
        self.line = line
        self.column = column

    def __str__(self):
        return f"BŁĄD! Linia {self.line}, kolumna {self.column}: {self.message}"


class ErrorListenerSPK(ErrorListener):
    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        raise SyntaxExceptionSPK(msg, line, column)
