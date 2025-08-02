package interfaces.shape;

public class Rectangle implements Drawable{
    private final int width;
    private final int length;

    public Rectangle(int width, int length){
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw(){
        System.out.println("Drawing a rectangle");
        System.out.println("Width: " + width + " | " + "Length: " + length);
    }

    @Override
    public void findArea(){
        System.out.println("Area: " + (length*width));
    }
}
