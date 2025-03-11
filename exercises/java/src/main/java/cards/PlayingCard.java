package cards;

public class PlayingCard {


        private PlayingCardSuit suit;
        private int faceValue;

        PlayingCard(PlayingCardSuit suit, int faceValue) {
                this.suit = suit;
                this.faceValue = faceValue;
        }

        public int getFaceValue() {
                return faceValue;
        }

        public PlayingCardSuit getPlayingCardSuit() {
                return suit;
        }
}
