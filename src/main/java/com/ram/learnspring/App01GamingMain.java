package com.ram.learnspring;

import com.ram.learnspring.game.ContraGame;
import com.ram.learnspring.game.GamingConfiguration;
import com.ram.learnspring.game.MarioGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App01GamingMain {
    public static void main(String[] args) {

       var context=  new AnnotationConfigApplicationContext(GamingConfiguration.class);

        var marioGame = new MarioGame();

        var superContraGame = new ContraGame();
        var gameRunner = new GameRunner(marioGame);

        gameRunner.run();

    }
}
