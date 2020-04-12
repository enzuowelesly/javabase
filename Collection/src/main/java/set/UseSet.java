package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
*  不允许有重复
* 无索引，不能使用for取值
* 无序的，存取元素的顺序不同
* */
public class UseSet {
    public static void main(String[] args) {
        Set<String> stringSet  =new HashSet<>();
        stringSet.add("aaaa");
        stringSet.add("wwwww");
        stringSet.add("aaaa");
        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext()){
             String str=iterator.next();
            System.out.println(str);
        }
        for (String string : stringSet) {
            System.out.println(string);
        }
        System.out.println(stringSet.hashCode());
    }
}
