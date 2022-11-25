
public class Person {
	public String name;
	public String surname;
	public int age;
	public double salary;

	private final Personal personal = new Personal();
	private final Vehicle vehicle = new Vehicle();
	private final Mortgage mortgage = new Mortgage();

	public Person(String name, String surname, int age, double salary) {
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.salary = salary;
	}

	public void applyForLoan(Person p, int capital, int month, String loanType) {
		double interest = 0;
		if (loanType.equals("Personal")) {
			interest = personal.calculateInterest(capital, p);
		} else if (loanType.equals("Vehicle")) {
			interest = vehicle.calculateInterest(capital, p);
		} else if (loanType.equals("Mortgage")) {
			interest = mortgage.calculateInterest(capital, p);
		}
	
		double installment = interest / month;

		printCreditResult(p.salary >= installment, capital, p, installment, month, loanType);
	}

	public void printCreditResult(Boolean b, int capital, Person person, double installment, int month,
			String loanType) {
		if (b) {
			System.out.println("Congratulations " + person.name + " " + person.surname);
			System.out.println("Your " + loanType + " credit application: " + capital + " has been accepted!");
			System.out.println("Your monthly payment will be: " + installment + " x " + month);
			System.out.println("Repayment costs = " + installment * month);
		} else {
			System.out.println("We are sorry " + person.name + " " + person.surname);
			System.out.println("Your " + loanType + " credit application " + capital
					+ " has been rejected because your salary is lower than the installments!");
			System.out.println("Your salary: " + salary + " < " + installment);
		}
	}

}
