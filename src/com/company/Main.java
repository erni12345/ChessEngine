package com.company;

public class Main {

    public static void main(String[] args) {

        Moves moves = new Moves();
        int[] king = moves.getBishop();

        for (int i = 0; i < king.length; i++)
        {
            System.out.println(king[i]);
        }
    }
}
