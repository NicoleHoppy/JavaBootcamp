package lists;

import java.util.ArrayList;
import java.util.List;

public class ListsEx1 {
    public static void main(String[] args) {

       // String[] names = {"Ala", "Marta", "Zuza"};

        List<String> listOfNames = new ArrayList<>();
        listOfNames.add("Ania");
        listOfNames.add("Ewa");
        listOfNames.add("Adam");

        for (String name:listOfNames) {
            System.out.println(listOfNames);
        }

        System.out.println(listOfNames);

        System.out.println(listOfNames.contains("Ania"));
    }
}
