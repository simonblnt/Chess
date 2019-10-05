package com.simonblnt.chessbeadando.Utility.Rules.Pieces;

import com.simonblnt.chessbeadando.Entities.Board;

public class QueenRule extends PieceRule {
    @Override
    public boolean isValidMove(int xFrom, int yFrom, int xTo, int yTo, Board board){
        if (xTo - xFrom == 0 && yTo - yFrom != 0 || xTo - xFrom != 0 && yTo - yFrom == 0)
            return true;
        else if (xTo - xFrom < 0 && yTo - yFrom < 0 || xTo - xFrom > 0 && yTo - yFrom > 0)
        {
            return xTo - xFrom == yTo - yFrom;
        }
        else if (xTo - xFrom < 0 && yTo - yFrom > 0){
            return (-1) * xTo - xFrom == yTo - yFrom;
        }
        else if (xTo - xFrom > 0 && yTo - yFrom < 0){
            return xTo - xFrom == (-1) * yTo - yFrom;
        }
        return false;
    }
}
