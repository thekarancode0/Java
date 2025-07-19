import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner read  = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = read.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(num + " * " + i  + " = " + num*i);
        }
    }
}
