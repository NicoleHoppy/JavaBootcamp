public class Ex015 {
    public static void main(String[] args) {
        double[] myItems = {20.00, 20.00, 1.00, 20.00, 20.00};

        double sum = 0;

        for (double item : myItems) {
            sum+=item;
        }

        double average = sum / myItems.length;

        System.out.println("Average: " + average);
    }
}
