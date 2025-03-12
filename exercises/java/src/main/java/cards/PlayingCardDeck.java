package cards;

import java.util.ArrayList;
import java.util.List;

public class PlayingCardDeck extends Deck{


    public PlayingCardDeck() {
        cards = new ArrayList<>();
        for (int suit = 0; suit < 4; suit++) {
            for (int faceValue = 0; faceValue < 13; faceValue++) {

                String suitName;
                switch (suit) {
                    case 0:
                        suitName = "clubs";
                        break;
                    case 1:
                        suitName = "diamonds";
                        break;
                    case 2:
                        suitName = "hearts";
                        break;
                    case 3:
                        suitName = "spades";
                        break;
                    default:
                        throw new IllegalArgumentException("Something went wrong " + suit + "is not a valid suitName!");
                }

                PlayingCardSuit playingCardSuit = new PlayingCardSuit(suitName);
                cards.add(new PlayingCard(playingCardSuit, faceValue));

            }
        }
    }


}


