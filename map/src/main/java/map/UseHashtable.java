package map;

import com.sun.tools.corba.se.idl.StringGen;
/*
*  hashtable   key value都不能为null
* */
import java.util.*;

public class UseHashtable {
    public static void main(String[] args) {
        showhashmap();
        showhashtable();
    }
    public static void showhashmap(){
        HashMap<String,String> hashMap =new HashMap<>();
        hashMap.put("dfd","dfd");
        hashMap.put(null,null);
        Set<Map.Entry<String,String>> entries =hashMap.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    public static void showhashtable(){
        Hashtable<String,String> hashtable =new Hashtable<>();
        hashtable.put("","");
        hashtable.put("1","");
        Set<Map.Entry<String, String>> entries = hashtable.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry);
        }
    }
}
