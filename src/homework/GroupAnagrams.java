package homework;

import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {

            // Convert word to char array and sort
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
//            System.out.println("ghjkl"+ chars);
//
//            // Use sorted string as key
            String key = new String(chars);

//
//            // Add word to map
//            map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
            if (map.containsKey(key)) {
                // Key already exists → add word to existing list
                map.get(key).add(word);
            } else {
                // Key does not exist → create new list
                List<String> list = new ArrayList<>();
                list.add(word);
                map.put(key, list);
            }

        }

        // Return grouped anagrams
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }
}

