package inner;

public class Person {
    private String name;
    private int age=10;

    public void innerClass(){
        class Inner{
            int num =10;
            void show(){
                System.out.println("Inner showMethod");
            }
        }
        Inner inner =new Inner();
        inner.show();
    }

    public void getMoney(){
        System.out.println("get money ");
        new Heart().boom();
    }
    public  class Heart{
        private int  age=20;
        public void boom(){
            int  age=30;

            System.out.println("my heart is healthy");
            System.out.println("my name is "+ name);
            System.out.println(age);
            System.out.println(this.age);
            System.out.println(Person.this.age);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
