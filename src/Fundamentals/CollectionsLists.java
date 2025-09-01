package Fundamentals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsLists {

	public static void main(String[] args) {
		
		// ----- LIST EXAMPLE -----
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple"); // List allows duplicates

        System.out.println("List Example (allows duplicates, maintains order):");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // ----- SET EXAMPLE -----
        Set<String> uniqueFruits = new HashSet<>();
        uniqueFruits.add("Apple");
        uniqueFruits.add("Banana");
        uniqueFruits.add("Mango");
        uniqueFruits.add("Apple"); // Set ignores duplicates

        System.out.println("\nSet Example (no duplicates, order not guaranteed):");
        for (String fruit : uniqueFruits) {
            System.out.println(fruit);
        }

        // ----- MAP EXAMPLE -----
        Map<Integer, String> fruitMap = new HashMap<>();
        fruitMap.put(1, "Apple");
        fruitMap.put(2, "Banana");
        fruitMap.put(3, "Mango");
        fruitMap.put(2, "Orange"); // Key 2 is updated to "Orange"

        System.out.println("\nMap Example (key-value pairs, unique keys):");
        for (Map.Entry<Integer, String> entry : fruitMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

	}

}
