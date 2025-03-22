## Main assignmet:
Welkom bij de eerste huiswerkopdracht die jullie gaan maken voor de Backend leerlijn. Je hebt als het goed is de eerste hoofdstukken gelezen en de eerste les van de cursus Java gevolgd. In deze opdracht ga je oefenen met wat je tot nu geleerd hebt over beslissingsstructuren en methodes.

Opzetten van een nieuw Java project
Open IntelliJ op je computer.

Kies rechts bovenin voor New project.

Op het volgende scherm zie je linksboven dat Java blauw geselecteerd is. Daar klik je op Next.

Op het volgende scherm hoeven we niks te selecteren en kunnen we gewoon op Next klikken.

Op het volgende scherm kunnen we een naam meegeven aan het project. Kies altijd een beschrijvende naam die iets zegt over je project zodat je ook weet wat erin staat. Bijvoorbeeld "javaOpdracht1".

Klik daarna op 'Finish'. Gefeliciteerd! Je hebt zojuist je eerste project aangemaakt.

Opdrachtbeschrijving
Maak in het nieuwe Java project dat je hebt gemaakt een main klasse en een public static void main methode. Maak daarnaast ook de volgende methodes:

hello()
positiveOrNegative(int number)
postiveOrZeroOrNegativ(int number)
bartender(String name)
sum(int input1, int input2)
Maak de volgende variabelen aan in de main methode:

int number
int input1
int input2
String name
Het gedrag van de methoden is als volgt:

De hello-methode print de regel "Hello, world!";
De positiveOrNegative-methode print aan de hand van een if else statement "This number is positive!" of "This number is negative!";
De positiveOrZeroOrNegative-methode print aan de hand van een if else if else statement "This number is positive!", "This number is zero!" of "This number is - negative!";
De bartender-methode print aan de hand van een switch statement, het drankje dat deze persoon graag drinkt;
De sum-methode print de uitkomst van de twee nummers die bij elkaar zijn opgeteld.
De waarde van number is 6. De waarde van input1 is 4. De waarde van input2 is 20. De waarde van name is Henk.

Roep alle methodes aan vanuit de main methode, verander de waardes en kijk wat eruit komt als je de waardes aanpast en opnieuw draait.

# Bonus if else:

Voor deze opdrachten zul je methodes met parameters moeten schrijven.
In elke methode kun je vervolgens met if-statements de opdracht uitvoeren.
Je mag de methodes in de _Ifelse_ klasse schrijven.

### Opdracht 1: Even/Odd Checker

Schrijf een methode dat als input een getal van de gebruiker accepteert en controleert of het even of oneven is. Print "Het getal is even" of "Het getal is oneven".

### Opdracht 2: Grader
Schrijf een methode dat een cijfer van een student accepteert (tussen 1 en 10) en op basis van dat cijfer een bijbehorende letterwaarde toekent (A, B, C, D, F). Je mag googlen naar het juiste cijferbereik voor elke letterwaarde, maar je mag het ook gokken.


### Opdracht 3: Grootste van Twee Getallen
Schrijf een programma dat de grootste van twee ingevoerde getallen bepaalt.

### Opdracht 4: Positief/Negatief/Zero Checker
Schrijf een methode dat een getal van de gebruiker accepteert en aangeeft of het positief, negatief of nul is.

### Opdracht 5: Leeftijdsclassificatie
Schrijf een methode dat de leeftijd van een persoon accepteert en bepaalt of die persoon een kind, puber, volwassene of senior is.

### Opdracht 6: Tekstlengte Checker
Schrijf een methode dat een tekst accepteert en controleert of de lengte van de tekst "kort" (korter dan 10 tekens), "middellang" (tussen 10 en 20 tekens) of "lang"(langer dan 20 tekens) is.

### Opdracht 7: Jaar Checker
Schrijf een methode die controleert of een gegeven jaartal een schrikkeljaar is of niet.

(
Het is een schrikkeljaar wanneer deze deelbaar is door 4, maar een eeuwjaar (100 jaar) die deelbaar is door 4 weer niet, met uitzondering als deze wel deelbaar is door 400. bron: https://berekenenonline.nl/schrikkeljaar/ 
)

### Opdracht 8: Grootste van Drie Getallen
Schrijf een programma dat de grootste van drie ingevoerde getallen bepaalt.

### Opdracht 9: Driehoekstype
Schrijf een methode dat de lengtes van de zijden van een driehoek accepteert en bepaalt of de driehoek gelijkzijdig, gelijkbenig of ongelijkzijdig is.

### Opdracht 10: Calculator
Schrijf een eenvoudige rekenmachine-methode die als parameters twee getallen en een operator (+, -, *, /) accepteert en vervolgens het resultaat van de berekening weergeeft.

# Bonus Loops:

 Voor deze opdracht moet je kiezen of je een for-loop of een while-loop gebruikt. 
In de meeste gevallen is er geen fout antwoord, maar wel is er vaak een goede reden om de een over de ander te kiezen.

1. Je moet de som van alle even getallen berekenen van 1 tot 100. 
2. Je wilt een reeks van getallen afdrukken, beginnend bij 1 en elke keer vermenigvuldigd met 2, totdat het resultaat groter is dan 1000. 
3. Je moet een lijst van getallen doorlopen en controleren of het getal 45 aanwezig is. 
```
De lijst met getallen: {17, 92, 3, 89, 55, 86, 24, 34, 67, 76, 81, 50, 59, 30, 14, 33, 83, 87, 38, 70, 9, 78, 91, 46, 53, 64, 25, 69, 29, 84, 22, 16, 79, 40, 21, 18, 68, 75, 2, 26, 39, 8, 31, 35, 1, 63, 77, 95, 15, 58, 61, 10, 85, 93, 96, 72, 98, 5, 73, 6, 23, 56, 49, 99, 43, 41, 20, 11, 12, 74, 57, 66, 94, 36, 7, 60, 88, 4, 65, 27, 28, 82, 32, 97, 48, 62, 80, 37, 13, 54, 19, 71, 42, 44, 90, 52, 51}
```
   
4. Je wilt een array van integers doorlopen en de som van de elementen berekenen. 
```
De array van integers: {12, 5, 7, 2, 18, 3, 9, 12}
```
5. Je hebt een lijst van strings en je wilt elk element afdrukken totdat je een lege string tegenkomt. 
```
De lijst met Strings: {"Er", "was", "eens", "een", "student", "die", "graag", "wilde", "leren", "", "Deze", "student", "haalde", "goede", "cijfers"}
```
6. Je wilt alle priemgetallen afdrukken tussen 1 en 100. 

7. Je hebt een lijst van integers en je wilt elk element afdrukken dat groter is dan 45.
```
De lijst van integers: {17, 92, 3, 89, 55, 86, 24, 34, 67, 76, 81, 50, 59, 30, 14, 33, 83, 87, 38, 70, 9, 78, 91, 46, 53, 64, 25, 69, 29, 84, 22, 16, 79, 40, 21, 18, 68, 75, 2, 26, 39, 8, 31, 35, 1, 63, 77, 95, 15, 58, 61, 10, 85, 93, 96, 72, 98, 5, 73, 6, 23, 56, 49, 99, 43, 41, 20, 11, 12, 74, 57, 66, 94, 36, 7, 60, 88, 4, 65, 27, 28, 82, 32, 97, 48, 62, 80, 37, 13, 54, 19, 71, 42, 44, 90, 52, 51}
```
8. Je wilt een teller implementeren die begint bij 10 en wordt verminderd met 1 totdat het gelijk is aan 0.
9. Je moet de eerste 10 Fibonacci-getallen genereren. (tip: google is je vriend)
10. Je wilt een driehoek afdrukken met behulp van sterretjes, waarbij het aantal sterretjes in elke rij toeneemt. (tip: google is je vriend)
```
          *
         ***
        *****
       *******
 etc.. 
 etc..
```

Maak jou uitwerkingen in de _"Loops"_ klasse.
