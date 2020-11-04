public class Kort {

    // Använd konstanter / Klassvariabler
    public static final int CLUBS = 0;
    public static final int DIAMONDS = 1;
    public static final int HEARTS = 2;
    public static final int SPADES = 3;

    public static final int ACE = 1;
    public static final int JACK = 11;
    public static final int QUEEN = 12;
    public static final int KING = 13;

    // Skapa egenskaper / Instansvariabler
    public int value; // Valör 1-13
    public int suit; // Färg

    // public char club = '\u2663';
    public static final String[] RANKS = {null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    public static final String[] SUITS = {"\u2663", "\u2666", "\u2665", "\u2660"};

    public static void print(Kort c) {
        System.out.println(RANKS[c.value] + " of " + SUITS[c.suit]);
    }

    public static Kort getInstance(int clubs, int i) {
        Kort c1 = new Kort();
        c1.suit = clubs;
        c1.value = i;
        return c1;
    }
    public static Kort getRandomInstance(){
        Kort c1 = new Kort();
        c1.suit =((int) (Math.random() * 4));
        //System.out.println(c1.suit);
        c1.value=((int)(Math.random() * 13) +1 );
        //System.out.println(c1.value);

        return c1;
    }


}

