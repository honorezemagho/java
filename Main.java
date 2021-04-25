import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        byte number = 1;
        int[] numbers = new int[5];

        // if we have the arrays values
        int[] actualNumbers = { 2, 3, 5, 1, 4, 6, 8, 10, 7, 9 };

        numbers[0] = 1;
        numbers[1] = 2;

        System.out.println(Arrays.toString(numbers));
        System.out.println(actualNumbers);
        Arrays.sort(actualNumbers);
        System.out.println(Arrays.toString(actualNumbers));

    }
}

/**
 * Java Arrays have a fixed sizes
 */