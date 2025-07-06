public class Ex4 {
    public static void main(String[] args) {

        int[] myItems = {1, 20, 6, 15, 8};

        int number = 0;

        for (int item : myItems) {
            number += item;
        }

        System.out.println("Sum: " + number);

    }
}
