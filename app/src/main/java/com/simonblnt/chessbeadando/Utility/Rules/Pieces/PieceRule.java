package com.simonblnt.chessbeadando.Utility.Rules.Pieces;

import com.simonblnt.chessbeadando.Entities.Board;

public abstract class PieceRule {
    abstract boolean isValidMove(int xFrom, int yFrom, int xTo, int yTo, Board board);
}
