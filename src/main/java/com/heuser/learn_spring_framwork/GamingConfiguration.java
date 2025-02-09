package com.heuser.learn_spring_framwork;

import com.heuser.learn_spring_framwork.game.GameConsole;
import com.heuser.learn_spring_framwork.game.GameRunner;
import com.heuser.learn_spring_framwork.game.RideFive;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    @Bean
    public GameConsole game() {
        return new RideFive();
    }

    @Bean
    public GameRunner gameRunner(GameConsole game) {
        return new GameRunner(game);
    }


//    //var game = new MarioGame();
//    //var game = new SuperContraGame();
//    var game = new RideFive(); //1: Object Creation
//
//    var gameRunner = new GameRunner(game);
//    //2: Object Creation + Wiring of Dependency
//    // Game is a Dependency of GameRunner
//
//    gameRunner.run();



}
