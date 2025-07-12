package Lists;

import java.util.ArrayList;
import java.util.List;

public class Lists {

    public static void listOfNames() {
        List<String> names = new ArrayList<>();
        names.add("Ania");
        names.add("Ala");
        names.add("Zuza");
        names.add("Anna");

        System.out.println("The list contains the following names: ");

        for (String name : names) {
            System.out.printf(name + " ");
        }

        System.out.println("\n" + "Does this list contain name Anna? ");
        System.out.println(names.contains("Anna"));
    }
}
