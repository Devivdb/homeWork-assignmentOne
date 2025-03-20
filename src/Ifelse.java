import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.print("Voer een getal in om te zien of het even of oneven is: ");
//        int number = scanner.nextInt();
//
//        System.out.print("Voer een cijfer van 1 t/m 10 in om te zien wat je cijfer in letters is: ");
//        float grade = scanner.nextFloat();
//
//        System.out.print("Voer een getal in G/S: ");
//        int inputGreaterOne = scanner.nextInt();
//
//        System.out.print("Voer een getal in G/S: ");
//        int inputGreaterTwo = scanner.nextInt();

//        System.out.print("Voer een getal in P/N: ");
//        int numberPosOrNeg = scanner.nextInt();
//
//        System.out.print("Voer je leeftijd in: ");
//        int age = scanner.nextInt();

//        System.out.print("Voer je text in: ");
//        String text = scanner.nextLine();

//        System.out.print("Voer een jaartal in: ");
//        int year = scanner.nextInt();
        int numberOne = 31;
        int numberTwo = 35;
        int numberThree = 4;
        
        greatestOfThree(numberOne, numberTwo, numberThree);


//      evenOrOdd(number);
//      grader(grade);
//      greaterThan(inputGreaterOne, inputGreaterTwo);
//      posOrNeg(numberPosOrNeg);
//      ageChecker(age);
//      textChecker(text);
//      leapYear(year);
    }

//    private static void evenOrOdd(int number) {
//        if (number % 2 == 0) {
//            System.out.println("Het getal is even!");
//        } else {
//            System.out.println("Het getal is oneven!");
//        }
//    }
//
//    private static void grader(float grade) {
//        if (grade >= 8 && grade <= 10) {
//            System.out.println("A");
//        } else if (grade >= 7 && grade <8) {
//            System.out.println("B");
//        } else if (grade >= 6 && grade < 7) {
//            System.out.println("C");
//        } else if (grade >= 5 && grade < 6) {
//            System.out.println("D");
//        } else if (grade >= 4 && grade < 5) {
//            System.out.println("E");
//        } else if (grade >= 0 && grade < 4) {
//            System.out.println("F");
//        } else {
//            System.out.println("Not a valid number");
//        }
//    }
//
//    private static void greaterThan(int inputGreaterOne, int inputGreaterTwo) {
//        if (inputGreaterOne > inputGreaterTwo) {
//            System.out.println(inputGreaterOne + " is greater than " + inputGreaterTwo);
//        } else if (inputGreaterTwo > inputGreaterOne) {
//            System.out.println(inputGreaterTwo + " is greater than " + inputGreaterOne);
//        } else {
//            System.out.println(inputGreaterOne + " is equal to " + inputGreaterTwo);
//        }
//    }
//
//    private static void posOrNeg(int numberPosOrNeg) {
//        if (numberPosOrNeg > 0) {
//            System.out.println(numberPosOrNeg + " is positive");
//        } else if (numberPosOrNeg < 0) {
//            System.out.println(numberPosOrNeg + " is negative");
//        } else {
//            System.out.println(numberPosOrNeg + " is zero");
//        }
//    }

//    private static void ageChecker(int age) {
//        if (age >= 0 && age < 12) {
//            System.out.println("Je bent een kind");
//        } else if (age >= 12 && age < 18) {
//            System.out.println("Je bent een puber");
//        } else if (age >= 18 && age < 65) {
//            System.out.println("Je bent een volwassene");
//        } else if (age >= 65) {
//            System.out.println("Je bent een senior");
//        } else {
//            System.out.println("Geen geldige leeftijd");
//        }
//    }

//    private static void textChecker(String text) {
//        if (text.length() <= 10) {
//            System.out.println("Kort");
//        } else if (text.length() >= 10 && text.length() < 20) {
//            System.out.println("middellang");
//        } else if (text.length() > 20) {
//            System.out.println("Lang");
//        }
//    }



//    private static void leapYear(int year) {
//        if (year % 4 == 0 && !(year % 100 == 0)) {
//            System.out.println(year + " is een schrikkeljaar");
//        } else if (year % 400 == 0) {
//            System.out.println(year + " is een schrikkeljaar");
//        } else {
//            System.out.println(year + " is geen schrikkeljaar");
//        }
//    }
    
    
    private static void greatestOfThree(int numberOne, int numberTwo, int numberThree) {
        int index = 0;
        if (index < numberOne) {
            index = numberOne;
        } else if (index < numberTwo) {
            index = numberTwo;
        } else if (index < numberThree) {
            index = numberThree;
        }
        System.out.println(index);
    }
}
