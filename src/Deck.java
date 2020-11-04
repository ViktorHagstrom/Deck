public class Deck {

    /**
     * deck är en instansvariabel som lagrar ett godtyckligt antal kort
     */
    public Card[] cards;

    /**
     * En klassmetod som skapar en tom bunt
     * @param count antal kort
     * @return en bunt
     */
    public static Deck getDeck(int count){

       Deck deck = new Deck();
       deck.cards = new Card[count];
       return deck;
    }

    // Skapa en bunt som innehåller alla klöver

    /**
     * En klassmetod som skapar en bunt med alla klöver.
     * @return en bunt
     */
    public static Deck getClubs(){

        Deck deck = getDeck(13);

        for (int rank = 1; rank <= 13 ; rank++) {
            deck.cards[rank - 1] = Card.getInstance(Card.CLUBS,rank);
        }

        return deck;
    }
    public static void print(Deck deck){
        for (var card :
            deck.cards ) {
            Card.print(card);

        }
    }

    public static Deck getPictures(){
        Deck deck = getDeck(12);

        for (int rank = 1; rank <= 12 ; rank++) {

            if(rank < 4){
                deck.cards[rank - 1] = Card.getInstance(Card.CLUBS,rank + 10);
            }
            else if(rank <7){
                deck.cards[rank - 1] = Card.getInstance(Card.DIAMONDS,rank + 7);
            }
            else if (rank <10){
                deck.cards[rank - 1] = Card.getInstance(Card.HEARTS,rank + 4);
            }
            else if (rank <13){
                deck.cards[rank - 1] = Card.getInstance(Card.SPADES,rank + 1);
            }
        }

        return deck;
    }

    public static Deck getImage(){

        Deck deck = getDeck(6);

        int index = 0;

        for (int rank = Card.JACK ; rank <= Card.KING ; rank++) {
            deck.cards[index++] = Card.getInstance(Card.HEARTS, rank);
            deck.cards[index++] = Card.getInstance(Card.SPADES, rank);
        }
        return deck;
    }

}
