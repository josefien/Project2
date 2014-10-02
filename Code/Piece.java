public class Piece {
	Colors color;
	Position position;

	public Piece(Colors color) {
		this.color = color;

	}

	// TODO complete method to check whether the pieces are next to each other
	public boolean nextTo(Piece piece1, Piece piece2) {
		// i think we don't need this method 
		return false;

	}

	public Position getPosition() {
		return position;
	}

	public Colors getColor() {
		return color;
	}

	public String toString() {
		return color.toString();
	}
}
