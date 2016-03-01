package base;

import java.util.Scanner;

public class TotalTuitionBill {
	private int Initial;
	private int Percent;
	private int APR;
	private int term;
	private int TotalCost;

	public void ReadInput() {
		Scanner input = new Scanner(System.in);

		// Get user input

		System.out.println("Enter Initial Tuition Cost for First Semester:$ ");
		Initial = input.nextInt();

		System.out.println("Enter percent increase for tuition in decimal form: %");
		Percent = input.nextInt();

		System.out.println("Enter repayment APR: %");
		APR = input.nextInt();

		System.out.println("Enter repayment term: ");
		term = input.nextInt();

		input.close();

	}

	public int getInitial() {
		return Initial;
	}

	public int getPercent() {
		return Percent;
	}

	public int getAPR() {
		return APR;
	}

	public int getterm() {
		return term;
	}

	// Calculate Total Tuition Cost
	public int TotalTuition() {
		int TotalCost = Initial;
		for (int i = 1; i != 4; i++) {
			TotalCost = (TotalCost) + ((TotalCost / i) * (1 + Percent));
		}
		return TotalCost;
	}

	// Calculate Monthly Payments

	public double MonthlyPayments() {
		
		int r = APR/12;		 
		int t = term * 12;

		double MonthlyCost = (TotalCost * r ) / (1-(Math.pow(1+r, -t)));

		return MonthlyCost;

	}

}
