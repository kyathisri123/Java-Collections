package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListOperations {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");
        list.add("Fig");
        list.add("Grape");
        list.add("Honeydew");
        list.add("Indian Fig");
        list.add("Jackfruit");

        list.add("Kiwi");

        System.out.println("ArrayList elements:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        list.add(2, "Blueberry");

        list.remove("Date");
        list.remove(4);

        list.set(5, "Guava");

        System.out.println("Element at index 3: " + list.get(3));

        System.out.println("Size of ArrayList: " + list.size());

        System.out.println("Contains 'Grape': " + list.contains("Grape"));

        list.clear();
        System.out.println("ArrayList after clearing: " + list);
    }
}

