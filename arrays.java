import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
//        int []ages = {20, 22, 18, 35, 48, 26, 87, 70};
//        System.out.println("List of Ages: ");
//        for(int age : ages){
//            System.out.print(age + " ");
//        }
//
//        int sum = 0, avg;
//        for(int age:ages){
//            sum += age;
//        }
//        avg = sum / ages.length;
//        System.out.println("\nSum of ages: " + sum);
//        System.out.println("Average of ages: " + avg);
//
//        int minAge = Integer.MAX_VALUE, maxAge = Integer.MIN_VALUE;
//        for(int age: ages){
//            if(minAge > age) minAge = age;
//            if(maxAge < age) maxAge =  age;
//        }
//        System.out.println("Min age: " + minAge);
//        System.out.println("Max age: " + maxAge);
        Scanner read = new Scanner(System.in);
        System.out.print("Number of players: ");
        int n = read.nextInt();
        int []scores = new int[n];

        for(int i=0; i<n; i++){
            System.out.printf("Enter the %d player Score: ",(i+1));
            scores[i] = read.nextInt();
        }

        System.out.print(" | ");
        for(int score : scores){
            System.out.print(score + " | ");
        }
    }
}
