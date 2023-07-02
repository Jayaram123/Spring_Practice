package com.ram.learnspring;

import com.ram.learnspring.game.GamingConsole;
import com.ram.learnspring.game.MarioGame;

public class GameRunner {
    private GamingConsole game;
    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Running game : " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
