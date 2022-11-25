import java.util.Random;

public class Account {
	private double elo;
	private String name;
	private long acctNum;
	Random rand = new Random();

	public Account(double initBal, String playerName, long number) {
		this.elo = initBal;
		this.name = playerName;
		this.acctNum = number;

	}

	public Account(double initBal, String playerName) {
		this.elo = initBal;
		this.name = playerName;
		acctNum = Math.abs(rand.nextLong());
	}

	public Account(String playerName) {
		this.name = playerName;
		acctNum = Math.abs(rand.nextLong());
	}

	public void lose(double amount) {
		if (elo >= amount)
			elo -= amount;
		else
			System.out.println("Elo is already zero.");
	}

	public void win(double amount) {
		elo += amount;
	}

	public double getelo() {
		return elo;
	}

	public String toString() {
		return "Name:" + name + "\nAccount Number: " + acctNum + "\nelo: " + elo;
	}

	public String getName() {
		return this.name;
	}

	public long getNumber() {
		return this.acctNum;
	}

	public static Account combine(Account ac1, Account ac2) {
		if (ac1.getName().equals(ac2.getName())) {
			if (ac1.getNumber() != ac2.getNumber()) {
				return new Account((ac1.getelo() + ac2.getelo()) / 2, ac1.getName());
			} else {
				System.out.println("Sorry, accounts with same number cannot be combinated");
			}
		} else {
			System.out.println("Sorry, accounts with different names cannot be combinated");

		}
		return null;
	}

}