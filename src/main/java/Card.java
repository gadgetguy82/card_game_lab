public class Card {
  private SuitType suit;
  private PipType pip;

  public Card( PipType pip, SuitType suit) {
    this.suit = suit;
    this.pip = pip;
  }

  public SuitType getSuit() {
    return this.suit;
  }

  public PipType getPip() {
    return this.pip;
  }

  public int getValue() {
    return getPip().getField();
  }
}
