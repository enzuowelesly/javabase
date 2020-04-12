package collections;
/*
* Collections.addAll
* Collections.shuffle
* Collections.sort
*  sort 被排序的集合必须实现comparable 接口
*
* */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class UserCollections {
    public static void main(String[] args) {
        ArrayList<String> arrayList =new ArrayList<>();
        Collections.addAll(arrayList,"qqq","www","eeee","rrr","tttt");
        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);
        Collections.shuffle(arrayList);
        System.out.println(arrayList);

        System.out.println("===============");
        ArrayList<Person> persons= new ArrayList<>();
        Collections.addAll(persons,new Person("zhangsan",11),new Person("wangwu",11),new Person("lisi",11));
        System.out.println(persons);
        Collections.sort(persons);
        System.out.println(persons);

        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int result= o1.getAge()- o2.getAge();
                if (result==0){
                    result =o1.getName().charAt(0)-o2.getName().charAt(0);
                }
                return result;
            }
        });
        System.out.println(persons);
    }
}
