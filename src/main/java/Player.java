import java.util.ArrayList;

public class Player {
  private String name;
  private ArrayList<Card> hand;

  public Player(String name) {
    this.name = name;
    hand = new ArrayList<Card>();
  }

  public String getName() {
    return name;
  }

  public void addCard(Card card) {
    this.hand.add(card);
  }

  public Card showHighestCard() {
    Card highestCard = null;
    int highestValue = 0;
    for (Card card : this.hand) {
      if (card.getValue() > highestValue) {
        highestCard = card;
        highestValue = card.getValue();
      }
    }
    return highestCard;
  }

  public String showCard(int index) {
    return String.format("%s of %s",this.hand.get(index).getPip(),this.hand.get(index).getSuit());
  }

  public int cardCount() {
    return this.hand.size();
  }

  public int handTotal() {
    int total = 0;
    for (Card card : this.hand) {
      total += card.getValue();
    }
    return total;
  }
}
