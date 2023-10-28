package L08InterfacesAndAbstractionExercises.FoodShortage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Buyer> buyers = new HashMap<>();
        Buyer buyer;

        for (int i = 0; i < n; i++) {
            String[] personParts = scanner.nextLine().split(" ");
            String personName = personParts[0];
            int personAge = Integer.parseInt(personParts[1]);
            if (personParts.length == 4) {
                String id = personParts[2];
                String birthDate = personParts[3];
                buyer = new Citizen(personName, personAge, id, birthDate);

            } else {
                String group = personParts[2];
                buyer = new Rebel(personName, personAge, group);

            }
            buyers.put(personName, buyer);
        }

        String nameFromConsole = scanner.nextLine();

        while (!"End".equals(nameFromConsole)) {

            Buyer buyer1 = buyers.get(nameFromConsole);

            if (buyer1 != null) {
                buyer1.buyFood();
            }


                nameFromConsole = scanner.nextLine();
        }
        int sum = buyers.values()
                .stream()
                .mapToInt(Buyer::getFood)
                .sum();
        System.out.println(sum);

    }
}
