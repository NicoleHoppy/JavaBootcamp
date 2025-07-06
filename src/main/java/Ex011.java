public class Ex011 {

    public static void main(String[] args) {
        int[] myItems = {1, 20, 76, 15, 8};

        int max = myItems[0];

        for (int item : myItems) {
            if (max < item) {
                max = item;
            }
        }
        System.out.println("Maximum: " + max);
    }
}
