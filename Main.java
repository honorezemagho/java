import java.text.NumberFormat;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Math Library
        int result = (int) (Math.random() * 100);
        System.out.println(result);

        // Format Numbers in java
        NumberFormat percent = NumberFormat.getPercentInstance();
        String conversion = percent.format(0.1);
        System.out.println(conversion);

        // Method Chaining
        String chaining = NumberFormat.getCurrencyInstance().format(1_457_89.47);
        System.out.println(chaining);
    }
}

/**
 * 
 */