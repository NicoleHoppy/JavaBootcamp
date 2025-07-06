public class Ex2 {

    public static void main(String[] args) {
        int[] myItems = {1, 20, 0, 15, 8};

        int count = 0;

        for (int item : myItems){
            if (item > 10) {
                count++;
            }
        }

        System.out.println(count);
    }
}