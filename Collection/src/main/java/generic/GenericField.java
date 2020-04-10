package generic;

import java.util.ArrayList;
import java.util.Collection;

/*
* f泛型的上限限定  ？ extends E  只能是E的子类或者本身
* 下限限定   ？ super E 只能是E的父类或者本身
* */
public class GenericField {
    public static void main(String[] args) {
        Collection<Integer> array1=new ArrayList<>();
        Collection<String> arrays2=new ArrayList<>();
        Collection<Number> array3=new ArrayList<>();
        Collection<Object> array4 =new ArrayList<>();

        getUpField(array1);
        //getUpField(arrays2);
        getUpField(array3);
        //getUpField(array4);


        //getDownField(array1);
        //getDownField(arrays2);
        getDownField(array3);
        getDownField(array4);
    }

    public static void getUpField(Collection< ? extends Number> array){

    }
    public static void getDownField(Collection<? super Number> array ){}
}
