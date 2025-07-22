import java.util.Scanner;

public class classObject {
    public static class Student{
        int roll;
        String name;
        int[]marks = new int[3];

        void setDetail(){
            Scanner read = new Scanner(System.in);
            System.out.print("Enter your roll: ");
            roll = read.nextInt();
            read.nextLine();
            System.out.print("Enter your name: ");
            name = read.nextLine();

            System.out.println("Enter the marks----");
            for(int i=0; i<3; i++){
                System.out.print("Enter marks " + (i+1) + ": ");
                marks[i] = read.nextInt();
            }
        }

        void displayDetail(){
            System.out.println("Student roll: " + roll);
            System.out.println("Student Name: " + name);
            for(int i=0; i<3; i++){
                System.out.print(" | Marks " + (i+1) + ": " + marks[i] +" | ");
            }
        }
    }

    public static void main(String[] args) {
        Student s1  = new Student();
        Student s2 = new Student();
        s1.setDetail();
        s2.setDetail();
        System.out.println("\n\n\n\n\n\n");
        s1.displayDetail();
        System.out.println("\n-----------------------\n");
        s2.displayDetail();
    }
}
