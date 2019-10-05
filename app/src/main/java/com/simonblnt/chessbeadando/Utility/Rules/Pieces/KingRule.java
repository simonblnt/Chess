package com.simonblnt.chessbeadando.Utility.Rules.Pieces;

import com.simonblnt.chessbeadando.Entities.Board;

public class KingRule extends PieceRule {
    @Override
    public boolean isValidMove(int xFrom, int yFrom, int xTo, int yTo, Board board){
        return xTo - xFrom == -1 && yTo - yFrom == -1 ||
                xTo - xFrom == -1 && yTo - yFrom == 0 ||
                xTo - xFrom == -1 && yTo - yFrom == 1 ||
                xTo - xFrom == 0 && yTo - yFrom == -1 ||
                xTo - xFrom == 0 && yTo - yFrom == -1 ||
                xTo - xFrom == 1 && yTo - yFrom == -1 ||
                xTo - xFrom == 1 && yTo - yFrom == 0 ||
                xTo - xFrom == 1 && yTo - yFrom == 1;
    }
}