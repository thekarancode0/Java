import java.util.Scanner;

public class ProjectTrafficLight {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the Color: ");
        String color = read.next();
        if(color.equals("red")){
            System.out.println("STOP");
        }else if(color.equals("green")){
            System.out.println("GO");
        }else if(color.equals("yellow")){
            System.out.println("Slow Down");
        }else{
            System.out.println("Invalid color!!!!");
        }
    }
}
