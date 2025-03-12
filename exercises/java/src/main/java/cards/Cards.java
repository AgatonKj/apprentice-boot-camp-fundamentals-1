package cards;


public class Cards {
    public static void main(String[] args) {
        Cards cards = new Cards();
        String[] deckInOrder = cards.getCards();
        for(String card: deckInOrder){
            System.out.println(card);
        }
    }

    public String[] getCards() {
        String[] result = new String[52];
       PlayingCardDeck deck = new PlayingCardDeck();


        int cardNumber = 0;
        for (PlayingCard card : deck.getCards()) {
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
            //TODO: create toString for every class.



            result[cardNumber] = faceValueName + " of " + card.getPlayingCardSuit().getSuit();
            cardNumber++;
        }

        return result;
    }
}
