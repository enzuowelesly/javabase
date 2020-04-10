package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionDemo {


    /*
    *Collection接口
    * 顶层共有方法and 使用底层的创建对象
    * add
    * remove
    * size
    * contains
    * isempty
    * clear
    * toArray

    * list接口
    * 有序的集合
    * 允许重复
    * 有索引，可以遍历
    * Vector
    * ArrayList
    * LinkList
    *
    *
    * Set接口
    * 不允许存储重复元素
    * 没有索引 不能遍历
    *treeset
    * hashset
    * linkedhashset  有序的集合
    * */
    public static void main(String[] args) {
        Collection<String> collection =new ArrayList<String>();
        System.out.println(collection);
        boolean boo= collection.add("daye");
        collection.add("small size");
        collection.add("big one");
        collection.add("big one");

        collection.add("beatiful girl");
        System.out.println(boo);
        System.out.println(collection);

         boolean booleand=collection.remove("big one");
        System.out.println(booleand);
        System.out.println(collection);

        boolean boocontains=collection.contains("small size");
        System.out.println(boocontains);
        System.out.println(collection);

        boolean booempty= collection.isEmpty();
        System.out.println(booempty);
        System.out.println(collection);
        int sizeint =collection.size();
        System.out.println(sizeint);

        Object[] arrays= collection.toArray();
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]);
        }
        collection.clear();
        System.out.println(collection);
        System.out.println(collection.isEmpty());
    }
}
