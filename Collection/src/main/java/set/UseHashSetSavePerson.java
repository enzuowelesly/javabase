package set;

import java.util.HashSet;

public class UseHashSetSavePerson {
    public static void main(String[] args) {
        HashSet<Person> personHashSet =new HashSet<>();
        Person s1=new Person("q",10);
        Person s2=new Person("q",10);
        Person s3=new Person("Q",100);
        personHashSet.add(s1);
        personHashSet.add(s2);
        personHashSet.add(s3);
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(personHashSet);
    }
}
