package com.tanzi.anonymous;

public class Anonymous {
    public static void main(String[] args) {
        Person person =new Person();
        person.name="jiajia";
        person.showName();
        System.out.println("+++++++++++++++++=");
        new Person().name="enen";
        System.out.println(new Person().name="just one time");
    }
}
