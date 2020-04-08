package tabstract;

import java.util.ArrayList;
import java.util.Random;

public class Normer extends User {
    public Normer() {
    }

    public Normer(String name, int money) {
        super(name, money);
    }
    public void getTotalMomey(ArrayList<Integer> arrayList) {
        int index= new Random().nextInt(arrayList.size());
        int removeMoney =arrayList.remove(index);
        int money =super.getMoney();
        super.setMoney(money+removeMoney);

    }
}
