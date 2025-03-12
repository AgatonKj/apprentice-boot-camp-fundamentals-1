package cards;

import java.util.Collections;
import java.util.List;

public class Deck {

    protected List<Card> cards;

    void shuffle(){
        Collections.shuffle(cards);
    }

    String[] getCards(){
        String[] result = new String[cards.size()];
        for (int i = 0; i < cards.size(); i++) {
            Card card = cards.get(i);
            result[i] = card.toString();
        }
        return result;
    }

    Card deal(){
        return cards.remove(0);
    }


}
