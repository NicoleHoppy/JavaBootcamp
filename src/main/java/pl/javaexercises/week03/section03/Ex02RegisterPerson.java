package pl.javaexercises.week03.section03;

public class Ex02RegisterPerson {
    String name;
    int age;

    @Override
    public String toString() {
        return "Ex02RegisteredPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Ex02RegisterPerson(String name, int age) throws Ex02TooYoungException{

        if (age < 18) throw new Ex02TooYoungException("This person is too young");

        this.age = age;
        this.name = name;
    }
}
