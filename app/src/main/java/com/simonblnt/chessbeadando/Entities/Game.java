package com.simonblnt.chessbeadando.Entities;

import com.simonblnt.chessbeadando.Enums.Color;
import com.simonblnt.chessbeadando.Utility.Rules.GameRule;
import com.simonblnt.chessbeadando.Utility.Rules.Pieces.BishopRule;
import com.simonblnt.chessbeadando.Utility.Rules.Pieces.KingRule;
import com.simonblnt.chessbeadando.Utility.Rules.Pieces.KnightRule;
import com.simonblnt.chessbeadando.Utility.Rules.Pieces.PawnRule;
import com.simonblnt.chessbeadando.Utility.Rules.Pieces.PieceRule;
import com.simonblnt.chessbeadando.Utility.Rules.Pieces.QueenRule;
import com.simonblnt.chessbeadando.Utility.Rules.Pieces.RookRule;

import java.util.List;

public class Game {
    //Init
    private Board board;
    private List<Player> players;

    private GameRule gameRule;

    private PieceRule pawnRule;
    private PieceRule knightRule;
    private PieceRule bishopRule;
    private PieceRule queenRule;
    private PieceRule kingRule;
    private PieceRule rookRule;

    public Game(){
        board = new Board();
        players.add(new Player("Player 1", Color.WHITE));
        players.add(new Player("Player 2", Color.BLACK));

        gameRule = new GameRule();

        pawnRule = new PawnRule();
        knightRule = new KnightRule();
        bishopRule = new BishopRule();
        queenRule = new QueenRule();
        kingRule = new KingRule();
        rookRule = new RookRule();
    }


}
