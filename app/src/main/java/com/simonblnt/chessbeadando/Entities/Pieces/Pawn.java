package com.simonblnt.chessbeadando.Entities.Pieces;

import com.simonblnt.chessbeadando.Enums.Color;

public class Pawn extends Piece {
    private boolean canMoveTwo;
    private boolean canBeCapturedEnPassant;

    public Pawn(Color color) {
        super(color);
    }

    public boolean isCanMoveTwo() {
        return canMoveTwo;
    }

    public void setCanMoveTwo(boolean canMoveTwo) {
        this.canMoveTwo = canMoveTwo;
    }

    public boolean isCanBeCapturedEnPassant() {
        return canBeCapturedEnPassant;
    }

    public void setCanBeCapturedEnPassant(boolean canBeCapturedEnPassant) {
        this.canBeCapturedEnPassant = canBeCapturedEnPassant;
    }
}
