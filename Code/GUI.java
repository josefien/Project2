import java.awt.Color;

public class GUI {
	Color color;
	Game game;

	public GUI(Game game) {
		// TODO Auto-generated constructor stub
	}

	public void userClickedOnSomething() {
		// this is what we calculate using our GUI (and what the user clicks)
		game.movePiece(new Position(1, 1), new Position(2, 2));

	}

	public void setColor(Color color) {

		if (color.equals(Colors.COLOR1)) {
			this.color = Color.CYAN;
		} else if (color.equals(Colors.COLOR2)) {
			this.color = Color.BLACK;
		} else if (color.equals(Colors.COLOR3)) {
			this.color = Color.PINK;
		} else if (color.equals(Colors.COLOR4)) {
			this.color = Color.LIGHT_GRAY;
		} else if (color.equals(Colors.COLOR5)) {
			this.color = Color.ORANGE;
		} else if (color.equals(Colors.COLOR6)) {
			this.color = Color.GREEN;
		}
	}

}
