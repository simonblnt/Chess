package com.simonblnt.chessbeadando.Utility.Rules;

public class GameRule {
    private boolean gameOver;
    private boolean checkmate;
    private boolean stalemate;

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }

    public void setCheckmate(boolean checkmate) {
        this.checkmate = checkmate;
    }

    public void setStalemate(boolean stalemate) {
        this.stalemate = stalemate;
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public boolean isCheckmate() {
        return checkmate;
    }

    public boolean isStalemate() {
        return stalemate;
    }


}
