import java.util.*;

public class CardTester {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	ArrayList<Card> deck = new ArrayList<Card>();
	
	deck.add(new Card("AD"));
	deck.add(new Card("AH"));
	deck.add(new Card("AS"));
	deck.add(new Card("AC"));
	
	for (int i = 2; i <= 10; i++) {
	    deck.add(new Card(String.valueOf(i) + "D"));
	    deck.add(new Card(String.valueOf(i) + "H"));
	    deck.add(new Card(String.valueOf(i) + "S"));
	    deck.add(new Card(String.valueOf(i) + "C"));
	}
	
	deck.add(new Card("JD"));
	deck.add(new Card("JH"));
	deck.add(new Card("JS"));
	deck.add(new Card("JC"));
	
	deck.add(new Card("QD"));
	deck.add(new Card("QH"));
	deck.add(new Card("QS"));
	deck.add(new Card("QC"));
	
	deck.add(new Card("KD"));
	deck.add(new Card("KH"));
	deck.add(new Card("KS"));
	deck.add(new Card("KC"));
	
//	for (Card c: deck) {
//	    System.out.println(c.getDescription());
//	}
//	
//	System.out.println("Number of cards: " + deck.size());
	
	System.out.print("Enter the card notation: ");
	Card card = new Card(scanner.nextLine());
	
	System.out.println(card.getDescription());
	
	scanner.close();
    }
}