package generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
* 泛型E
* 不使用泛型
* 不使用泛型 默认Object类型
* 弊端：不安全，容易出异常
* showNoGenerice    ClassCastException
*
*使用泛型
*只能add声明的类型
* */
public class GenericUse {
    public static void main(String[] args) {
//        showNoGenerice();
        showUserGenerice();

    }
    public static void  showUserGenerice(){
       Collection<String> collection =new ArrayList<>();
       collection.add("qqqq");
       collection.add("1");
      Iterator<String> iterator= collection.iterator();
      while (iterator.hasNext()){
          System.out.println(iterator.next());
      }

        System.out.println("======");
      for(String string:collection){
          System.out.println(string);
      }
    }
    public static void showNoGenerice(){
            Collection collection =new ArrayList();
            collection.add("123");
            collection.add(66666);
            for (Object o: collection) {
                System.out.println(o);
            }

            System.out.println("==========");
            Iterator iterator =collection.iterator();
            while (iterator.hasNext()){
                Object o= iterator.next();
                System.out.println(o);
                //
                String string =(String)o;
                System.out.println(string.length());
            }
        }


}
