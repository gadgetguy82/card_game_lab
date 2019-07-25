import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PlayerTest {
  private Player player;
  private Card card1, card2, card3, card4, card5, card6, card7, card8;

  @Before
  public void setUp() {
    player = new Player("Jack");
    card1 = new Card(PipType.FOUR, SuitType.HEARTS);
    card2 = new Card(PipType.QUEEN, SuitType.CLUBS);
    card3 = new Card(PipType.SEVEN, SuitType.HEARTS);
    card4 = new Card(PipType.THREE, SuitType.DIAMONDS);
    card5 = new Card(PipType.NINE, SuitType.HEARTS);
    card6 = new Card(PipType.ACE, SuitType.SPADES);
    card7 = new Card(PipType.FIVE, SuitType.DIAMONDS);
    card8 = new Card(PipType.EIGHT, SuitType.HEARTS);

    player.addCard(card1);
    player.addCard(card2);
    player.addCard(card3);
    player.addCard(card4);
    player.addCard(card5);
    player.addCard(card6);
    player.addCard(card7);
    player.addCard(card8);
  }

  @Test
  public void canGetName() {
    assertEquals("Jack", player.getName());
  }

  @Test
  public void canGetHighestCard() {
    assertEquals(card2, player.showHighestCard());
  }

  @Test
  public void canGetCardCount() {
    assertEquals(8, player.cardCount());
  }

  @Test
  public void canGetHandTotal() {
    assertEquals(47, player.handTotal());
  }
}
