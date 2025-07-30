package com.inheritance;

public class Child extends Parent{
    Child(){
        System.out.println("Child constructor calling...");
    }

    public void about(){
        System.out.println("I'm the child");
    }

}
