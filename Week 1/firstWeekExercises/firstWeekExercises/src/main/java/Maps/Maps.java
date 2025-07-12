package Maps;

import java.util.*;

public class Maps {
    public static void main(String[] args) {
        NamesAge();
        Over18();
        CountNames();
    }

    static void NamesAge() {
        Map<String, Integer> people = new HashMap<>();
        people.put("Ania", 17);
        people.put("Sylwia", 25);
        people.put("Kasia", 21);

        System.out.println("Those are all people in the Map: ");

        for (Map.Entry<String, Integer> entry : people.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    static void Over18() {
        Map<String, Integer> people = new HashMap<>();
        people.put("Ania", 17);
        people.put("Sylwia", 25);
        people.put("Kasia", 21);

        System.out.println("And here are only people over 18 years old: ");

        for (Map.Entry<String, Integer> entry : people.entrySet()) {
            if (entry.getValue() > 18) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }

    static void CountNames() {

        List<String> names = Arrays.asList("Anna", "Kasia", "Jan");
        Map<String, Integer> countMap = new HashMap<>();

        for (String name : names) {
            countMap.put(name, countMap.getOrDefault(name, 0) + 1);
        }

        System.out.println("There is a count of names: " + countMap);
    }
}
