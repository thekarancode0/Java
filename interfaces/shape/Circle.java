package interfaces.shape;

public class Circle implements Drawable{
    private final double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public void draw(){
        System.out.println("Drawing a circle..");
        System.out.println("Radius: " + radius);
    }

    @Override
    public void findArea(){
        System.out.println("Area: " + (Math.PI * (radius*radius)));
    }
}
