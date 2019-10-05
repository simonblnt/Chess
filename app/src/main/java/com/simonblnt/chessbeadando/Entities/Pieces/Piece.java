package com.simonblnt.chessbeadando.Entities.Pieces;

import com.simonblnt.chessbeadando.Entities.Square;
import com.simonblnt.chessbeadando.Enums.Color;

public abstract class Piece {
    private final Color color;
    private Square currentSquare;
    private boolean onBoard;


    public Piece(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public Square getCurrentSquare() {
        return currentSquare;
    }

    public void setCurrentSquare(Square currentSquare) {
        this.currentSquare = currentSquare;
    }

    public boolean isOnBoard() {
        return onBoard;
    }

    public void setOnBoard(boolean onBoard) {
        this.onBoard = onBoard;
    }
}
