package L01WorkingWithAbstractionLab;

import java.util.Scanner;

public class RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            for (int r = 0; r < i; r++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int r = 0; r < n; r++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int r = 0; r < n-i; r++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}