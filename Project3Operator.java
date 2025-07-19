public class Project3Operator {
    public static void rectangle() {
        int length = 10;
        int width = 7;
        System.out.println((length % 2 == 0) ? "length is even" : "length is odd");
        System.out.println((width % 2 == 0) ? "width is even" : "width is odd");

        System.out.println("Area of rectangle: " + (length * width));
        System.out.println("Perimeter of rectangle: " + (2 * (length + width)));
    }
    public static void interest(){
        int p  = 20000;
        int r = 4;
        int t = 3;
        System.out.println("Simple Interest: "+ ((p*r*t)/100));
    }
    public static void main(String[] args) {
        rectangle();
        interest();
    }
}
