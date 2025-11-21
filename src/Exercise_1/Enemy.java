//Avia Atedgi 209253384  , Roi Cohen 206369993
package Exercise_1;

public class Enemy extends Character{

	private int damage;
	
	public Enemy(String name , int health , int level, int damage) {
		
		super(name,health,level);
		if(damage > 5 || damage < 1) {
			System.out.println("Error: input need to be between 1 to 5. ");
		}
		else {
		this.damage = damage;
		}
	}
	public int getDamage() {
		return damage;
	}
@Override
public String toString() {
	
	return super.toString() + "Damage: " + damage + " \n";
	
}

}
