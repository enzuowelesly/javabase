package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapUse {
    public static void main(String[] args) {
         savehashmap();
        System.out.println("=========");
        saveLinkedHashmap();
    }
    public static void savehashmap(){
        HashMap<String,String> hashMap=new HashMap<>();
        hashMap.put("a","a");
        hashMap.put("b","b");
        hashMap.put("a","c");
        hashMap.put("d","d");
        hashMap.put("","123");
        Set<Map.Entry<String, String>> entries = hashMap.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry);
        }

    }
    public static void saveLinkedHashmap(){
        LinkedHashMap<String,String> hashMap=new LinkedHashMap<>();
        hashMap.put("a","a");
        hashMap.put("b","b");
        hashMap.put("a","c");
        hashMap.put("d","d");
        hashMap.put("","123");

        Set<Map.Entry<String, String>> entries = hashMap.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry);
        }
    }
}
