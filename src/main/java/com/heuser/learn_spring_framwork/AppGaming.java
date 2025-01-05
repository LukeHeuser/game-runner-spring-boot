package com.heuser.learn_spring_framwork;

import com.heuser.learn_spring_framwork.game.GameRunner;
import com.heuser.learn_spring_framwork.game.RideFive;

public class AppGaming {

    public static void main(String[] args) {


        //var game = new MarioGame();
        //var game = new SuperContraGame();
        var game = new RideFive();

        var gameRunner = new GameRunner(game);
        gameRunner.run();


    }

}
