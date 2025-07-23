class Calculator {
    int add(int a, int b) {
        System.out.println("int,int");
        return a + b;
    }

    double add(double a, double b) {
        System.out.println("double,double");
        return a + b;
    }
}

public class overloading {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(12.3, 23));
        System.out.println(c.add(12.3, 3.0));
    }
}
