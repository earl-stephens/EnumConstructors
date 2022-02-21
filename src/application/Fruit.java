package application;

public enum Fruit {
	APPLE("green"), BANANA("yellow"), ORANGE("orange");
	//Constants have to be the first line in the enum
	//These constants are actually instances of the enum
	
	//constructor can't be public
	private String color;
	Fruit(String color) {
		this.color = color;
	}
	
	public String toString() {
		return super.toString().toLowerCase() + " (" + color + ")";
	}
}
