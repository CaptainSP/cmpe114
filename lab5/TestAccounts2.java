import java.util.Scanner;

public class TestAccounts2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		System.out.println("Enter name for first player");

		Account ac1 = new Account(100,s.nextLine());

		System.out.println("First player");
		
		System.out.println(ac1.toString());

		System.out.println("Enter name for second player");

		Account ac2 = new Account(100,s.nextLine());

		System.out.println("Second player");

		System.out.println(ac2.toString());

		System.out.println("Enter name for thrid player");

		Account ac3 = new Account(100,s.nextLine());

		System.out.println("Third player");

		System.out.println(ac3.toString());
		
		System.out.println("Trying to combinating second and third accounts");
		
		Account.combine(ac2, ac3);

	}

}
