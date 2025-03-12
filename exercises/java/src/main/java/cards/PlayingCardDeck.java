package cards;

import java.util.ArrayList;
import java.util.List;

public class PlayingCardDeck implements Deck{
    private List<PlayingCard> cards = new ArrayList<>();

    public PlayingCardDeck() {
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

    @Override
    public void shuffle() {

    }
    public String[] getCards() {
        String[] result = new String[cards.size()];
        for (int i = 0; i < cards.size(); i++) {
            PlayingCard card = cards.get(i);
            result[i] = card.toString();
        }
        return result;
    }

    @Override
    public PlayingCard deal() {
        return cards.remove(0);
    }
}


