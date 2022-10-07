package com.company;

import java.util.ArrayList;

public class Piece {
    public String type;
    public int color;
    public ArrayList<Piece> piecesItCanTouch;
    public ArrayList<Integer> possibleMoves;
    public int position;
    public int nbPoints;


    public void movePiece(int new_pos)
    {
        this.position = new_pos;
    }

    public String getType() {
        return type;
    }

    public int getColor()
    {
        return color;
    }

    public ArrayList<Piece> getPiecesItCanTouch() {
        return piecesItCanTouch;
    }

    public ArrayList<Integer> getPossibleMoves() {
        return possibleMoves;
    }

    public int getPosition() {
        return position;
    }

    public int getNbPoints() {
        return nbPoints;
    }

    public void update()
    {
        return;
    }
}
