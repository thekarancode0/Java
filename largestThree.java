public class largestThree {
    public static void main(String[] args) {
//        int a = 20, b = 30, c = 40;
        int a = 30, b = 30, c = 30;
//        int a = 60, b = 30, c = 22;
//        int a = 10, b = 10, c = 2;


        if(a > b && a > c) System.out.println(a + " is greater");
        else if(a==b && a > c) System.out.printf("%d and %d are equal and %d is smaller",a,b,c);
        else if(a==c && a > b) System.out.printf("%d and %d are equal and %d is smaller",a,c,b);
        else if(b==c && b > a) System.out.printf("%d and %d are equal and %d is smaller",b,c,a);
        else if(b > a && b > c) System.out.println(b + " is greater");
        else if(a < c && b < c) System.out.println(c + " is greater");
        else System.out.println("All are equals");
    }
}
