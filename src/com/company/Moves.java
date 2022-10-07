package com.company;

public class Moves {

    private int[] king = new int[8];
    private int[] knight = new int[8];
    private int[] rook = new int[29];
    private int[] bishop = new int[29];
    private int[] pawn = new int[2];
    private int[] queen = new int[58];

    public Moves()
    {
        //king

        king[0] = -9;
        king[1] = -8;
        king[2] = -7;
        king[3] = -1;
        king[4] = 1;
        king[5] = 7;
        king[6] = 8;
        king[7] = 9;

        //bishop
        for(int k = -7; k < 8; k ++)
        {
            bishop[k+7] = k * 9;
        }

        for(int k = -7; k < 8; k ++)
        {
            bishop[14 + (k+7)] = k * 7;
        }

        //rook
        for(int k = -7; k < 8; k ++)
        {
            rook[k+7] = k;
        }

        for(int k = -7; k < 8; k ++)
        {
            rook[14 + (k+7)] = k * 8;
        }

        //queen

        for (int k = 0; k < 29; k++)
        {
            queen[k] = bishop[k];
        }
        for (int k = 0; k < 29; k++)
        {
            queen[k+29] = rook[k];
        }

        pawn[0] = 7;
        pawn[1] = 9;

        knight[0] = 17;
        knight[1] = 10;
        knight[2] = -6;
        knight[3] = -15;
        knight[4] = -17;
        knight[5] = -10;
        knight[6] = 6;
        knight[7] = 17;


    }

    public int[] getKing() {
        return king;
    }

    public int[] getQueen() {
        return queen;
    }

    public int[] getKnight() {
        return knight;
    }

    public int[] getRook() {
        return rook;
    }

    public int[] getBishop() {
        return bishop;
    }

    public int[] getPawn() {
        return pawn;
    }
}
