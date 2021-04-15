# SPK Programming Language

## Szymon Gałuszka, Paweł Pytlowski, Krzysztof Sawina

## Zastosowanie
Celem projektu jest stworzenie prostego i przejrzystego języka do nauki programowania, który przeznaczony będzie dla dzieci szkół podstawowych. Ma on pozwolić na przyswojenie podstawowych zasad i sposobów konstruowania prostych algorytmów i programów. Składnia języka ma być jak najprostsza i umożliwić intuicyjne tworzenie kodu, który możliwie najlepiej oddawać będzie składnię języka naturalnego. Dlatego też do nazewnictwa poszczególnych słów kluczowych wykorzystany zostanie język polski. 

## Wizualizacja
Do dyspozycji użytkownika będzie aplikacja okienkowa z polem tekstowym do wpisywania kodu oraz oknem imitującym terminal. Całość będzie odpowiednio sformatowana, aby szata graficzna zachęcała początkującego programistę do działania i ułatwiała mu pracę oraz łatwy podgląd rezultatów. Aplikacja będzie umożliwiała także zapis skryptu do pliku oraz jego odczyt.

### Przykłady konstrukcji w języku
- definicja zmiennych
 ```sh
CAŁKOWITA x = 5;
NAPIS n = “Przykładowy tekst”;
LISTA l = [1 2 3 4 5];
```
- operatory logiczne i arytmetyczne
 ```sh
+, -, *, /, ^, =, ==, /=, <, <=, >, >=, (), ++, -- 
```
- instrukcje warunkowe
 ```sh
JEŻELI x < 3 TO x++ INACZEJ x = 1;
```
- pętle
 ```sh
DOPÓKI x > 0 TO {
WYPISZ “x wynosi” + X;
}

DLA i W [1 2 3 4] { ... }
```
- wypisywanie/wpisywanie danych
 ```sh
WYPISZ “Witaj świecie!”;
WPISZ zmienna_do_wpisania;
```
- konkatenacja napisów
 ```sh
“Ala ” … “ ma kota”;
“Pora” … “ na csa”;
```

- deklaracja funkcji
 ```sh
FUNKCJA fun(CAŁKOWITA x, NAPIS tekst){ ... }
```
