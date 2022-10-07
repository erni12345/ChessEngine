package com.company;

import java.util.ArrayList;

public class Player {

    private char color;
    private int points;
    private ArrayList<Piece> taken;

    public Player(char color) {
        this.color = color;
    }

    public char getColor() {
        return color;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void addPoints(int points)
    {
        this.points += points;
    }

    public void addPieceTaken(Piece piece)
    {
        taken.add(piece);
    }
}
