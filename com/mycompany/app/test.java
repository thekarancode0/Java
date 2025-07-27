package com.mycompany.app;

import com.mycompany.model.carClass;

public class test {
    public static void main(String[] args) {
        carClass c1 = new carClass("Toyata","Camry",2020);
        c1.displayInfo();
        c1.start();
        c1.drive();
    }
}
