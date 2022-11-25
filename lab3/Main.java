
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1 = new Person("Ali", "Irmak", 36, 5000);
		Person person2 = new Person("Veli", "Kaya", 61, 3500);
		/*
		 * person1.applyForLoan(person1,100000,6,"Mortgage");
		 * person1.applyForLoan(person1,10000,6,"Mortgage");
		 * person2.applyForLoan(person2, 50000, 12, "Vehicle");
		 * person2.applyForLoan(person2, 50000, 24, "Vehicle");
		 * person1.applyForLoan(person2, 50000, 12, "Personal");
		 * person1.applyForLoan(person2, 50000, 24, "Personal");
		 */

		Mortgage mortgage1 = new Mortgage();
		Vehicle vehicle1 = new Vehicle();
		Personal personal1 = new Personal();
		mortgage1.restructuringLoan(12, person1, 1244.00, 1244.00, 1244.00, 1244.00);
		vehicle1.restructuringLoan(24, person1, 800.00, 800.00, 800.00, 800.00, 800.00, 800.00, 800.00);
		personal1.restructuringLoan(24, person2, 650.00, 650.00, 650.00, 650.00, 650.00, 650.00, 650.00);

	}

}
