import java.util.Scanner;
import java.text.DecimalFormat;
        
public class MainClass {
    
    public static void main(String[] args) {
       Scanner readme = new Scanner(System.in);
       DecimalFormat df = new DecimalFormat("#.##");
       
       double compoundInterest, principal, interestRate, Years, timesPerInterest;
       
       System.out.println("Enter the principal amount : ");
       principal = readme.nextDouble();
       
       System.out.println("Enter the interest rate : ");
       interestRate = readme.nextDouble();
       
       System.out.println("Enter the time in years : ");
       Years = readme.nextDouble();
       
       System.out.println("Enter the number of times interest is compounded per year : ");
       timesPerInterest = readme.nextDouble();
     
       compoundInterest = principal * Math.pow(1 + (interestRate/Years), 
                timesPerInterest) 
               - principal;
       
       System.out.println("The Compound Interest = R " + df.format(compoundInterest));
    }
    
}
