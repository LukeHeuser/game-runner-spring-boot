package com.heuser.learn_spring_framwork.game;

public interface GameConsole {

    // This Game Console interface allows us to losely couple our "GameRunner" with
    // our different `games`

    void up();
    void down();
    void left();
    void right();



}
