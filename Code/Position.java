public class Position {

	private int x, y;
	Piece piece;

	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public boolean isEmpty() {
		return piece == null;
	}

	public Piece getPiece() {
		return piece;
	}

	public void setPiece(Piece piece) {
		this.piece = piece;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public String toString() {
		if (piece == null)
			return "0";
		return piece.toString();
	}
}
