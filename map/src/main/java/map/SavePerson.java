package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SavePerson {
    public static void main(String[] args) {
        saveForValue();
        System.out.println("===================");
        saveForKey();
    }
    public static void saveForValue(){
        Map<String,Person> personMap =new HashMap<String, Person>();
        personMap.put("上海",new Person("zhang",12));
        personMap.put("北京",new Person("wang",22));
        personMap.put("四川",new Person("zhao",32));
        personMap.put("上海",new Person("su",11));

        Set<Map.Entry<String, Person>> entries = personMap.entrySet();

        for (Map.Entry<String, Person> entry : entries) {
            System.out.println(entry);
        }
    }
    public static void saveForKey(){
        Map<Person,String> stringMap= new HashMap<Person, String>();
        stringMap.put(new Person("zhang",12),"北京");
        stringMap.put(new Person("wang",23),"四川");
        stringMap.put(new Person("zhao",23),"武汉");
        stringMap.put(new Person("zhang",12),"上海");
        Set<Map.Entry<Person, String>> entries = stringMap.entrySet();
        Iterator<Map.Entry<Person, String>> iterator=entries.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }}
