package map;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SaveKey {
    public static void main(String[] args) {
    saveKey();
    }
    public static void saveKey(){
        Map<String,String> maps=new HashMap<String, String>();
        maps.put("AAA","啦啦");
        maps.put("BBB","哈哈");
        maps.put("CCC","哼哼");


        Set<String> stringSet =maps.keySet();

       Iterator<String> iterator= stringSet.iterator();
       while (iterator.hasNext()){
           iterator.next();
           System.out.println(iterator.next()+"="+maps.get(iterator.next()));
       }
        for (String string : stringSet) {
            System.out.println(string+"="+maps.get(string));
        }
    }
}
