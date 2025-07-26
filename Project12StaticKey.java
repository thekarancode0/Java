class Counter{
    //instance variables
    int num=100;
    String name;

    //static variable
    static String location;

    //static block
    static {
        System.out.println("Hello and Welcome");
    }

    //Static method
    static void sum(){
        //Can't access not-static;
        //System.out.println(num);
        Counter c = new Counter();
        System.out.println(c.num);
    }

    static int count = 0;
    public Counter(){
        count++;
        System.out.println("Object created: " + count);
    }

}
public class Project12StaticKey {

    public static void main(String[] args) {
        Counter p1 = new Counter();
        Counter p2 = new Counter();
        Counter p3 = new Counter();
        Counter.sum();
    }
}
