import java.util.Random;
import java.util.Scanner;
import java.util.Random;
public class Project5NumberGuess {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        int guess;
        int attempts = 0;
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking a number Between 1 and 100.");
        System.out.println("Can you guess what it is");

        do{
            System.out.print("Enter your guess: ");
            guess = read.nextInt();
            attempts++;

            if(guess > randomNumber){
                System.out.println("Too high! Try again");
            }else if(guess < randomNumber){
                System.out.println("Too Low! Try again");
            }else{
                System.out.println("-----");
                System.out.println("Congratulations! you guessed the number " + randomNumber + " !");
                System.out.println("It took you " + attempts + " attempts.");
            }
        }while(guess != randomNumber);
        read.close();
    }
}
