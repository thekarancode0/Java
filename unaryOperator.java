public class unaryOperator {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        int result = a++ + --b + b++ + ++a + a--; //5+9+9+7+7 = 37

        System.out.println("Final value of a: " + a); //6
        System.out.println("Final value of b: " + b); //10
        System.out.println("Result: " + result);


//        int a = 10;
//        int b = 20;
//        System.out.println(++a);
//        b = a+b;
//        System.out.println(b);
    }
}
