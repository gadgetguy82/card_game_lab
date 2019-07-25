import java.util.ArrayList;

public class Game {
  private ArrayList<Player> players;
  private Deck deck;

  public Game(Deck deck) {
    players = new ArrayList<Player>();
    this.deck = deck;
  }

  public void addPlayer(Player player) {
    this.players.add(player);
  }

  public void start(int noOfCards) {
    for (Player player :  this.players) {
      for (int i = 0; i < noOfCards; i++) {
        player.addCard(deck.dealCard());
      }
    }
  }

  public ArrayList<Player> getPlayers() {
    return this.players;
  }

  public boolean checkDraw() {
    int highestValue = 0;
    for (Player player : this.players) {
      if (player.handTotal() > highestValue) {
        highestValue = player.handTotal();
      }
    }
    int numOfPlayersWithHighestValue = 0;
    for (Player player : this.players) {
      if (player.handTotal() == highestValue) {
        numOfPlayersWithHighestValue += 1;
        if (numOfPlayersWithHighestValue > 1) {
          return true;
        }
      }
    }
    return false;
  }

  public Player checkWinner() {
    int highestValue = 0;
    Player highestPlayer = null;
    for (Player player : this.players) {
      if (player.handTotal() > highestValue) {
        highestValue = player.handTotal();
        highestPlayer = player;
      }
    }
    return highestPlayer;
  }
}
