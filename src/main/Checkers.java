package main;

public class Checkers {
    public static void main(String[] args) {
        GameBoard board = new GameBoard();
        board.setupBoard();
        board.displayBoard();

        while (!board.gameOver()) {
            board.makeMove();
            board.displayBoard();
        }
    }
}
