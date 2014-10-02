import java.util.ArrayList;

public class Game {

	private Player current;
	private Player[] players;
	private Board board;

	public Game(Player... players) {
		this.players = players;
		board = new Board();
		board.setInitialPositions(players);
		board.printBoard();
	}

	public boolean movePiece(Position from, Position to) {
		//return board.movePiece(from, to);
            return false;
	}

	public Position[] getPossibleMove(Position from) {
		return null;
	}

	public boolean gameOver() {
		return false;
	}

}
