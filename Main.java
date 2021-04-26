import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Reading Inputs from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter your name: ");
        String name = scanner.nextLine().trim();

        System.out.print("Please Enter your age: ");
        byte age = scanner.nextByte();
        System.out.println("You're " + name + " and you're " + age + " Years Old");
    }
}

/**
 * 
 */