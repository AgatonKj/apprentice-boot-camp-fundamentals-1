package cards;

public class PlayingCardDeck {
    private PlayingCard[] cards = new PlayingCard[52];

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
                cards[suit * 13 + faceValue] = new PlayingCard(playingCardSuit, faceValue);

            }
        }
    }

    public PlayingCard[] getCards() {
        return cards;
    }
}


