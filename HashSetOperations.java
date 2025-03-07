package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetOperations {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Red");
        set.add("Green");
        set.add("Blue");
        set.add("Yellow");
        set.add("Orange");
        set.add("Purple");
        set.add("Black");
        set.add("White");
        set.add("Pink");
        set.add("Brown");

        set.add("Gray");

        System.out.println("HashSet elements:");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        set.remove("Blue");

        System.out.println("Contains 'Green': " + set.contains("Green"));

        System.out.println("Size of HashSet: " + set.size());

        HashSet<String> clonedSet = new HashSet<>(set);
        System.out.println("Cloned HashSet: " + clonedSet);

        set.clear();
        System.out.println("HashSet after clearing: " + set);
    }
}

