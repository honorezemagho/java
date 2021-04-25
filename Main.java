import java.util.Date;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        byte age = 30;
        Date now = new Date();
        System.out.println(now.getTime());

        // Copying variables
        // 1.Primitives Types
        byte month = 12;
        byte myMonth = month;
        myMonth = 8;
        System.out.println(month);

        // Reference Types
        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point2.x = 10;
        System.out.println(point1);
    }
}

/**
 * While assigning values in Primitives types the value is passed but in
 * Reference Types the memory reference is passed.
 */