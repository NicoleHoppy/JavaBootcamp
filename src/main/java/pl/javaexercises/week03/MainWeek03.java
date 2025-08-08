package pl.javaexercises.week03;

import java.util.HashSet;
import java.util.Set;

public class MainWeek03 {
    public static void main(String[] args){
        Set<Ex01BookComparer> books = new HashSet<>();

        books.add(new Ex01BookComparer("The Witcher", "Andrzej Sapkowski", 1990));
        books.add(new Ex01BookComparer("The Witcher", "Andrzej Sapkowski", 2000));
        books.add(new Ex01BookComparer("Harry Potter", "J.K. Rowling", 1997));
        books.add(new Ex01BookComparer("Harry Potter", "Anonymous", 1997));

        System.out.println("List of books:");
        for (Ex01BookComparer b : books) {
            System.out.println(b);
        }
    }
}
