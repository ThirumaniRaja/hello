package homework;

import java.security.Key;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class charCount {
    public static void main(String[] args) {
        String charList = "ahabbyccych";
        getCharCount(charList);
    }
    public static void getCharCount(String value){
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for(Character ch : value.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            sb.append(entry.getKey()).append(entry.getValue());
        }
        System.out.println((sb));

    }

}
