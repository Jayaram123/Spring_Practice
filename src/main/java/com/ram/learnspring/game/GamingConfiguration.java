package com.ram.learnspring.game;

import com.ram.learnspring.GameRunner;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    @Bean
    @Qualifier("contraGame")
    public GamingConsole contraGame() {
        return new ContraGame();
    }

    @Bean
    @Qualifier("marioGame")
    public GamingConsole marioGame() {
        return new MarioGame();
    }

    @Bean
    public GameRunner gameRunner( @Qualifier("marioGame") GamingConsole gamingConsole) {
        return new GameRunner( gamingConsole);
    }
}
