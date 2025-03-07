package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapOperations {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Charlie");
        students.put(104, "David");
        students.put(105, "Eve");
        students.put(106, "Frank");
        students.put(107, "Grace");
        students.put(108, "Hannah");
        students.put(109, "Ian");
        students.put(110, "Jack");

        students.put(111, "Kate");

        System.out.println("Student with ID 105: " + students.get(105));

        HashMap<Integer, String> clonedMap = new HashMap<>(students);
        System.out.println("Cloned HashMap: " + clonedMap);

        System.out.println("Contains Key 103: " + students.containsKey(103));
        System.out.println("Contains Value 'David': " + students.containsValue("David"));

        System.out.println("Is HashMap empty: " + students.isEmpty());

        System.out.println("Size of HashMap: " + students.size());

        System.out.println("Keys in HashMap: " + students.keySet());

        students.remove(104);

        HashMap<Integer, String> copiedMap = new HashMap<>(students);
        System.out.println("Copied HashMap: " + copiedMap);
    }
}
