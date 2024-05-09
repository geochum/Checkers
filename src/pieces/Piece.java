package pieces;

public class Piece {
    private String color;
    private String symbol;

    public Piece(String color) {
        this.color = color;
        this.symbol = color.startsWith("B") ? "B" : "W";
    }

    public String getSymbol() {
        return symbol;
    }
}
