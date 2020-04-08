package textend;

public class Person {
    String name ="父类成员变量";
    String sex;

    public Person() {
        System.out.println("无参数person类构造方法");
    }

    public Person(String name, String sex) {
        this.name = name;
        this.sex = sex;
        System.out.println("全参数person构造方法");
    }
    public void show(){
        System.out.println("Personshow方法");
    }
}
