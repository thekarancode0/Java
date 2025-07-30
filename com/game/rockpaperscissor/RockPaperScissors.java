package com.game.rockpaperscissor;

import java.util.Scanner;
import com.Game;
public class RockPaperScissors extends Game {
    private HumanPlayer human;
    private ComputerPlayer computer;

    public RockPaperScissors(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you name: ");
        String name = sc.nextLine();
        human = new HumanPlayer(name);
        computer = new ComputerPlayer("computer");;
    }
    @Override
    public void startGame(){
        Scanner sc = new Scanner(System.in);
        String playAgain;

        do{
            System.out.println("\nChoose rock, paper, or scissor: ");
            String move = sc.nextLine();
            human.setMove(move);
            computer.setMove("");

            human.showResult();
            computer.showResult();

            String winner = decideWinner(human.getMove(), computer.getMove());
            if(winner.equals("draw")){
                human.showResult("It's a draw");
            }else if(winner.equals("human")){
                human.showResult("You win!");
            }else{
                computer.showResult("Computer wins!");
            }

            System.out.println("\nPlay again? (yes/no)");
            playAgain = sc.nextLine();
        }while (playAgain.equalsIgnoreCase("yes"));
    }

    private String decideWinner(String humanMove, String computerMove) {
        if (humanMove.equals(computerMove)) return "draw";

        if ((humanMove.equals("rock") && computerMove.equals("scissors")) ||
                (humanMove.equals("scissors") && computerMove.equals("paper")) ||
                (humanMove.equals("paper") && computerMove.equals("rock"))) {
            return "human";
        }
        return "computer";
    }

    public static void main(String[] args) {
        RockPaperScissors game = new RockPaperScissors();
        game.startGame();
    }
}
