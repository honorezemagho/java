import java.util.Scanner;

public class Functions {

    public static double calculateTotalMealPrice (double listedMealPrice,double tipRate,double taxRate){
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;
        return result;
    }

    // return array in java
    // public static double[] calculateSalary(int hours, double amount){
    //     final byte WEEKS_IN_YEAR = 52;
    //     double payPerWeek = hours * amount * WEEKS_IN_YEAR;
    //     double unpaidTime = amount * 8;
    //     double result[] = {payPerWeek,unpaidTime};

    //     return result;
    // }

    public static double calculateTotalSalary(int hours, double amount){
        final byte WEEKS_IN_YEAR = 52;
        double payPerWeek = hours * amount * WEEKS_IN_YEAR;
        double unpaidTime = amount * 8;

        double totalSalary = payPerWeek - unpaidTime;

        return totalSalary;
    }

    public static String Annualsalary(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Numbers of hours: ");
        int hours = scanner.nextInt();

        while(hours < 0){
            System.out.print("Numbers of hours of the Employee: ");
            hours = scanner.nextInt();
        }

        System.out.print("Enter the amount of money of the Employee: ");
        double costPerHour = scanner.nextInt();

        while(costPerHour < 0){
            System.out.print("Numbers of hours: ");
            costPerHour = scanner.nextInt();
        }

        double Annualsalary = calculateTotalSalary(hours,costPerHour);

        return "The total salary is $" + Annualsalary;
    }   

    public static void main(String[] args) {
        final String outputString = "Your total meal price is $";
        double groupTotalMeal = calculateTotalMealPrice(40, .2, .05);
        double groupTotalMeal2 = calculateTotalMealPrice(25, .18, .08);

        // System.out.println(outputString + groupTotalMeal);
        // System.out.println(outputString  + groupTotalMeal2);

        System.out.println(Annualsalary());
    }

}
