// Lab04avst.java
// The Mortgage Payment Program
// This the student, starting version of the Lab04a assignment.


public class Lab04avst
{
	public static void main(String[] args)
	{
		System.out.println("Lab04a, Student Version\n");

		double principal  = 250000;
		double annualRate = 4.85;
		double numYears   = 30;

		System.out.print("Principal:\t\t");
		System.out.println("$" + principal);
		System.out.print("Annual Rate:\t\t");
		System.out.println(annualRate + "%");
		System.out.print("Number of Years:\t");
		System.out.println(numYears);
		System.out.print("Monthly Payment:\t");

		double monthlyInterest = ((annualRate / 100) / 12);
		double numerator = Math.pow ((1 + monthlyInterest),(numYears * 12));
		double monthlyPayment = (((monthlyInterest * numerator) / (numerator - 1)) * principal);
		System.out.println(monthlyPayment);
		System.out.print("Total Payments:\t\t");
		double TPayments = ((monthlyPayment*12) * numYears);
		System.out.println(TPayments);
		System.out.print("Total Interest:\t\t");
		double yearlyInterestPaid = Math.pow (monthlyInterest, (numYears * 12));
		System.out.println(principal * yearlyInterestPaid);








	}
}
