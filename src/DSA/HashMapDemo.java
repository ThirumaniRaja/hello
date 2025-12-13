package DSA;


import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

        // First put
        map.put("name", "Thirumani");

        // Second put (same key)
        String oldValue = map.put("name", "Sudharshana");

        // Print old value
        System.out.println("Old Value: " + oldValue);

        // Print current map value
        System.out.println("Current Value: " + map.get("name"));

        // Print entire map
        System.out.println("Map Content: " + map);
    }
}

