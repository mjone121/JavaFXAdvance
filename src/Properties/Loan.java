package Properties;

/*
 * Created by mjone121 on 3/22/2016.
 */
public class Loan {
    private double AnnualInterestRate;
    private int NumberOfYears;
    private double LoanAmount;
    private java.util.Date LoanDate;

    public Loan(double interest, int year, double amount) {
        this.AnnualInterestRate = interest;
        this.NumberOfYears = year;
        this.LoanAmount = amount;
        LoanDate = new java.util.Date();
    }

    public double getAnnualInterestRate() {
        return AnnualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.AnnualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears() {
        return NumberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.NumberOfYears = numberOfYears;
    }

    public double getLoanAmount() {
        return LoanAmount;
    }

    public double getMonthlyPayment() {
        double MonthlyInterestRate = AnnualInterestRate / 1200;
        return LoanAmount * MonthlyInterestRate / (1 - (1 /
                Math.pow(1 + MonthlyInterestRate, NumberOfYears * 12)));
    }

    public double getTotalPayment() {
        return getMonthlyPayment() * NumberOfYears * 12;
    }

    public java.util.Date getLoanDate() {return LoanDate;}
}

