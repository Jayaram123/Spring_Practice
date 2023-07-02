package com.ram.learnspring.game;

public class MarioGame implements GamingConsole {

    public void up() {
        System.out.println("Running game: UP");
    }

    public void down() {
        System.out.println("Running game: DOWN");
    }

    public void left() {
        System.out.println("Running game: LEFT");
    }

    public void right() {
        System.out.println("Running game: RIGHT");
    }
}
