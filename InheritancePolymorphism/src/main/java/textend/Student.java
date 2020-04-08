package textend;

/*
* superde
*
*
* */
public class Student extends Person {
    String sex;
    String name="成员变量";
    public Student(){
        //3、默认super();
        //、super调用父类构造方法
        super("zhangsan","M");
       // this("M");   this  和supper只能存在一个，at first
        System.out.println("子类构造方法");

    }
    public Student(String sex){
        this.sex=sex;
        System.out.println("sexc参数构造方法");
    }

    @Override
    public void show() {
        String name ="局部变量";
        //2、super调用父类方法
        super.show();
        //3、super调用父类成员变量
        System.out.println(super.name);
        System.out.println(name);
        //1\this.访问成员变量
        System.out.println(this.name);
        System.out.println(this.showthis());
        System.out.println("Student show方法");
        System.out.println();
    }
    public String showthis(){
        return  "通过this调用的方法";
    }
}
