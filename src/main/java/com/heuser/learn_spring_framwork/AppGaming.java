package com.heuser.learn_spring_framwork;

import com.heuser.learn_spring_framwork.game.GameRunner;
import com.heuser.learn_spring_framwork.game.SuperContraGame;

public class AppGaming {

    public static void main(String[] args) {

        // Created a new 'marioGame' of the returned object type from MarioGame
        //var game = new MarioGame();
        var game = new SuperContraGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();


    }

}
