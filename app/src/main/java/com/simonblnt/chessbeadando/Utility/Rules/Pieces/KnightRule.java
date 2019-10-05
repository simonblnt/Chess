package com.simonblnt.chessbeadando.Utility.Rules.Pieces;

import com.simonblnt.chessbeadando.Entities.Board;

public class KnightRule extends PieceRule {
    @Override
    public boolean isValidMove(int xFrom, int yFrom, int xTo, int yTo, Board board){
        return xTo - xFrom == -2 && yTo - yFrom == -1 ||
                xTo - xFrom == -2 && yTo - yFrom == 1 ||
                xTo - xFrom == -1 && yTo - yFrom == 2 ||
                xTo - xFrom == -1 && yTo - yFrom == -2 ||
                xTo - xFrom == 1 && yTo - yFrom == 2 ||
                xTo - xFrom == 2 && yTo - yFrom == 1 ||
                xTo - xFrom == 2 && yTo - yFrom == -1 ||
                xTo - xFrom == 1 && yTo - yFrom == -2;

    }
}
