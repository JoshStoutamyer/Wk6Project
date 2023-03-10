package Wk6Project;

public class Card {
	
	private String name;
	private int value;
	
	Card(String name, int value) {
		this.name = name;
		this.value = value;
	}
	//Describe to print the values associated with the card called.
	public void describe() {
		System.out.println(this.name + "--" + this.value);
	}
	// getters and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}
