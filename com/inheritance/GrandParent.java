package com.inheritance;

public class GrandParent {
    protected int age;
    public String name;

    GrandParent(){
        System.out.println("GrandParent constructor calling...");
    }

    public void getAge() {
        System.out.println(age);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getName() {
        System.out.println(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sum(int a, int b){
        System.out.println(a+b);
    }

    public void about(){
        System.out.println("I'm the Grandfather");
    }
}
