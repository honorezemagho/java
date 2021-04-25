import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] numbers = new int[2][3];
        numbers[0][1] = 2;

        int[][] actualNumbers = { { 1, 2, 3 }, { 4, 5, 6 } };
        System.out.println(Arrays.deepToString(numbers));
        System.out.println(Arrays.deepToString(actualNumbers));
    }
}

/**
 * Java Arrays have a fixed sizes
 */