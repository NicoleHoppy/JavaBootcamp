package Lists;

import java.util.*;

public class ListsEx {
    public static void main(String[] args) {

        int day = 4;

        switch (day) {
            case 1:
                System.out.println("Poniedziałek");
                break;
            case 2:
                System.out.println("Wtorek");
                break;
            default:
                System.out.println("Nieznany dzień");
        }

        List<String> oldEmpName = new LinkedList<>();
        oldEmpName.add("Ala");
        oldEmpName.add("Piotr");
        oldEmpName.add("Kasia");
        oldEmpName.add("Marta");
        System.out.println(oldEmpName.contains("Pati"));

        System.out.println(oldEmpName);

        List<String> newEmpName = new ArrayList<>();
        newEmpName.add("Wojtek");
        newEmpName.add("Ola");
        newEmpName.add("Damian");
        newEmpName.add("Tomek");
        newEmpName.add(1, "Paweł");

        System.out.println(newEmpName);

        Map<String, Integer> empId = new HashMap<>();
        empId.put(oldEmpName.get(0), 243266);
        empId.put(oldEmpName.get(1), 8638638);
        empId.put(oldEmpName.get(2), 291683);

        System.out.println(empId);

        for (Map.Entry<String, Integer> entry : empId.entrySet()) {
            System.out.println(entry);
        }
    }


}
