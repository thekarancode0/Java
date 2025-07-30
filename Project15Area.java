
class Shape{
    public void CalculateArea(){
        System.out.println("Calculating Area..");
    }
}

class Circle extends Shape{
    int radius;
    Circle(int radius){
        this.radius = radius;
    }
    @Override
    public void CalculateArea(){
        double area =  Math.PI * (radius * radius);
        System.out.println("Area of circle of radius " + radius + " : " + area);
    }
}

class Rectangle extends Shape{
    private final int length, width;
    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }
    @Override
    public void CalculateArea(){
        int area = length * width;
        System.out.println("Area of Rectangle having");
        System.out.println("Length: " + length + " and Width: " + width + " is " + area);
    }
}

public class Project15Area {
    public static void main(String[] args) {
//        Shape s = new Circle(5);
//        s.CalculateArea();
//
//        Shape r = new Rectangle(10,22);
//        r.CalculateArea();
          Shape []shape = new Shape[2];
          shape[0] = new Rectangle(12,10);
          shape[1] = new Circle(10);

          shape[0].CalculateArea();
          shape[1].CalculateArea();
    }
}
