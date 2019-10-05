package com.simonblnt.chessbeadando.Utility.Rules.Pieces;

import com.simonblnt.chessbeadando.Entities.Board;

public class RookRule extends PieceRule {
    @Override
    public boolean isValidMove(int xFrom, int yFrom, int xTo, int yTo, Board board){
        return xTo - xFrom == 0 && yTo - yFrom != 0 || xTo - xFrom != 0 && yTo - yFrom == 0;
    }
}