package com.heuser.learn_spring_framwork;

import com.heuser.learn_spring_framwork.game.GameRunner;
import com.heuser.learn_spring_framwork.game.SuperContraGame;

public class AppGaming {

    public static void main(String[] args) {

        // Created a new 'marioGame' of the returned object type from MarioGame
        //var marioGame = new MarioGame();
        var superContraGame = new SuperContraGame();

        // Running the marioGame using the GameRunner
        var gameRunner = new GameRunner(superContraGame);
        gameRunner.run();


    }

}
