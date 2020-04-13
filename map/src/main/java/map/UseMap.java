package map;

import java.util.HashMap;
import java.util.Map;

/*map集合
* key value 一一对应；key不允许重复
*
* hashmap
* 哈希表 查询快
* 无序
*put
* remove
* get
* contanisKey
* */
public class UseMap {
    public static void main(String[] args) {
    showMapOne();
    }
    public static void showMapOne(){
        Map<String,String> hashMap =new HashMap<String, String>();
        String aaa=hashMap.put("AAA","范冰冰");
        System.out.println(aaa);
        hashMap.put("BBB","范冰冰");
        hashMap.put("CCC","范冰冰");
       String string= hashMap.put("AAA","QQQQ");
        System.out.println(string);
        System.out.println(hashMap);

        String str =hashMap.remove("BBB");
        String stri=hashMap.remove("EEE");
        System.out.println(str);
        System.out.println(stri);
        System.out.println(hashMap);

        String str1=hashMap.get("AAA");
        System.out.println(str1);
        System.out.println(hashMap);

        Boolean boo1=hashMap.containsKey("AAA");
        System.out.println(boo1);
        Boolean boo11=hashMap.containsKey("WWW");
        System.out.println(boo11);
        Boolean boo12=hashMap.containsValue("AAA");
        System.out.println(boo12);
    }
}
