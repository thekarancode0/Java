import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = read.nextInt();
        int fact = 1, i = 1;
        while(i<=num){
            fact *= i;
            i++;
        }
        System.out.printf("The factorial of %d is %d",num,fact);

    }
}
