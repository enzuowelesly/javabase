package map;

import java.util.*;

public class PokerGame {
    public static void main(String[] args) {
        HashMap<Integer,String> pokerTotal =new HashMap<>();
        ArrayList<Integer> pokerIndex=new ArrayList<>();
        ArrayList<String> colors=new ArrayList<>();
        Collections.addAll(colors,"♦","♣","♠","♥");
        ArrayList<String> numbers=new ArrayList<>();
        Collections.addAll(numbers,"2","A","K","Q","J","10","9","8","7","6","5","4","3");
        Integer index=0;
        pokerTotal.put(index,"大王");
        pokerIndex.add(index);
        index++;
        pokerTotal.put(index,"小王");
        pokerIndex.add(index);
        index++;
        for (String number : numbers) {
            for (String color : colors) {
               pokerTotal.put(index,color+number);
               pokerIndex.add(index);
               index++;
            }
        }
        System.out.println(pokerIndex);
        System.out.println(pokerTotal);

        Collections.shuffle(pokerIndex);
        System.out.println(pokerIndex);
        ArrayList<Integer> laowang=new ArrayList<>();
        ArrayList<Integer> laozhang=new ArrayList<>();
        ArrayList<Integer> laogao=new ArrayList<>();
        ArrayList<Integer> dipai=new ArrayList<>();
        for (int i = 0; i < pokerIndex.size(); i++) {
            if (i>=51){
                dipai.add(pokerIndex.get(i));
            }else if (i%3==0){
                laowang.add(pokerIndex.get(i));
            }else if (i%3==1){
                laozhang.add(pokerIndex.get(i));
            }else if (i%3==2){
                laogao.add(pokerIndex.get(i));

            }

        }
        Collections.sort(laogao);
        Collections.sort(laowang);
        Collections.sort(laozhang);
        Collections.sort(dipai);
        showpoker("laowang",pokerTotal,laowang);
        showpoker("laozhang",pokerTotal,laozhang);
        showpoker("laogao",pokerTotal,laogao);
        showpoker("dipai",pokerTotal,dipai);

    }
    public static void showpoker(String name,HashMap<Integer,String> hashMap,ArrayList<Integer> arrayList){
        System.out.print("player="+name+"   ");
        for (Integer integer : arrayList) {
            String value =hashMap.get(integer);
            System.out.print(value+"  ");
        }
        System.out.println();

    }
}
