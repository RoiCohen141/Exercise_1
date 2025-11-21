//Avia Atedgi 209253384  , Roi Cohen 206369993
package Exercise_1;

public class Character {

	private String name;
	private int health;
	private int level;

	public Character(){
		this.name = "Unknown";
		this.health = 0;
		this.level = 0;
	}
	public Character(String name , int health , int level) {
		this.name = name;

		if(health >10 || health < 0 ) 
			System.out.println("ERRORE : health must be between 0 to 10");
		else 
			this.health = health;
		

		if (level > 5 || level < 0)
			System.out.println("ERRORE : Level need to be between 0 to 5 ");
		else 
			this.level = level;

	}
	public String getName() {
		return name;
	}
	public int getHealth() {
		return health;
	}
	public int getLevel() {
		return level;
	}
	public void levelUp() {

		if (this.level < 5)
			this.level++;
		else 
			System.out.println("Maximum Level");
	}
	public void upHeal(int amount) {
		this.health += amount;

		if(health > 10)
			this.health = 10;
	}
	public String toString() {
		return "Name: " + name +
				"\nHealth: " + health + 
				"\nLevel: " + level +
				"\n";
	}
}
