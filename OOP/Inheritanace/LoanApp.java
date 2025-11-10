/*8. Question:
 Create a base class Loan with fields amount and years.
HomeLoan has interest rate of 7%.
CarLoan has interest rate of 9%.
 Write a program to calculate and print EMI for both loans.
Explanation:
 Tests inheritance with customized formula calculations.*/
class Loan{
	int amt;
	int year;
	void setDetails(int amt,int year){
		this.amt=amt;
		this.year=year;
	}
	void calculateEmi(){
	}
}
class HomeLoan extends Loan{
	void calculateEmi(){
		System.out.println("Amt="+amt);
		System.out.println("Year="+year);
		System.out.println("Total Amt interest rate of 7%.="+((amt*7/100)+amt));
	}
}
class CarLoan extends Loan{
	void calculateEmi(){
		System.out.println("Amt="+amt);
		System.out.println("Year="+year);
		System.out.println("Total Amt interest rate of 9%.="+((amt*9/100)+amt));
	}
}
class LoanApp{
	public static void main(String[]x){
		HomeLoan h=new HomeLoan();
		h.setDetails(1000,2);
		h.calculateEmi();
		
		CarLoan c=new CarLoan();
		c.setDetails(1000,3);
		c.calculateEmi();
		
	}
}