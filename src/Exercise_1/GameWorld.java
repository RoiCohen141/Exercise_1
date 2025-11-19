package Exercise_1;

public class GameWorld {

	private String name;
	private Player [] players;
	private Enemy [] enemies;
	private int difficulty;

	public GameWorld() {
		name = "Crystalpath";
		difficulty = 1;
		players = new Player[0];
		enemies = new Enemy[0];

	}
	public GameWorld(String name,Player []players , Enemy []enemies , int difficulty) {
		this.name = name ;

		if(difficulty >3 || difficulty < 1) {
			System.out.println("Error: difficulty need to be between 1 to 3.");
		}
		else {
			this.difficulty = difficulty;
		}
		if(players == null) {
			this.players = new Player[0];
		}
		else {
			this.players = new Player [players.length];
			System.arraycopy(players, 0, this.players, 0, players.length);
		}
		if(enemies == null ) {
			this.enemies = new Enemy[0];
		}
		else {
			this.enemies = new Enemy[enemies.length];
			System.arraycopy(enemies,0, this.enemies, 0 , enemies.length);
		}
	}
	public void addPlayer(Player player) {
		Player [] newPlayers = new Player[players.length+1];
		System.arraycopy(players, 0, newPlayers, 0, players.length);
		newPlayers[players.length+1] = player;
		this.players = newPlayers;
	}
	public void printAllPlayers() {
		if(players == null) {
			System.out.println("There are no players in the world");
		}
		else {


			for (int i = 0 ; i < players.length ; i++) {
				System.out.println("-------Player "+ (i+1) +"-------");
				System.out.println(players[i].toString()+ "\n");

			}
			for (int i = 0 ; i < enemies.length ; i++) {
				System.out.println("-------Player "+ (i+1+players.length )+"-------");
				System.out.println(enemies[i].toString());

			}
			System.out.println("------------------");
		}
	}
	public int getTotalValueOfWorled() {
		int countOfValue= 0;
		for ( Player play: players ) {
			countOfValue += play.calculateInventoryValue();
		}
		return countOfValue;
	}
	public String toString() {
		int count =(players.length)+(enemies.length);

		return "World Name: " + this.name + " \n"+
		"Difficult: " + this.difficulty + "\n"+
		"Number of players: " + count +"\n";
	}
}
