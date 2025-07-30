class Parent {
    void show1(){
        System.out.println("From Parent");
    }

    void overrideMethod(){
        System.out.println("Parent class");
    }
}

class Child extends Parent {
    void show2(){
        System.out.println("From child");
    }

    @Override
    void overrideMethod(){
        System.out.println("Child class");
    }
}

//Parent p = new Child() ---> p(obj) is Child object with Parent reference;
//Only access the Parent class object ---> obj reference Object
//Can access overriding methods from child class
//UPCASTING: Child Object + Parent Reference

//Child c = new Child() --> c(obj) is child object with child reference;
//Can access all object from both Parent and Child class


//Downcasting is when you convert a reference of a Parent class to a Child class type.

public class Casting {
    public static void main(String[] args) {
//        Parent p = new Child();
//        p.show1();

//        Child c = new Child();
//        c.show2();
//        c.show1();

       // Parent p = new Child();
       // p.show1();
      //  ((Child) p).show2();  //you're telling Java to treat p as a Child

        Parent p = new Child();
        p.overrideMethod();

        Child c = (Child) p;
        c.overrideMethod();

        Parent q = new Parent();
        q.overrideMethod();
    }
}
