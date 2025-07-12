package maps;

import java.sql.SQLOutput;
import java.util.*;


public class MapEx04 {
    public static void main(String[] args) {

      List<String> names = Arrays.asList("Anna", "Asia", "Jan");
      Map<String, Integer> countMap = new HashMap<>();

      for (String name : names) {
          countMap.put(name, countMap.getOrDefault(name, 0)+1);
      }
        System.out.println(countMap);

    }

}



