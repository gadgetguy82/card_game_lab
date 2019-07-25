import java.util.ArrayList;
import java.util.Collections;

public class Deck {
  private ArrayList<Card> cards;

  public Deck() {
    cards = new ArrayList<Card>();
//    cards.add(new Card(PipType.ACE, SuitType.DIAMONDS));
    for (SuitType suit : SuitType.values()) {
      for (PipType pip : PipType.values()) {
        cards.add(new Card(pip, suit));
      }
    }
  }

  public int cardCount() {
    return this.cards.size();
  }

  public void shuffleCards() {
    Collections.shuffle(this.cards);
  }

  public Card dealCard() {
    Card dealtCard = this.cards.get(0);
    this.cards.remove(dealtCard);
    return dealtCard;
  }
}
