import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {
  Deck deck;

  @Before
  public void setUp() {
    deck = new Deck();
  }

  @Test
  public void has52Cards() {
    assertEquals(52, deck.cardCount());
    deck.shuffleCards();
  }

  @Test
  public void afterCardIsDealtDeckIsReduced() {
    deck.dealCard();
    assertEquals(51, deck.cardCount());
  }
}
