package com.heuser.learn_spring_framwork;

import com.heuser.learn_spring_framwork.game.GameConsole;
import com.heuser.learn_spring_framwork.game.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {

    public static void main(String[] args) {

        var context =  new AnnotationConfigApplicationContext
                (GamingConfiguration.class);

        context.getBean(GameConsole.class).up();


        context.getBean(GameRunner.class).run();

    }
}
