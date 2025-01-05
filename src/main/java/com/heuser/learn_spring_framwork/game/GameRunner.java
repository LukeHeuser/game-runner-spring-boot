package com.heuser.learn_spring_framwork.game;

public class GameRunner {

    private GameConsole game;


    public GameRunner(GameConsole game){
        this.game = game;
    }

    public void run() {

        System.out.println("Running game: " + game);
        game.right();
        game.left();
        game.up();
        game.down();

    }
}
