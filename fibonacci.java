import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int term = read.nextInt();
        int first = 1, second = 1;
        System.out.print(first + " ");
        System.out.print(second + " ");
        for(int i=3; i<=term; i++){
            int third = first+second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }
    }
}
