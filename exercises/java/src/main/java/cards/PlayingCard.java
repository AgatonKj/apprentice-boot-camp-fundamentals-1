package cards;

public class PlayingCard {


        private int suit;
        private int faceValue;

        public PlayingCard(int suit, int faceValue) {
                this.suit = suit;
                this.faceValue = faceValue;
        }

        public void setFaceValue(int faceValue) {
                this.faceValue = faceValue;
        }

        public void setSuit(int suit) {
                this.suit = suit;
        }

        public int getFaceValue() {
                return faceValue;
        }

        public int getSuit() {
                return suit;
        }
}
