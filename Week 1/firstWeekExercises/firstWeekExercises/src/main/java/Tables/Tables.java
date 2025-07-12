package Tables;

public class Tables {

    public static void FiveNbTable() {

        int[] numbers = {3, 6, 7, 8, 10};

        System.out.printf("For the first table those are numbers: ");
        for (int number : numbers) {
            System.out.printf(number + " ");
        }
    }

    public static void OverTen() {

        int[] numbers = {10, 15, 50, 8, 40};
        int count = 0;

        for (int number : numbers) {
            if (number > 10) {
                count++;
            }
        }
        System.out.println("\n" + "There are " + count + " numbers from the second table over 10.");
    }

    public static void MaxOfNb() {

        int[] numbers = {10, 15, 50, 8, 40};
        int maxNb = numbers[0];

        for (int number : numbers) {
            if (maxNb < number) {
                maxNb = number;
            }
        }
        System.out.println("The maximum of numbers from the third table is: " + maxNb);
    }

    public static void SumOfNb() {
        int[] numbers = {10, 15, 50, 8, 40};
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        System.out.println("The sum of the elements in table is: " + sum);
    }

    public static void ReverseTb() {
        int[] numbers = {10, 15, 50, 8, 40, 50};

        System.out.printf("The reversed fourth table: ");

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.printf(numbers[i] + " ");
        }
    }

    public static void HowMany() {
        int[] numbers = {10, 15, 50, 8, 40, 50};
        int myNb = 10;
        int count = 0;

        for (int number : numbers) {
            if (myNb == number) {
                count++;
            }
        }

        System.out.printf("\n" + "Number " + myNb + " appears in the fifth table " + count + " times.");
    }

    public static void Average() {
        double[] numbers = {10.38, 15.45, 50.33, 8.23, 40.45, 50.32};
        double sum = 0;

        for (double number : numbers) {
            sum += number;
        }

        double average = sum / numbers.length;

        System.out.println("\n" + "The average for the last table is: " + average);
    }
}
