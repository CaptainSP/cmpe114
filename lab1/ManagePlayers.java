package labq1;

public class ManagePlayers {
	public static void main(String[] args) {
		Player player1, player2;

		// create player1 for Sally with 1000 elo

		player1 = new Player(1000, "Sally", 1);

		// create player2 for Joe with 500 elo

		player2 = new Player(500, "Joe", 2);

		// Joe loses 100 elo

		player2.decrease(100);

		// print Joe's new elo (use getelo())

		System.out.println("Joe's elo: " + player2.getelo());

		// Sally loses 50 elo

		player1.decrease(50);

		// print Sally's new elo (use getelo())

		System.out.println("Sally's elo: " + player1.getelo());

		// both accounts wins 1 game

		player1.win();
		player2.win();

		// change the player1's name to Joseph

		player1.changeName("Joseph");

		// print summary for both players

		System.out.println(player1.toString());
		System.out.println(player2.toString());

	}
}