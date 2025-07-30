package com.game.rockpaperscissor;

public class Player {
    private String name;
    private String move;

    public Player(String name){
        this.name = name;
    }
    public String getMove(){
        return move;
    }
    public void setMove(String move){
        this.move = move;
    }
    public String getName(){
        return name;
    }

    public void showResult(String result){
        System.out.println(name + ": " + result);
    }
    public void showResult(){
        System.out.println(name + " played: " + move);
    }
}
