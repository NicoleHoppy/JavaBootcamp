public class Task {

    public static void main(String[] args) {
        byte varByte = 127;
        short varShort = 32767;
        int varInt = 21;
        long varLong = 526L;
        float varFloat = 2.385774F;
        double varDouble = 2.34;
        boolean varBoolean = true;
        char varChar = 'A';

        int myVar1 = 10;
        int myVar2 = 7;

        System.out.println("This is my first Java task!");

        System.out.println("varByte: " + varByte + ", varShort: " + varShort + ", varInt: " + varInt + ", varLong: " + varLong);

        // System.out.println("varByte: " + varByte);
        // System.out.println("varShort: " + varShort);
        // System.out.println("varInt: " + varInt);
        // System.out.println("varLong: " + varLong);

        System.out.println("varFloat: " + varFloat + ", varDouble: " + varDouble + ", varBoolean: " + varBoolean + ", varChar: " + varChar);

        System.out.println("Those are my new variables: " + "myVar1: " + myVar1 + ", myVar2: " + myVar2);

        System.out.println("addition: " + (myVar1 + myVar2));
        System.out.println("subtraction: " + (myVar1 - myVar2));
        System.out.println("multiplication: " + (myVar1 * myVar2));
        System.out.println("division: " + (myVar1 / myVar2));
        System.out.println("module: " + (myVar1 % myVar2));

        int numberOfItems = 200;
        System.out.println("I am declaring number of items: " + numberOfItems);

        if (numberOfItems < 100) {
            System.out.println("Number of items is less than 100");
        }
        else
            System.out.println("Number of items is more than 100");

        String[] cars = {"Opel", "Audi", "Fiat"};
        for (String car:cars){
            System.out.println(car);
        }


    }
}
