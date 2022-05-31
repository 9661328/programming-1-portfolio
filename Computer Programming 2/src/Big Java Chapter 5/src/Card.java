public class Card {
    private String cardNotation;

    public Card(String cardNotation) {
	this.cardNotation = cardNotation;
    }
    
    public String getDescription() {
	String cardValue = cardNotation.substring(0, cardNotation.length() - 1);
	String cardSuit = cardNotation.substring(cardNotation.length() - 1);
	
	boolean validCard = true;
	
	if(!cardValue.equals("1") && "2 3 4 5 6 7 8 9 10".contains(cardValue)) {
	    cardValue = cardValue;
	} else if (cardValue.equals("A")) {
	    cardValue = "Ace";
	} else if (cardValue.equals("J")) {
	    cardValue = "Jack";
	} else if (cardValue.equals("Q")) {
	    cardValue = "Queen";
	} else if (cardValue.equals("K")) {
	    cardValue = "King";
	} else {
	    validCard = false;
	}
	
	if ("DHSC".contains(cardSuit)) {
	    if (cardSuit.equals("D")) {
		cardSuit = "Diamonds";
	    } else if (cardSuit.equals("H")) {
		cardSuit = "Hearts";
	    } else if (cardSuit.equals("S")) {
		cardSuit = "Spades";
	    } else if (cardSuit.equals("C")) {
		cardSuit = "Clubs";
	    }
	} else {
	    validCard = false;
	}
	 
	if (!validCard) {
	    return "Unknown";
	}
	
	return cardValue + " of " + cardSuit;
    }
}