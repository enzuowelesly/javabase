package inner;
/*
一个类包含另外一个类

1、成员内部类
内用外随便使用，外用内需要定义对象
间接方式，外部类的方法new内部类
直接方式

2\成员变量的访问

==================
局部内部类
只有方法可以使用

         public   protected kong  private
外部类      Y          N       Y       N
成员内部类   Y         Y       Y       Y
局部内部类   N         N      N       N
* */
public class InnerClass {
    public static void main(String[] args) {
        Person person =new Person();
        person.setName("banban");
        person.getMoney();
        person.innerClass();

        System.out.println("===========");
    Person.Heart heart =new Person().new Heart();
    heart.boom();
    }
}
