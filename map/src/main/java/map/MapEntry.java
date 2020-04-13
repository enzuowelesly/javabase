package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEntry {
    public static void main(String[] args) {
        getEntry();
    }
    public static void getEntry(){
        Map<String,Integer> integerMap=new HashMap<String, Integer>();
        integerMap.put("AAAA",123);
        integerMap.put("BBBB",234);
        integerMap.put("CCCC",345);
        System.out.println(integerMap);
        Set<Map.Entry<String, Integer>> entries = integerMap.entrySet();
        System.out.println(entries);

         Iterator<Map.Entry<String, Integer>> iterator= entries.iterator();
         while (iterator.hasNext()){
             System.out.println(iterator.next());
         }

        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry);
        }
    }
}
