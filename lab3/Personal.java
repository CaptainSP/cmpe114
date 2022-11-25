public class Personal {
	private final double RATE = 0.3995;

	double calculateInterest(int capital, Person person) {
		return (capital + creditRiskFee(person.age, capital)) * (1 + RATE);
	}

	double creditRiskFee(int age, double capital) {
		if (age > 55) {
			return (age - 55) * 0.02 * capital * (RATE / 12);
		} else {
			return 0;
		}
	}

	public void restructuringLoan(int newMonthNumber, Person person, double... remainingInstallments) {
		int sum = 0;
		for (int i = 0; i < remainingInstallments.length; i++) {
			sum += remainingInstallments[i];
		}

		double interest = calculateInterest(sum, person);
		double installment = interest / newMonthNumber;

		System.out.println("New Personal Loan Repayment will be: " + interest);
		System.out.println("Your new payments will be: " + installment + " x " + newMonthNumber);
		System.out.println();
	}
}
