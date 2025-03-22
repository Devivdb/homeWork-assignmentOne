import java.util.ArrayList;
import java.util.List;

public class Loops {
    public static void main(String[] args) {

        int[] numbersList = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
                41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60,
                61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80,
                81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100};


        int[] numbers = {17, 92, 3, 89, 55, 86, 24, 34, 67, 76, 81, 50, 59, 30, 14, 33, 83, 87, 38, 70, 9, 78, 91, 46, 53, 64, 25, 69, 29, 84, 22, 16, 79, 40, 21, 18, 68, 75, 2, 26, 39, 8, 31, 35, 1, 63, 77, 95, 15, 58, 61, 10, 85, 93, 96, 72, 98, 5, 73, 6, 23, 56, 49, 99, 43, 41, 20, 11, 12, 74, 57, 66, 94, 36, 7, 60, 88, 4, 65, 27, 28, 82, 32, 97, 48, 62, 80, 37, 13, 54, 19, 71, 42, 44, 90, 52, 51};

        int[] numberOfFour = {12, 5, 7, 2, 18, 3, 9, 12};

        String[] emptyString = {"Er", "was", "eens", "een", "student", "die", "graag", "wilde", "leren", "", "Deze", "student", "haalde", "goede", "cijfers"};

        // antwoord opdracht 1
        System.out.println("Antwoord van opdracht 1: " + assignmentOne(numbersList));

        ////////////////////////////////////////////////////////////////////////

        /// Opdracht 2
        int numberHolder = 1;

        while (numberHolder < 1000) {
            // antwoord opdracht 2
            System.out.println(numberHolder);
            numberHolder *= 2;
        }
        ////////////////////////////////////////////////////////////////////////

        // antwoord opdracht 3
        System.out.println("Antwoord van opdracht 3: (is het nummer 45 aanwezig: " + assignmentThree(numbers) + ")");

        ////////////////////////////////////////////////////////////////////////

        // antwoord opdracht 4
        System.out.println("Antwoord van opdracht 4: " + assignmentFour(numberOfFour));

        ////////////////////////////////////////////////////////////////////////

        // antwoord opdracht 5
        System.out.println("Antwoord van opdracht 5: " + assignmentFive(emptyString));

        ////////////////////////////////////////////////////////////////////////

        /// antwoord opdracht 6
        System.out.println("Antwoord van opdracht 6: " + assignmentSix());

        ////////////////////////////////////////////////////////////////////////

        /// antwoord opdracht 7
        System.out.println("Antwoord van opdracht 7: " + assignmentSeven(numbers));

        ////////////////////////////////////////////////////////////////////////

        /// Opdracht 8

        int i = 10;

        while (i >= 0){
            System.out.println(i);
            i--;
        }


        ////////////////////////////////////////////////////////////////////////

        /// Opdracht 9

        System.out.println("First 10 Fibonacci numbers:");
        printFibonacciNumbers(10);

        ////////////////////////////////////////////////////////////////////////

        /// Opdracht 10

        System.out.println("\nStar triangle:");
        printStarTriangle(10);

        ////////////////////////////////////////////////////////////////////////
    }

    /// Opdracht 1
    private static int assignmentOne(int[] numbers) {
        int evenNumber = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (isEvenNumber(numbers[i]) == true) {
                evenNumber += numbers[i];
            }
        }
        return evenNumber;
    }

    private static boolean isEvenNumber(int numbers) {
        return numbers % 2 == 0;
    }
    ////////////////////////////////////////////////////////////////////////

    /// Opdracht 3

    private static boolean assignmentThree(int[] numbers) {

        boolean validator = false;
        int i = 0;

        while (i < numbers.length) {
            if (numbers[i] == 45) {
                validator = true;
            }
            i++;
        }
        return validator;
    }


    ////////////////////////////////////////////////////////////////////////

    /// Opdracht 4

    private static int assignmentFour(int[] numberOfFour) {

        int totalSum = 0;

        for (int i = 0; i < numberOfFour.length; i++) {
            totalSum += numberOfFour[i];
        }
        return totalSum;
    }

    ////////////////////////////////////////////////////////////////////////

    /// Opdracht 5

    private static String assignmentFive(String[] emptyString) {
        int index = 0;

        while (index < emptyString.length) {
            System.out.println("Checking: " + emptyString[index]);

            if (emptyString[index].equals("")) {
                return "Empty String at index " + index;
            }

            index++;
        }

        return "No empty string found";
    }

    ////////////////////////////////////////////////////////////////////////

    /// Opdracht 6

    private static List<Integer> assignmentSix() {
        List<Integer> primeNumbers = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            if (isPrime(i)) {
                primeNumbers.add(i);
            }
        }

        return primeNumbers;
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        if (number <= 3) {
            return true;
        }

        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

    ////////////////////////////////////////////////////////////////////////

    /// Opdracht 7

    private static List<Integer> assignmentSeven(int[] numbers) {
        List<Integer> greaterThen = new ArrayList<>();

        int i = 0;

        while (i < numbers.length) {
            if (numbers[i] > 45){
                greaterThen.add(numbers[i]);
            }
            i++;
        }
        return greaterThen;
    }

    ////////////////////////////////////////////////////////////////////////

    /// Opdracht 9
    private static void printFibonacciNumbers(int count) {
        int n1 = 0, n2 = 1;

        for (int i = 0; i < count; i++) {
            System.out.print(n1 + " ");

            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }
        System.out.println();
    }

    ////////////////////////////////////////////////////////////////////////

    /// Opdracht 10
    private static void printStarTriangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
