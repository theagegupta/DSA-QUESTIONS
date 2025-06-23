import java.util.*;

import java.util.HashMap;

class HmUsage {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        // put, get, containsKey, remove, isEmpty, clear

        // Add a value to hashmap
        hm.put("Ayush", 10279);
        hm.put("Sumit", 101);
        hm.put("Aman", 101);
        hm.put("Abhinav", 011);
        hm.put("Kush", 111);

        System.out.println(hm);
        System.out.println(hm.get("Sarthak"));

        hm.remove("Ayush");
        System.out.println(hm);

        // iterating in a map

        Set<String> keys = hm.keySet();

        // for (String string : keys) {
        // System.out.println("Key:" + string + ", Value:" + hm.get(string));
        // }

        // we can also use entrySet()

        System.out.println(hm.entrySet());
        // for (Map.Entry<String, Integer> entry : hm.entrySet()) {
        // System.out.println(entry);
        // }

    }
}