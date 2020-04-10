package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
* Iterator接口
* hasNext()
* next()
*
*迭代器
*
* 增强for循环
*
* */
public class IteratorDemo {
    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<String>();
        collection.add("qqqq");
        collection.add("dddd");
        collection.add("eeee");
        Iterator<String> iteratorString = collection.iterator();
        while (iteratorString.hasNext()) {
            System.out.println(iteratorString.next());
        }
        System.out.println("============");
        for (String s:collection) {
            System.out.println(s);
        }


    }
}
