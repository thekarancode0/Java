package com.game.rockpaperscissor;

import java.util.Scanner;

public class HumanPlayer extends Player {
    public HumanPlayer(String name) {
        super(name);
    }

    @Override
    public void setMove(String move){
        if(move.equalsIgnoreCase("rock") ||
        move.equalsIgnoreCase("paper") ||
        move.equalsIgnoreCase("scissor")){
            super.setMove(move.toLowerCase());
        }else{
            System.out.println("Invalid move. Try again");
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter rock, paper, or scissor: ");
            setMove(sc.nextLine());
        }
    }
}
