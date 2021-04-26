import java.util.Scanner;

public class Condtionals {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Temperature : ");
        byte temp = scanner.nextByte();

        if(temp > 30){
            System.out.println("It's Hot Today \n Drink plenty of water");
        }
        else if(temp > 20 && temp < 30){
            System.out.println("It's a nice day");
        }
        else{
            System.out.println("It's cold");
        }
        scanner.close();
        // Ternary Operator
        System.out.println("Ternary Operator");
        int income = 120_000;
        boolean hasHighIncome = income > 100_000 ? true : false;
        System.out.println("Has High Income: " + hasHighIncome);

        new CheckPrivileges("admin");
    }

}
