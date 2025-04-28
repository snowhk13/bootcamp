import java.util.Arrays;

public class RuleManager {
  
  public static boolean isPair(Card c1, Card c2){
    return c1.getRank() == c2.getRank();
  
}

public static boolean isThreeOfKind(Card c1, Card c2, Card c3){
  return c1.getRank() == c2.getRank() && c2.getRank() == c3.getRank();
}

// 8,7,8,8,7
public static boolean isFullHouse(Card[] cards){
  if(cards.length != 5){
    return false;
  }

  int[] counts = new int[(Card.ACE - Card.TWO) + 1]; 
  for (int i = 0; i < cards.length; i++) {
    int index = cards[i].getRank() - Card.TWO ;
    counts[index]++;
  }
  boolean result1 = false;
  boolean result2 = false;

  for (int i = 0; i < counts.length; i++) {
    if (counts[i] == 3) {
      result1 = true;
    }
    if (counts[i] == 2) {
      result2 = true;
    }
  }

  return result1 && result2;
}
//6,7,8,9,10
//A,K,Q,J,10
public static boolean isStraight(Card[] cards){

  if(cards.length != 5){
    return false;
  }

  char[] arrTemp = new char[cards.length];
  for(int i=0;i<cards.length;i++){
    arrTemp[i] = cards[i].getRank();
  }

  char temp = '0';
  
  for(int i=0;i<arrTemp.length-1;i++){
    for(int j=0;j<arrTemp.length-1-i;j++){
     if(arrTemp[j] > arrTemp[j+1]){
      temp = arrTemp[j];
      arrTemp[j] = arrTemp[j+1];
      arrTemp[j+1] = temp;
     }
      }
    }

 System.out.println(Arrays.toString(arrTemp));

 if(arrTemp[arrTemp.length-1] - arrTemp[0] == 12){
  arrTemp[arrTemp.length-1] = '1';

  for(int i=0;i<arrTemp.length-1;i++){
    for(int j=0;j<arrTemp.length-1-i;j++){
     if(arrTemp[j] > arrTemp[j+1]){
      temp = arrTemp[j];
      arrTemp[j] = arrTemp[j+1];
      arrTemp[j+1] = temp;
     }
      }
    }
 }

 System.out.println(Arrays.toString(arrTemp));

    for(int i=0;i<arrTemp.length-1;i++){
      if(arrTemp[i+1] - arrTemp[i] != 1){
        return false;
      }
    }
    return true;
  }




public static boolean isFlush(Card[] cards){

  if(cards.length != 5){
    return false;
  }

  return cards[0].getSuit() == cards[1].getSuit() && cards[1].getSuit() == cards[2].getSuit() &&
  cards[2].getSuit() == cards[3].getSuit() && cards[3].getSuit() == cards[4].getSuit();

}
}