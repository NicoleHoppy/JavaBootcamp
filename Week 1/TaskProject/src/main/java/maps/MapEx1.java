package maps;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class MapEx1 {
    public static void main(String[] args) {

        Map<String, Integer> people = new HashMap<>();
        people.put("Ania", 9);
        people.put("Ala", 10);
        people.put("Sonia", 18);

        Set<Map.Entry<String, Integer>> entries = people.entrySet();

        for (Map.Entry<String, Integer> entry : people.entrySet()) {
            if (entry.getValue() >= 18) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }

        }

    }
}


