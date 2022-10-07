package com.company;

public class Tile {
    private Piece piece;
    private int row;
    private char col;
    private int coordinate;

    public Tile(Piece piece, int row, char col, int coordinate) {
        this.piece = piece;
        this.row = row;
        this.col = col;
        this.coordinate = coordinate;
    }

    public Piece getPiece() {
        return piece;
    }

    public int getRow() {
        return row;
    }

    public char getCol() {
        return col;
    }

    public int getCoordinate() {
        return coordinate;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

}
