package L02WorkingWithAbstractionExercise.CardsWithPower;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        CardRank cardRank = CardRank.valueOf(scanner.nextLine());
        CardSuit cardSuit = CardSuit.valueOf(scanner.nextLine());

        Card card = new Card(cardSuit,cardRank);

        System.out.printf("Card name: %s of %s; Card power: %d",cardRank,cardSuit,card.getPower());
    }
}
