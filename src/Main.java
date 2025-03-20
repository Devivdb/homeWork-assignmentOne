public class Main {
    public static void main (String[] args) {
        int number = 1;
        int input1 = 4;
        int input2 = 20;
        String name = "Henk";

        positiveOrNegative(number);
        postiveOrZeroOrNegativ(number);
        bartender(name);
        sum(input1, input2);
    }

        private static String hello() {
        return "Hello World";
        }

        private static void positiveOrNegative(int number) {
        if (number > 0) {
            System.out.println("This number is positive!");
        } else if (number < 0) {
            System.out.println("This number is negative!");
        }
    }

        private static void postiveOrZeroOrNegativ(int number) {
            if (number > 0) {
                System.out.println("This number is positive!");
            } else if (number < 0) {
                System.out.println("This number is negative!");
            } else {
                System.out.println("This number is zero!");
            }
        }

        private static void bartender(String name) {
            switch (name) {
                case "Hans":
                    System.out.println(name + " drinkt graag: Long island ice tea");
                    break;
                case "Vale ":
                    System.out.println(name + " drinkt graag: mojito");
                    break;
                case "Devi":
                    System.out.println(name + " drinkt graag: milk");
                    break;
                case "Henk":
                    System.out.println(name + " drinkt graag: milkshake");
                    break;
                default:
                        System.out.println("Invalid name");
            }
        }
        private static void sum(int input1, int input2) {
        System.out.println(input1 + input2);
        }
}
