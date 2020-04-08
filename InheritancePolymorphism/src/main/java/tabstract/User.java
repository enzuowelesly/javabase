package tabstract;

public class User {
    String name;
    int money;

    public User() {
    }

    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }
    public  void show(){
        System.out.println("我的名字叫："+getName()+"======我的money："+getMoney());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

}
