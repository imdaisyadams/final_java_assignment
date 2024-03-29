package game_week6;

public class Card {
    private int value;
    private String name;

    //getter method
    public String getName() {
        return this.name;
    }

    public int getValue() {
        return this.value;
    }

    //setter method
	public void setName(String name) {
        this.name = name;
	}
	
	public void setValue(int value) {
        this.value = value;
	}

    public void describe() {
        System.out.println(this.toString());
    }

    public String toString() {
        return getValue() + getName();
    }

    public Card(int value, String name) {
        this.value = value;
        this.name = name;
    }	
	   
}