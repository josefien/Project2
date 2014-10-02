import java.awt.Color;

public class Player {
	private Colors color;
	private String name;

	public Player(Colors color, String name) {
		this.color = color;
		this.name = name;
	}

	public Colors getColor() {
		return color;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
