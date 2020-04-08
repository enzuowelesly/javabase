package tabstract;

import java.util.ArrayList;

public class RedPacket {
    public static void main(String[] args) {

        Manager manager=new Manager("dawang",100);
        ArrayList<Normer> users=new ArrayList<Normer>();
        Normer one = new Normer("小兵",0);
        Normer two = new Normer("小二兵",0);
        Normer three = new Normer("小三兵",0);
        Normer four = new Normer("小si兵",0);
        users.add(one);
        users.add(two);
        users.add(three);
        users.add(four);

        manager.show();
        one.show();
        two.show();
        three.show();
        four.show();
        System.out.println("===============");
        ArrayList<Integer> redList=manager.send(10,users.size());
        for (int i = 0; i < users.size(); i++) {
            users.get(i).getTotalMomey(redList);
        }
        manager.show();
        one.show();
        two.show();
        three.show();
        four.show();

    }
}
