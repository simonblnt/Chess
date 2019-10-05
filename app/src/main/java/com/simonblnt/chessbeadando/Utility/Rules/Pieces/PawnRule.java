package com.simonblnt.chessbeadando.Utility.Rules.Pieces;

import com.simonblnt.chessbeadando.Entities.Board;

public class PawnRule extends PieceRule {
    @Override
    public boolean isValidMove(int xFrom, int yFrom, int xTo, int yTo, Board board){
        return false;
    }
}
