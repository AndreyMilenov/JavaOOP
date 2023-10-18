package L04EncapsulationExer.ShoppingSpree;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] people = scanner.nextLine().split(";");
        Map<String,Person> peoples = new LinkedHashMap<>();

        for (String personString : people) {
            String[] personData = personString.split("=");
            String name = personData[0];
            double money = Double.parseDouble(personData[1]);

            try {
                Person person = new Person(name,money);
                peoples.put(name,person);
            } catch (IllegalArgumentException e ) {
                System.out.println(e.getMessage());
                return;
            }
        }
        String[] products = scanner.nextLine().split(";");
        Map<String,Product> productMap = new LinkedHashMap<>();

        for (String productString : products) {
            String[] productData = productString.split("=");
            String name = productData[0];
            double money = Double.parseDouble(productData[1]);

            try {
                Product product = new Product(name,money);
                productMap.put(name,product);
            } catch (IllegalArgumentException e ) {
                System.out.println(e.getMessage());
                return;
            }
        }

        String line = scanner.nextLine();
        while (!"END".equals(line)) {
            String[] commandParts = line.split(" ");
            String personName = commandParts[0];
            String productName = commandParts[1];

            Person buyer = peoples.get(personName);
            Product product = productMap.get(productName);
            System.out.printf("%s bought %s",personName,productName);
            try {
                buyer.buyProduct(product);

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            line = scanner.nextLine();
        }
        peoples.values().forEach(System.out::println);

    }
}
