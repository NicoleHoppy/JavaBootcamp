package lists;

import java.util.ArrayList;
import java.util.List;

public class ListsEx0 {

    public static void main(String[] args) {
        List<String> listWithCities = new ArrayList<>();
        listWithCities.add("Warszawa");
        listWithCities.add("Kraków");
        listWithCities.add("Poznań");

        System.out.println("Cities: " + listWithCities);

        System.out.println(listWithCities.get(2));
        System.out.println("Is this list empty? " + listWithCities.isEmpty());
        System.out.println("Size: " + listWithCities.size());
        System.out.println("Does this list cointain Gdańsk? " + listWithCities.contains("Gdańsk"));

    }
}
