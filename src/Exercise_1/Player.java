package Exercise_1;

public class Player extends Character{

	private Item [] inventory ;

	public Player (String name, int health , int level) {

		super(name,health,level);

		this.inventory = new Item [0];


	}
	public Player (String name, int health , int level, Item [] inventory) {

		super(name,health,level);

		if (inventory == null ) {
			this.inventory = new Item [0];
		}
		else {
			this.inventory = new Item [inventory.length];// יוצר מערך חדש של הפניות ומצביע לאותם מקומות בזיכרון כמו המערך המועתק. 		

			System.arraycopy(inventory, 0, this.inventory, 0, inventory.length);
		}
	}
	public void addItem (Item item ) {
		Item [] newArray = new Item [inventory.length+1];

		System.arraycopy(inventory, 0, newArray, 0, inventory.length);
		newArray [inventory.length] = item ;
		this.inventory = newArray;

	}
	public int calculateInventoryValue() {
		int count = 0 ;
		for (Item item : inventory) {
			count += item.getValue();
		}
		return count;
	}
	public boolean hasMagicalItem() {
		for (Item item : inventory) {
			if(item.isMagical()) {
				return true;
			}

		}
		return false;
	}
	@Override
	public String toString() {
		StringBuilder inv = new StringBuilder();
		inv.append("Inventory : ");
		if ( inventory.length ==0) {
			inv.append("Empty\n");
		}
		else {
			for(Item item : inventory) {
				inv.append(item.getName()).append(" | ");
			}
		}

		return super.toString() +inv;

	}
}