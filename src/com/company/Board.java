package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Board {
    private Tile[] board = new Tile[64];
    private Player p1;
    private Player p2;
    private boolean whiteCheck = false;
    private boolean blackCheck = false;

    HashMap<String, int[]> moves;


    public Board(Player p1, Player p2)
    {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void movePiece(int start, int end)
    {
        if(can_make_move(start, end))
        {
            Piece piece = board[start].getPiece();
            board[start].setPiece(null);

            if(board[end].getPiece() != null)
            {
                this.take_piece(end);
            }

            board[end].setPiece(piece);
            piece.movePiece(end);
        }
        update_pieces();
        boolean isCheck = check();
        if (isCheck)
        {
            Piece piece = board[end].getPiece();
            int color = piece.getColor();
            if (color == 1)
            {
                blackCheck = true;
                whiteCheck = false;
            }
            else {
                blackCheck = false;
                whiteCheck = true;
            }
        }




    }

    public void take_piece(int pos)
    {
        Piece piece = board[pos].getPiece();
        int type = piece.getColor();
        int amnt_points = piece.getNbPoints();

        if( type == 1)
        {
            p2.addPieceTaken(piece);
            p2.addPoints(amnt_points);
        }
        else {
            p1.addPieceTaken(piece);
            p1.addPoints(amnt_points);
        }



    }

    public boolean can_make_move(int start, int end)
    {
        boolean can = true;
        Piece piece = board[start].getPiece();



        return whiteCheck || blackCheck;

    }

    public boolean check()
    {
        for(int i = 0; i < 64; i++)
        {
            Piece piece = board[i].getPiece();


        }

        return false;
    }

    public void update_pieces()
    {
        for(int x = 0; x<64; x++)
        {
            Piece piece = board[x].getPiece();
            if (piece != null)
            {
                piece.update();
            }
        }
    }


}
