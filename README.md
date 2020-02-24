# Java - Exam 1 

## Schreibe einen Primzahl-Checker (50 Punkte)

Schreib ein Programm, dass eine Zahl von der Konsole einliest und prüft ob es sich um eine Primzahl handelt oder nicht. 
Eine Primzahl ist eine Zahl, die nur durch sich selbst und 1 teilbar ist. 

Einige Beispiele:
11, 17, 37, 23, 89 sind Primzahlen. 
34, 66, 52 sind keine Primzahlen.

## Römische Zahlen (30 Punkte)

Schreibe ein Programm, dass eine positive Zahl zwischen 0 und 100 von der Konsole einliest und ihre Repräsentation im römischen Zahlensystem ausgibt. Im römischen Zahlensystem werden Zahlen als Summen dargestellt:

 I=1
 V=5
 X=10
 L=50
 C=100
 
 Einige Beispiele: 
 7 = VII
 8 = VIII
 9 = IX
 93 = XCIII

Einige Regeln für das Übersetzen 
* Zeichen dürfen maximal 3-mal nebeneinander verwendet werden (XXX = 30, III = 3)
* Steht eine kleinere Einheit vor einer größeren subtrathiert man diese (IV = 4 "eins vor fünf", XC = 90 "10 vor hundert")

## Programmauswertung (10 Punkte)

Wie sieht die Ausgabe dieses Programms aus? 

```
int number = 12; 
System.out.println(number/5);
System.out.println(number/5.0);
number += 7; 
System.out.println(number);
```
Die Ausgabe wird so aussehen:
```java 
2
2.4 /*(int kann zwar eigendlich keine Kommazahlen speichern, IntelliJ wandelt aber,
wenn man eine int durch eine double dividiert den Typ automatisch auf den 
höherwertigeren um.)*/
19
```


## Datentypen (5 Punkte)

Welche Datentypen kennst du? 
Gibt es Unterschiede bei der Verwendung zwischen einem `int` und einem `Integer`? 

Ein "int" ist ein einfacher Datentyp, der nur ganzzahlige Zahlen speichern kann. 
Ein "Integer" ist ein komplexer Datentyp. Er kann den Wert "NULL" (gesprochen Nall, entspricht einem leeren Raum)
annehmen. 

## Scope (5 Punkte) 

Was ist der Scope einer Variable? 
Erkläre anhand eines kleinen Beispielprogramms.

```
1... system.out.println("Heute ist doch ein schöner Tag")
2... system.out.prontln("Wie oft möchte ich heute jubeln?")
3... for(int i == 0; i < 1000; i++){
4... system.out.println("JUUHHUUUU!!!")
5... }
6... int freude = i * 1000
7... system.out.println("Ich freue mich " + freude + " Mal am Tag!")
```
Die Variable "i" wird in der Zeile 3 in der For-Schleife erzeugt und "lebt" nur zwischen den geschwungenen 
Klammern in den Zeilen 3 und 5. Die Variable "freude" möchte auf die Variable "i" zugreifen, aber in der Zeile 6 
ist die Variable "i" nicht deklariert (und initialisiert). 
Den "Lebensraum" einer Variable nennt man Scope.





