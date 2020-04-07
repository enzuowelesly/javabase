package com.tanzi.statics;

public class Student {
    private int id;
    private String name;
    private int age;
    static  String room ;
    private  static int idCounter =0;
    static {
        System.out.println("静态方法");
    }

    public Student() {
    }

    public Student(String name, int age) {

        this.name = name;
        this.age = age;
        this.id=++idCounter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static String getRoom() {
        return room;
    }

    public static void setRoom(String room) {
        Student.room = room;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        Student.idCounter = idCounter;
    }
}
