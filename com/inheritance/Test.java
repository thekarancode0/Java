package com.inheritance;

public class Test {
    public static void main(String[] args) {
        Child c = new Child();
        c.sum(12,22);
        c.about();
        Parent p = new Parent();
        p.about();
    }
}
