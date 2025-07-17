public class typeCasting {
    public static void main(String[] args) {
        //implicit
        int a = 10;
        double b = a;
        System.out.println(a);
        System.out.println(b);

        //explicit
        double d = 10.23;
        int i = (int) d;
        System.out.println(d);
        System.out.println(i);

        char c = 'a';
        int ci = c;
        System.out.println("Char: " + c);
        System.out.println("Integer: " + ci);
    }
}
