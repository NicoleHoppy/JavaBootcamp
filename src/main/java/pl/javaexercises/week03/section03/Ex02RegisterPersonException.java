package pl.javaexercises.week03.section03;

public class Ex02RegisterPersonException {
    public static void main(String[] args){
        try {
            Ex02RegisterPerson validRegisteredPerson = new Ex02RegisterPerson("Peter", 25);
    System.out.println(validRegisteredPerson);} catch (Ex02TooYoungException e) {
            System.out.println("This person couldn't be registered: " + e.getMessage());
        }

        try {
            Ex02RegisterPerson notValidAge = new Ex02RegisterPerson("Ann", 17);
            System.out.println(notValidAge);
    } catch (Ex02TooYoungException e) {
      System.out.println("This person couldn't be registered: " + e.getMessage());
        }
}
}