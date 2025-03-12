package cards;

public class PlayingCardSuit {

    private String suit;

    PlayingCardSuit(String suit){
        this.suit = suit;
    }

    @Override
    public String toString() {
        return  suit;
    }
}
