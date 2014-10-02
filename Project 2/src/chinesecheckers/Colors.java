package chinesecheckers;
public enum Colors {
	COLOR1, COLOR2, COLOR3, COLOR4, COLOR5, COLOR6;

	public String toString() {
		if (this.equals(COLOR1))
			return "1";
		else if (this.equals(COLOR2))
			return "2";
		else if (this.equals(COLOR3))
			return "3";
		else if (this.equals(COLOR4))
			return "4";
		else if (this.equals(COLOR5))
			return "5";
		else if (this.equals(COLOR6))
			return "6";
		return "0";
	}
}
