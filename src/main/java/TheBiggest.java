public class TheBiggest {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        int c = 45;

        if (a > b) {
            if (a > c) {
                System.out.println("Number a = " + a + " is the biggest number.");
            }
        }

        else {
            if (b > c) {
                System.out.println("Number b = " + b + " is the biggest number.");
            }

            else {
                System.out.println("Number c = " + c + " is the biggest number.");
            }
        }
    }
}
