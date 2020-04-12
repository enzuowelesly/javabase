package list;

import com.sun.media.jfxmediaimpl.HostUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
* list接口的特点
* 有序的集合
* 有索引
* 允许重复
* */
public class UseList {
    public static void main(String[] args) {
        List<String> list =new ArrayList<>();
        list.add("qqqqq");
        list.add("wwwww");
        list.add("aaaaa");
        list.add("ttttt");
        list.add("ttttt");
        System.out.println(list);


        list.add(3,"rrrrr");
        System.out.println(list);

        String remove= list.remove(1);
        System.out.println(list);
        System.out.println(remove);

        list.set(0,"QQQQQ");
        System.out.println(list);

        System.out.println("===========");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
                 }

        System.out.println("===========");
       Iterator<String> iterator= list.iterator();
       while (iterator.hasNext()){
           System.out.println(iterator.next());
       }
        System.out.println("===========");
        for (String str : list) {
            System.out.println(str);
        }
    }
}
