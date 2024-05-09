package pieces;

public class King extends Piece {
    public King(String color) {
        super(color);
    }

    @Override
    public String getSymbol() {
        return super.getSymbol() + "K";
    }
}
