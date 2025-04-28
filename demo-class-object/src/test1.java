import java.util.Arrays;

public class test1 {
  
public static int isFullHouse(Card[] cards){
int index = cards[0].getRank() - Card.TWO ;

return index;
}

public static void main(String[] args) {
  Card c1 = new Card(Card.TWO,Card.CLUB);
  Card c2 = new Card(Card.THREE ,Card.HEARD);
  Card c3 = new Card(Card.FOUR,Card.DIAMOND);
  Card c4 = new Card(Card.FIVE,Card.CLUB);
  Card c5 = new Card(Card.ACE,Card.HEARD);

  Card d1 = new Card(Card.TEN,Card.CLUB);
  Card d2 = new Card(Card.JACK ,Card.CLUB);
  Card d3 = new Card(Card.QUEEN,Card.CLUB);
  Card d4 = new Card(Card.KING,Card.CLUB);
  Card d5 = new Card(Card.ACE,Card.CLUB);

  Card[] arrC = new Card[]{c1,c2,c3,c4,c5};

  Card[] arrD = new Card[]{d1,d2,d3,d4,d5};
  

  System.out.println(Card.ACE - Card.TWO);
 

  int arr1[] =  new int[]{1,2,3,4,5};

  System.out.println(RuleManager.isStraight(arrC));

  System.out.println(RuleManager.isFlush(arrC));

  System.out.println(RuleManager.isFullHouse(arrD));
  

}
}
