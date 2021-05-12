import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        int principal = 0;
        float annualInterest = 0;

        while(true) {
            System.out.print("Principal Amount ($100 - $1M): ");
            principal = scanner.nextInt();
            if(principal >= 100 && principal <= 1_000_000)
                break;
            System.out.print("Enter a value between 100 and 1_000_000");
        }

        
        while(true) {
            System.out.print("Annual Interest Rate: ");
            annualInterest  = scanner.nextFloat();
            if(annualInterest >= 1 && annualInterest <= 30)
                break;
            System.out.print("Enter a value between 1 and 30: ");
        }
        
        
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        byte years = 0;
        while(true) {
            System.out.print("Period in (Years): ");
            years = scanner.nextByte();  
            if(years >= 1 && years <= 30)
                break;
                System.out.print("Enter a value between 1 and 30: ");   
        }

        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal 
        * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage is " + mortgageFormatted);
        scanner.close();
    }
}

/**
 * 
 */