package main;

import javax.sound.midi.SysexMessage;

import pieces.*;

public class GameBoard {
    private static final int BOARD_SIZE = 8;
    private Piece[][] board;

    public GameBoard() {
        board = new Piece[BOARD_SIZE][BOARD_SIZE];
    }

    public void setupBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = (i % 2 == 0 ? 1 : 0); j < BOARD_SIZE; j += 2) {
                board[i][j] = new Piece("Black");
            }
        }
        for (int i = 5; i < BOARD_SIZE; i++) {
            for (int j = (i % 2 == 0 ? 1 : 0); j < BOARD_SIZE; j += 2) {
                board[i][j] = new Piece("White");
            }
        }
    }

    public void displayBoard() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                if (board[i][j] != null) {
                    System.out.print(board[i][j].getSymbol() + " ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }

    public boolean gameOver() {
        return false;
    }

    public void makeMove() {
        
    }
}