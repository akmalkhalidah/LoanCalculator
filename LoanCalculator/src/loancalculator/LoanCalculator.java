
package loancalculator;

import java.util.Scanner;
public class LoanCalculator {

   
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
       CalculatorClass [] list = new CalculatorClass[5];
       System.out.println("Enter 5 Loan Amount, Annual Interest Rate and Loan Period : ");
       for(int i=0; i<5; i++){
           
           double amount = input.nextDouble();
           int Period = input.nextInt();
           double Rate = input.nextDouble();
           list[i] = new CalculatorClass();
           list[i].setLoanAmount (amount);
           list[i].setPeriod(Period);
           list[i].setInterestRate(Rate);

    }
        System.out.println("Bil\tMonthly Payment\tTotal Payment");
       for(int i=0; i<5; i++){
    System.out.printf("%2d\t%7.2f\t%7.2f\n",(i+1),list[i].getMonthly_Payment(i),list[i].getTotal_Payment(i));

       }
    
}
}
