package L14ExceptionsAndErrorHandlingLab;
import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

public class P01NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] range = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.println("Range: [" + range[0] + "..." + range[1] + "]");

        boolean isValidInput = false;

        while (!isValidInput) {
            String nextInput = scanner.nextLine();
            Optional<Integer> number = Optional.empty();

            try {
                number = Optional.of(Integer.parseInt(nextInput));
            } catch (NumberFormatException ignored) {

            }

            String output= ("Invalid number: " + nextInput);

            if (isInRange(range, number)) {
                 output = ("Valid number: " + nextInput);
                 isValidInput = true;

            }


            System.out.println(output);
        }
    }

    private static boolean isInRange(int[] range, Optional<Integer> number) {
        return number.isPresent() && number.get() >= range[0] && number.get() <= range[1];

    }
}
