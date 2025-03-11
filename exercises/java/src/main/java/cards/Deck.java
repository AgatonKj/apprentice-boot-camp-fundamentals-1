package cards;


public class Deck {
    public static void main(String[] args) {
        Deck cards = new Deck();
        String[] deckInOrder = cards.getCards();
        for(String card: deckInOrder){
            System.out.println(card);
        }
    }

    public String[] getCards() {
        String[] result = new String[52];
        PlayingCard[] deck = new PlayingCard[52];

        for (int suit = 0; suit < 4; suit++) {
            for (int faceValue = 0; faceValue < 13; faceValue++) {

                String suitName;
                switch (suit){
                    case 0: suitName = "clubs"; break;
                    case 1: suitName = "diamonds"; break;
                    case 2: suitName = "hearts"; break;
                    case 3: suitName = "spades"; break;
                    default: throw new IllegalArgumentException("Something went wrong " + suit + "is not a valid suitName!");
                }

                PlayingCardSuit playingCardSuit = new PlayingCardSuit(suitName);
                deck[suit*13+faceValue] = new PlayingCard(playingCardSuit,faceValue);

            }
        }

        int cardNumber = 0;
        for (PlayingCard card : deck) {
            String faceValueName;
            switch (card.getFaceValue()){
                case 0: faceValueName = "ace"; break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9: faceValueName = Integer.toString(card.getFaceValue()+1); break;
                case 10: faceValueName = "jack"; break;
                case 11: faceValueName = "queen"; break;
                case 12: faceValueName = "king"; break;
                default: throw new IllegalArgumentException("Something went wrong " + card.getFaceValue() + "is not a valid faceValue!");
            }



            result[cardNumber] = faceValueName + " of " + card.getPlayingCardSuit().getSuit();
            cardNumber++;
        }

        return result;
    }
}
