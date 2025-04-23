import java.math.BigDecimal;

public class GameOrder {

  private static long counter = 0;

  private Game[] games;
  private long id;

  public GameOrder(){
    this.games = new Game[0];
    ++counter;
    this.id = counter;
  }

  public Game[] getGames() {
    return games;
  }

  public void setGames(Game[] games) {
    this.games = games;
  }

  public void addGame(Game game){
    Game[] newGame = new Game[this.games.length+1];
    for(int i=0;i<this.games.length;i++){
      newGame[i] = this.games[i];
    }
    newGame[newGame.length-1] = game;
    this.games = newGame;
  }

  public double amount(){
   BigDecimal amount = BigDecimal.valueOf(0.0);
   for(int i=0; i<this.games.length;i++){
    amount = BigDecimal.valueOf(this.games[i].amount()).add(amount);
   }
   return amount.doubleValue();
  }

  public void clearOrder() {
    this.games = new Game[0];
}
  
  public static void main(String[] args) {
    
    GameOrder order1 = new GameOrder();
    GameOrder order2 = new GameOrder();
    GameOrder order3 = new GameOrder();

    Game war3 = new Game("warcraft3", 500, 1);
    Game d4 = new Game("Diablo4",450,2);
    Game gundam = new Game("GUNDAM",300,3);

    order1.addGame(war3);
    order1.addGame(d4);
    order1.addGame(gundam);

    System.out.println(order1.amount());

    System.out.println(order1.id);
    System.out.println(order3.id);

    GameOrder order4 = new GameOrder();

    System.out.println(counter);



  }
  
}
