package generic;

import java.util.ArrayList;
import java.util.Iterator;
/*
* 泛型的通配符 ？
* 只能在传参数的时候使用，不能在创建类的时候使用*/
public class GenericUnknown {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList =new ArrayList<>();
        arrayList.add(12);
        arrayList.add(33);
        arrayList.add(44);
        ArrayList<String> arrayList1 =new ArrayList<>();
        arrayList1.add("qwwww") ;
        arrayList1.add("rrrr");
        arrayList1.add("ffff");
        printArray(arrayList);
        printArray(arrayList1);

    }
    public  static  void printArray(ArrayList<?> arrayList){
        Iterator<?> iterator =arrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
