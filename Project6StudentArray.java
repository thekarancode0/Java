import java.util.Scanner;

public class Project6StudentArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] scores = new int[5];
        for(int i=0; i<5; i++){
            System.out.print("Enter the " + (i+1) + " student score: ");
            scores[i] = s.nextInt();
        }
        int avg = 0;
        System.out.println("Student Score");
        for(int score: scores){
            avg += score;
            System.out.print(score + " ");
        }

        System.out.println("\nAverage Score: " + (avg/scores.length));
    }
}
