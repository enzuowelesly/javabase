package tmulti;
/*
1、父类引用指向子类对象===编译看左边，运行看右边
成员变量
直接访问成员变量，也是只能访问父类有的成员变量；
间接访问，同成员方法，看 new 没有向上查找
成员方法
只能访问父类有的方法；
运行的方法，看右边的 new 的对象， 子类有，则运行子类覆盖的方法，没有则向上查找
2、对象的向上转型/对象的向下转型（instanceof）

* */
public class MainMethod {
    public static void main(String[] args) {
        Person person =new Student();

        System.out.println(person.age);
        System.out.println("=================");
        person.showage();
        System.out.println("=================");

//        person.showStudent();
        person.show();
        person.eat();
        System.out.println("=================");
        if ( person instanceof Student){
            Student student =(Student)person;
            student.showStudent();
            student.eat();
            student.show();
            student.showage();
        }


    }
}
