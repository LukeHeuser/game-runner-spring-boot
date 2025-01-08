package com.heuser.learn_spring_framwork;

import com.heuser.learn_spring_framwork.game.GameRunner;
import com.heuser.learn_spring_framwork.game.RideFive;

public class App01Gaming {

    public static void main(String[] args) {

        //var game = new MarioGame();
        //var game = new SuperContraGame();
        var game = new RideFive(); //1: Object Creation

        var gameRunner = new GameRunner(game);
            //2: Object Creation + Wiring of Dependency
            // Game is a Dependency of GameRunner

        gameRunner.run();

    }

}
