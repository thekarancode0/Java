import java.util.Scanner;

public class sumOfN {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = read.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            System.out.print(i);
            if (i != num) {
                System.out.print(" + ");
            }

            sum += i;
        }
        System.out.println(" = " + sum);
    }
}
