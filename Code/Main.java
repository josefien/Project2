import java.awt.Color;
import java.awt.color.*;
public class Main {
	public static void main(String[] args){
		Player[] playerArray = new Player[6];
		int numberOfPlayers;
		boolean[] colorcheck = new boolean[6];
		String name;
		
		Player stef = new Player(Colors.COLOR1, "Stef");
		Player maartje = new Player(Colors.COLOR2, "Maartje");	
		Player sjors = new Player(Colors.COLOR3, "Sjors");	
		Player stef2 = new Player(Colors.COLOR4, "Stef");
		Player maartje2 = new Player(Colors.COLOR5, "Maartje");	
		Player sjors2 = new Player(Colors.COLOR6, "Sjors");	
		
		
		new Controller(stef, maartje, sjors, stef2, maartje2, sjors2);
	
		
		
	}
}
