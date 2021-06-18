from antlr4.error.ErrorListener import ErrorListener
import re


class SyntaxExceptionSPK(Exception):
    def __init__(self, message, line, column):
        self.message = 'Niewłaściwa składnia kodu.'

        if match := re.search("no viable alternative at input '(.+)'", message):
            bad_word = match.group(1)
            self.message = f'Błąd składniowy w słowie "{bad_word}".'
            if bad_word == '{}':
                self.message += ' Blok nie może być pusty.'
        elif match := re.search("missing '(.*)' at", message):
            self.message = f'Niepoprawna składnia. Brakuje "{match.group(1)}".'
        elif "extraneous input 'FUNKCJA'" in message:
            self.message = 'Wszystkie deklaracje funkcji muszą pojawić się na początku pliku.'
        elif 'mismatched input' in message or 'extraneous input' in message:
            got, expected = re.findall(r"'(.*?)'", message)
            self.message = f'Oczekiwano "{expected}", otrzymano "{got}"'

        self.line = line
        self.column = column

    def __str__(self):
        return f"BŁĄD! Linia {self.line}, kolumna {self.column}: {self.message}"


class ErrorListenerSPK(ErrorListener):
    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        # print(msg)
        raise SyntaxExceptionSPK(msg, line, column)