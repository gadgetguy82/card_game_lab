import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {
  private Card card;

  @Before
  public void setUp() {
    card = new Card(PipType.JACK, SuitType.CLUBS);
  }

  @Test
  public void canGetPip() {
    assertEquals(PipType.JACK, card.getPip());
  }

  @Test
  public void canGetSuit() {
    assertEquals(SuitType.CLUBS, card.getSuit());
  }

  @Test
  public void canGetValue() {
    assertEquals(10, card.getValue());
  }
}
