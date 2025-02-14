package com.heuser.learn_spring_framwork;

import com.heuser.learn_spring_framwork.game.GameConsole;
import com.heuser.learn_spring_framwork.game.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.heuser.learn_spring_framwork.game")
@ComponentScan("com.heuser.learn_spring_framwork.game")
public class App03GamingSpringBeans {


    // The below beans shows what Spring is creating for us.
    // The above component scans is responsible for this implementation.
    // Each package is declared and the appropriate annotation
    // @Component is used at that package location

//    @Bean
//    public GameConsole game() {
//        var game = new RideFive();
//        return game;
//    }
//    @Bean
//    public GameRunner gameRunner(GameConsole game) {
//        System.out.println(game);
//        return new GameRunner(game);
//    }


    public static void main(String[] args) {

        var context =  new AnnotationConfigApplicationContext
                (App03GamingSpringBeans.class);

        context.getBean(GameConsole.class).up();


        context.getBean(GameRunner.class).run();

    }
}
