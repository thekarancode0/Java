package com.game.rockpaperscissor;
import java.util.Random;
public class ComputerPlayer extends Player {
    public ComputerPlayer(String name){
        super(name);
    }

    @Override
    public void setMove(String ignored){
        String[] moves = {"rock","paper","scissor"};
        int index = new Random().nextInt(3);
        super.setMove(moves[index]);
    }
}
