package polymorphism.core;

class Calculator{
    public int sum(int a, int b){
        return a+b;
    }

    public int sum(int a, int b, int c){
        return a+b+c;
    }

    public double sum(double a, double b){
        return a+b;
    }

    public String sum(String a, int b){
        return a+b;
    }

}

public class overLoading {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.sum(12,11));
        System.out.println(c.sum(1,2,3));
        System.out.println(c.sum(12.5, 10.5));
        System.out.println(c.sum("karan",21));

    }
}
