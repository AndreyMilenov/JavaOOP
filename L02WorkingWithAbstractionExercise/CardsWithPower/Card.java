package L02WorkingWithAbstractionExercise.CardsWithPower;



public class Card {
    private CardSuit cardSuit;
    private CardRank cardRank;

    public Card(CardSuit cardSuit, CardRank cardRanks) {
        this.cardSuit = cardSuit;
        this.cardRank = cardRanks;
    }
    public int getPower(){
        return cardRank.getRankPower() + cardSuit.getSuitPower();
    }
}
