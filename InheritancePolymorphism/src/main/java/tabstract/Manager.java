package tabstract;

import java.util.ArrayList;

public class Manager extends User {
    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }
    public ArrayList<Integer>  send (int sendTotal,int count){
        ArrayList<Integer> arrayList =new ArrayList<Integer>();
        int haveTotal=super.getMoney();
        if (sendTotal>haveTotal){
            System.out.println("余额不足，不能发送");
            return arrayList;
        }
        super.setMoney(haveTotal-sendTotal);
        int avg =sendTotal / count;
        int sub=sendTotal % count;
        for (int i = 0; i < count-1; i++) {
            arrayList.add(avg);
        }
        arrayList.add(avg+sub);
        return arrayList;
    }
}
