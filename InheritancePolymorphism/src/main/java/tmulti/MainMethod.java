package tmulti;
/*
1、父类引用指向子类对象
成员变量
直接访问成员变量，也是只能访问父类有的成员变量；
间接访问，同成员方法，看 new 没有向上查找
成员方法
只能访问父类有的方法；
运行的方法，看右边的 new 的对象， 子类有，则运行子类覆盖的方法，没有则向上查找

* */
public class MainMethod {
    public static void main(String[] args) {
        Person person =new Student();
        person.show();
        person.eat();
        System.out.println(person.age);

        System.out.println("=================");
        Student student =new Student();
        student.showStudent();
        student.show();

    }
}
