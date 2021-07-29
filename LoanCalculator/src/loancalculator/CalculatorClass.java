
package loancalculator;

public class CalculatorClass {    
   
    private final int Months_In_Year = 12;
            
    private double loan_Amount;
    private int Monthly_Payment;
    public void setLoanAmount(double loan){
        this.loan_Amount = loan;
    }
    public double getLoanAmount(){
        return loan_Amount;
    }
    
    private double Monthly_Interest_Rate;
    public void setInterestRate(double interestRate){
        this.Monthly_Interest_Rate = interestRate;
    }
    public double getMonthly_Interest_Rate(){
        return (Monthly_Interest_Rate/Months_In_Year)/100;
    }
    
    private int Period;
    public void setPeriod(int period){
        this.Period = period*Months_In_Year;
    }
    public int getPeriod(){
        return Period;
    }
    
    public double getMonthly_Payment (double monthly_Payment){
monthly_Payment =((loan_Amount*Monthly_Interest_Rate)/(1- Math.pow(1 + Monthly_Interest_Rate,(-Period))));
        return monthly_Payment;
    }
    
  public double getTotal_Payment(double total_payment ){
      total_payment = ((Monthly_Payment * 12) * Period);
      return total_payment;
  }
}
