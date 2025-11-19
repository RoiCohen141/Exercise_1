package Exercise_1;

public class mainGame {

	public static void main(String[] args) {
	
		Item item1 = new Item();
		Item item2 = new Item("Knife",10 ,false);
		Item item3 = new Item("Sword",20 ,true);
		
		/*System.out.println(item1.toString());
		System.out.println(item2.toString());
		System.out.println(item3.toString());
		*/
		Player player1 = new Player("Avi" , 10 , 1);
		Player player2 = new Player("Drake" , 10 , 1);
		
		//System.out.println(player1.toString());
		//System.out.println(player2.toString());
		player1.addItem(item3);
		player2.addItem(item1);
		player2.addItem(item2);
		
		//System.out.println(player1.toString());
		//System.out.println(player2.toString());
		
		Enemy enemy1 = new Enemy("Amit", 8 , 4 ,3);
		//System.out.println(enemy1.toString());
		
		Player [] players = {player1 , player2};
		Enemy[] enemies = {enemy1};
		GameWorld game1 = new GameWorld("Sapir",players, enemies , 3);
		game1.printAllPlayers();
		
		System.out.println(player1.getName()+ " : " + player1.calculateInventoryValue());
		System.out.println(player2.getName() +" : "+player2.calculateInventoryValue());
	}

}
