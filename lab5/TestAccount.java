import java.util.Scanner;

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name;
		double elo;
		long acctNum;
		Account acct;
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter players first name");

		name = keyboard.nextLine();
		
		
		acct = new Account(name);
		
		System.out.println("Account for " + name + ":");
		System.out.println(acct);
		
		System.out.println("\nEnter initial Elo");

		elo = keyboard.nextDouble();
		
		
		
		acct = new Account(elo,name);
		
		System.out.println("Account for " + name + ":");
		System.out.println(acct);

		System.out.println("\nEnter player number");

		acctNum = keyboard.nextLong();

		acct = new Account(elo, name, acctNum);
		
		System.out.println("Account for " + name + ":");
		System.out.println(acct);
		
		acct.win(100);
		System.out.print("\nPlayer has won, new elo is " + acct.getelo());
		
		acct.lose(27);
		
		System.out.print("\nPlayer has lost, new elo is " + acct.getelo());

	}

}
