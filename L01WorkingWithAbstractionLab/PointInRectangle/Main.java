package L01WorkingWithAbstractionLab.PointInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] coordinates = readArray(scanner);

        Point A = new Point(coordinates[0], coordinates[1]);
        Point C = new Point(coordinates[2], coordinates[3]);

        Rectangle rectangle = new Rectangle(A, C);

        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            int[] tokens = readArray(scanner);
            Point p = new Point(tokens[0], tokens[1]);

            boolean isInside = rectangle.isInside(p);
            System.out.println(isInside);
        }


    }

    public static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
    }
}

