public class Controller {
	
	public Controller(Player... players) {
		Game game = new Game(players);
		new GUI(game);
	}
	
	
}
