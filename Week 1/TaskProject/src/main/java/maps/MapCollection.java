package maps;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapCollection {
    public static void main(String[] args) {
        Map<String, String> cars = new HashMap<>();
        cars.put("Volvo", "XC80");
        cars.put("Fiat", "Panda");
        cars.put("Volkswagen", "Golf");

        System.out.println(cars.get("Volvo"));
        System.out.println(cars.get("Toyota"));

        System.out.println(cars.remove("Fiat"));
        System.out.println(cars);
        System.out.println(cars.size());
        System.out.println(!cars.isEmpty());
        System.out.println(cars.containsKey("Toyota"));
        System.out.println(cars.containsValue("Golf"));

        cars.entrySet();

    }
}
