package sef.module4.activity;

/**
 * This class represents a playing card 
 * 
 * @author John Doe
 *
 */

public class PlayingCard {

	public static final int ACE = 1;
	public static final int TWO = 2;
	public static final int THREE = 3;
	public static final int FOUR = 4;
	public static final int FIVE = 5;
	public static final int SIX = 6;
	public static final int SEVEN = 7;
	public static final int EIGHT = 8;
	public static final int NINE = 9;
	public static final int TEN = 10;
	public static final int JACK = 11;
	public static final int QUEEN = 12;
	public static final int KING = 13;
	
	
	public static final int JOKER = 0;

	public static final int SPADES = 4;
	public static final int HEARTS = 3;
	public static final int DIAMONDS = 2;
	public static final int CLUBS = 1;



	/**
	 * Creates an instance of a PlayingCard given the specified parameters. Valid
	 * values for the number and suit parameters are the range of static attributes
	 * ACE to KING for number and CLUBS to SPADES for suit.  JOKER values can be 
	 * applied to suit and number.  
	 * 
	 * If a JOKER value or any invalid value is assigned assigned to either number or
	 * suit, then both number and suit are assigned the JOKER value.
	 * 
	 * @param number the number of the card
	 * @param suit the suit of the card
	 */
	
	
	//TODO #1: Write an instance variables that will handle the Integer value of number and suit.   
	int number;
	int suit;
	//END TODO #1
	
	
	public PlayingCard(int number, int suit) {
		
		//TODO #2: Write code that will filter number and suit with the range provided above.
		// Assign the number and suit argument to instance variable respectively
		// If the arguments were not filter, make a code that will assign instance variables to a JOKER value
		if(ACE <= number && number <= KING && CLUBS <= suit && suit <= SPADES) {
			this.number = number;
			this.suit = suit;
		} else {
			this.number = JOKER;
			this.suit = JOKER;
		}
		//END TODO #2
		
	
		}
			
	
	/**
	 * Creates an instance of a JOKER PlayingCard 
	 * 
	 */
	public PlayingCard(){

		//TODO #3: Make an instance of JOKER playing card
		// Assign instance variable to a JOKER value
		this.number = JOKER;
		this.suit = JOKER;
		//END TODO #3
		
		
		
		
	}

	/**
	 * Return the number of the card . Valid values returned can be one of the static fields of this
	 * class from ACE to KING or JOKER
	 * 
	 * @return the number 
	 */
	public int getNumber() {
		
		//TODO #4: Return the Integer value of the playing card
		// Return the value of current value of the number 
		return this.number;
		//END TODO #4
	
//		return 0;
	}


	/**
	 * Return the suit of the card.  Valid values returned can be one of the static fields of this
	 * class from CLUBS to SPADES or JOKER
	 * 
	 * @return the suit
	 */
	public int getSuit() {

		//TODO #5: Return the Integer value of the playing card
		// Return the value of current value of the suit 
		return this.suit;
		//END TODO #5

//		return 0;
	}


	/**
	 * Return a String representation of this card in the following form:
	 * "<number> of <suit>"
	 * 
	 * @return the String representation of this card
	 */
	public String toString() {
		
		//TODO #6: Make a code that will convert the Integer value of number and suit into String.
		// Return the String value of the current number and suit into a format "number of suit" 
		// Provide single space between number-of and of-suit.
		// It will be easier if a switch-case statement is use in the code. 
		// Make a code that will return the String value of JOKER if the default value was chosen
		String number = "";
		String suit = "";
		
		switch(this.number) {
			case ACE:
				number = "ACE";
				break;
			case TWO:
				number = "TWO";
				break;
			case THREE:
				number = "THREE";
				break;
			case FOUR:
				number = "FOUR"; 
				break;
			case FIVE:
				number = "FIVE"; 
				break;
			case SIX:
				number = "SIX";
				break;
			case SEVEN:
				number = "SEVEN";
				break;
			case EIGHT:
				number = "EIGHT";
				break;
			case NINE:
				number = "NINE";
				break;
			case TEN:
				number = "TEN";
				break;
			case JACK:
				number = "JACK";
				break;
			case QUEEN:
				number = "QUEEN";
				break;
			case KING:
				number = "KING";
				break;
			default:
				return "JOKER";
		}
		
		switch(this.suit) {
			case CLUBS:
				suit = "CLUBS";
				break;
			case DIAMONDS:
				suit = "DIAMONDS";
				break;
			case HEARTS:
				suit = "HEARTS";
				break;
			case SPADES:
				suit = "SPADES"; 
				break;
			default:
				return "JOKER";
		}
		//END TODO #6
		
		return String.format("%s of %s", number, suit);
	}
}
