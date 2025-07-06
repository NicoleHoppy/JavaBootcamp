public class Ex6 {
    public static void main(String[] args) {
        int[] myItems = {20, 20, 20, 15, 8};

        int number = 30;
        int count = 0;

        for (int item : myItems) {
            if (item == number) {
                count++;
            }
            else {
                continue;
            }
        }
        System.out.println(count);
    }
}
