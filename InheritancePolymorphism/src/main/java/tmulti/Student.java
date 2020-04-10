package tmulti;

public class Student extends Person {
    int age=20;
    @Override
    public void show(){
        System.out.println("重写showmethod");
    }

    public void showage(){
        System.out.println("age is "+age);
    }
    public void showStudent(){
        System.out.println("student show method");
    }
}
