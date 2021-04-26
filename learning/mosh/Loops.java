import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // For loops
       for (int i = 5; i > 0 ; i--) 
           System.out.println("Hello World from java for loops " + i);
        
        // While loops
        byte i = 5;
        while (i > 0){
            System.out.println("Hello world from java while loops " + i);
            i--;
        }

        String input = "";
        Scanner scanner = new Scanner(System.in);

        while (!input.equals("quit")){
            System.out.print("To quit type the word \"quit\" : ");
            input = scanner.next().toLowerCase();
        }
        // Do while loops
            // Do while loops is always executed at least once 
        do {
            System.out.print("Once More: ");
            input = scanner.next().toLowerCase();
        } while (!input.equals("quit"));

        scanner.close();
    }
}

/**
 * 
 */