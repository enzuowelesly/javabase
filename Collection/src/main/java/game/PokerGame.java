package game;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PokerGame {
    public static void main(String[] args) {
        ArrayList<String> pokertotal= new ArrayList<>();
        String[] colors={"♦","♣","♠","♥"};
        String[] numbers={"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        pokertotal.add("大王");
        pokertotal.add("小王");
        for (String number : numbers) {
            for (String color : colors) {
                pokertotal.add(color+number);
            }
        }
        Collections.shuffle(pokertotal);
        System.out.println(pokertotal);
        ArrayList<String> laowang=new ArrayList<>();
        ArrayList<String> laozhang=new ArrayList<>();
        ArrayList<String> laogao=new ArrayList<>();
        ArrayList<String> dipai=new ArrayList<>();
        for (int i = 0; i < pokertotal.size(); i++) {
            if (i>=51){
                dipai.add(pokertotal.get(i));
            }else if(i%3==0){
                laowang.add(pokertotal.get(i));
            }else if(i%3==1){
                laozhang.add(pokertotal.get(i));
            }else if (i%3==2){
                laogao.add(pokertotal.get(i));
            }
        }
        System.out.println(laowang);
        System.out.println(laozhang);
        System.out.println(laogao);
        System.out.println(dipai);
        for (int i = 0; i < 3; i++) {
            pokertotal.add("大王");
            pokertotal.add("小王");
            for (String number : numbers) {
                for (String color : colors) {
                    pokertotal.add(color+number);
                }
            }
        }
        System.out.println(pokertotal);
        System.out.println(pokertotal.size());
    }
}

