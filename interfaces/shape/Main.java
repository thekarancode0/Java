package interfaces.shape;

public class Main {
    public static void main(String[] args) {
        Drawable circle = new Circle(12.4);
        Drawable rectangle = new Rectangle(10,10);

        circle.draw();
        circle.findArea();
        System.out.println("________________________");
        rectangle.draw();
        rectangle.findArea();
    }
}
