/* Card.java
 *
 * <code>Card</code> represents a playing card.
 */

public class Card {

	/**
	 * String value that holds the suit of the card
	 */
	private String suit;

	/**
	 * String value that holds the rank of the card
	 */
	private String rank;

	/**
	 * int value that holds the point value.
	 */
	private int pointValue;


   /**
	 * Creates a new <code>Card</code> instance.
	 *
	 * @param cardRank  a <code>String</code> value
	 *                  containing the rank of the card
	 * @param cardSuit  a <code>String</code> value
	 *                  containing the suit of the card
	 * @param cardPointValue an <code>int</code> value
	 *                  containing the point value of the card
	 */
// @Aradhya added value in constructor
	public Card(String cardRank, String cardSuit, int cardPointValue) {
	 rank = cardRank;
	 suit = cardSuit;
	 pointValue = cardPointValue;
	
	}


	/**
	 * Accesses this <code>Card's</code> suit.
	 * @return this <code>Card's</code> suit.
	 */
	//@Aradhya used suit as an accessor method by adding return
	public String suit() {
		return suit;
   }

	/**
	 * Accesses this <code>Card's</code> rank.
	 * @return this <code>Card's</code> rank.
	 */
	////@Aradhya used rank as an accessor method by adding return
	public String rank() {
		return rank;
	}

   /**
	 * Accesses this <code>Card's</code> point value.
	 * @return this <code>Card's</code> point value.
	 */
	//@Aradhya used pointValue as an accessor method by adding return
	public int pointValue() {
		return pointValue;
	}

	/** Compare this card with the argument.
	 * @param otherCard the other card to compare to this
	 * @return true if the rank, suit, and point value of this card
	 *              are equal to those of the argument;
	 *         false otherwise.
	 */
	// @Aradhya Converts the rank, suit, and point values into a string in the following format
	public boolean matches(Card otherCard) {
		if (otherCard.suit().equals(this.suit()) && otherCard.rank().equals(this.rank()) && otherCard.pointValue() == this.pointValue)
		return true;
		else 
		return false;
		
	}

	/**
	 * Converts the rank, suit, and point value into a string in the format
	 *     "[Rank] of [Suit] (point value = [PointValue])".
	 * This provides a useful way of printing the contents
	 * of a <code>Deck</code> in an easily readable format or performing
	 * other similar functions.
	 *
	 * @return a <code>String</code> containing the rank, suit,
	 *         and point value of the card.
	 */	
	@Override
	//@Aradhya returned the value of rank, suit, and pointValue
	public String toString() {
		return rank + " of " + suit + "(pointValue =" + pointValue + ")";
	}
}
