public class Card {
  // ! static -> cmmon values for all objects (Not belongs to objects)
  // ! final -> Cannot modify the value after initialization
  // Non-Static and Non-Final
  // Static and Non-Final
  // Non-static and Final
  // Static and Final
  private char rank;
  private char suit; //1,2,3,4,5,6,7,8,9,T,J,Q,K

  public static final char DIAMOND = '1'; // constant
  public static final char CLUB = '2'; // constant
  public static final char HEARD = '3'; // constant
  public static final char SPADE = '4'; // constant

  public static final char ACE = '>'; // constant
  public static final char TWO = '2'; // constant
  public static final char THREE = '3'; // constant
  public static final char FOUR = '4'; // constant
  public static final char FIVE = '5'; // constant
  public static final char SIX = '6'; // constant
  public static final char SEVEN = '7'; // constant
  public static final char EIGHT = '8'; // constant
  public static final char NINE = '9'; // constant
  public static final char TEN = ':'; // constant
  public static final char JACK = ';'; // constant
  public static final char QUEEN = '<'; // constant
  public static final char KING = '='; // constant

  public Card() {
    this.rank ='0';
    this.suit ='0';
  }

  public Card(char rank, char suit) {
    this.rank = rank;
    this.suit = suit;
  }

  public void setRank(char rank) {
    this.rank = rank;
  }

  public char getRank() {
    return this.rank;
  }

  public void setSuit(char suit) {
    this.suit = suit;
  }

  public char getSuit() {
    return this.suit;
  }

  public boolean isRed() {
    if (suit == DIAMOND || suit == HEARD)
      return true;
    return false;

  }

  @Override
  public boolean equals(Object obj){
    if(this == obj){
      return true;
    }
    if(!(obj instanceof Card)){
      return false;
    }
    Card card = (Card) obj;
    
    return this.getRank() == card.getRank() && this.getSuit() == card.getSuit();
  }

  public boolean equals(Card card){
    return this.rank == card.getRank() && this.suit == card.getSuit();
  }

  public int compareTo(Card card){
    if(this.rank == card.getRank()){
      if(this.suit > card.getSuit()){
        return 1;
      }else if(this.suit < card.getSuit()){
        return -1;
      }
      return 0;
    }
    // different ranks
    return this.rank > card.getRank() ? 1 : -1;
  }

  public String toString(){
    return "Card(" + "rank=" +this.rank+ ",suit=" + this.suit + ")";
  }

  public static void main(String[] args) {
    Card c1 = new Card(TWO,CLUB);
    Card c2 = new Card(TWO,CLUB);
    Card c3 = new Card(THREE,CLUB);
    Card c4 = new Card(TWO,HEARD);
    Card c5 = new Card(ACE,SPADE);
    Card c6 = new Card(ACE,DIAMOND);


    System.out.println(c1.equals(c2)); //true
     

    System.out.println(c1.compareTo(c2)); // 0
    System.out.println(c1.compareTo(c3)); // -1
    System.out.println(c5.compareTo(c1)); // 1
    System.out.println(c5.compareTo(c6)); // 1

    System.out.println(c6.toString());
   
  }

}
