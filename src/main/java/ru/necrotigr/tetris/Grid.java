package ru.necrotigr.tetris;

/**
 * Created by Сергей on 12.04.2017.
 */
public class Grid {

    private int height;
    private int width;
    private int[][] filled;

    public Grid(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void removeFullLines() {

    }

    public boolean isGameOver() {
        return false;
    }



}
