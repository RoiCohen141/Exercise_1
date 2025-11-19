package Exercise_1;

public class Item {

	private String name;
	private int value;
	boolean isMagical;

	public Item() {
		name = "Unknown";
		value = 0;
		isMagical = false;

	}
	public Item(String name, int value, boolean isMagical) {
		this.name = name;
		this.value = value;
		this.isMagical = isMagical;

	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		if (value <= 0) 
			this.value = 0;
		else
			this.value = value;
	}
	public boolean isMagical() {
		return isMagical;
	}
	public String getName(){
		return name;
	}
	public String toString() {
		String flag;

		if(isMagical) {
			flag = "Magical Item";
		}		
		else {
			flag = "Not Magical item ";
		}

		return "Name: " + name +	
				"\nValue:" + value + 
				"\n" + flag +
				"\n";



	}

}