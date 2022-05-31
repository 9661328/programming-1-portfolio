/*
 * Written by: Jonathan Su
 * Date: September 17, 2021
 * 
 * Description: A console version of the Hangman game.
 * */

import java.util.*;

class Main {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	Random random = new Random();

	String[] words = { "cap", "vowel", "drive", "improve", "teacher", "solve", "tiny", "group", "goes", "balloon",
		"choose", "nature", "aware", "traffic", "bread", "mental", "mud", "hour", "radio", "feel", "flame",
		"charge", "lips", "plenty", "red", "familiar", "sometime", "basic", "powder", "language", "connected",
		"duck", "done", "sheep", "leg", "met", "naturally", "shelf", "next", "sky", "softly", "race", "end",
		"putting", "grade", "became", "shaking", "hope", "program", "recent", "allow", "national", "rest",
		"combination", "happen", "organized", "read", "aid", "listen", "hospital", "eleven", "our", "lamp",
		"pure", "class", "paint", "could", "chance", "wealth", "comfortable", "slightly", "scene", "ancient",
		"disappear", "fell", "send", "plates", "road", "final", "bill", "example", "company", "swept", "health",
		"explore", "old", "factor", "between", "carbon", "dawn", "stared", "cookies", "classroom", "having",
		"idea", "potatoes", "want", "gas", "extra", "citizen", "base", "cattle", "sugar", "cabin", "society",
		"smaller", "put", "arrive", "making", "wife", "along", "nails", "his", "lack", "shop", "he", "moon",
		"glad", "us", "solar", "body", "gray", "age", "straight", "clock", "discover", "rabbit", "test", "seat",
		"wave", "entirely", "fair", "split", "studying" };

	do {
	    StringBuilder displayBuilder = new StringBuilder();
	    String wordToGuess = words[random.nextInt(words.length)];
	    String incorrectLetters = "";
	    int incorrectGuesses = 0;
	    char guess = ' ';

	    for (int i = 0; i < wordToGuess.length(); i++) {
		if (Character.isLetter(wordToGuess.charAt(i))) {
		    displayBuilder.append("").append("_");
		}
	    }

	    System.out.println("\nWelcome to Hangman!");

	    while (incorrectGuesses > -1 && incorrectGuesses < 7) {
		drawHangman(incorrectGuesses);
		System.out.println(incorrectGuesses + " incorrect guesses: " + incorrectLetters);
		System.out.println("Word: " + displayBuilder);
		System.out.print("Guess: ");
		guess = scanner.next().charAt(0);
		System.out.println("\n");

		if (wordToGuess.contains(String.valueOf(guess))) {
		    String indexesFound = "";

		    for (int i = 0; i < wordToGuess.length(); i++) {
			if (wordToGuess.charAt(i) == guess) {
			    indexesFound += (i + " ");
			}
		    }

		    String[] indexes = indexesFound.split(" ");

		    for (int i = 0; i < indexes.length; i++) {
			displayBuilder.replace(Integer.parseInt(indexes[i]), Integer.parseInt(indexes[i]) + 1,
				Character.toString(guess));
		    }

		    if (wordToGuess.equals(displayBuilder.toString())) {
			incorrectGuesses = -1;
		    }
		} else {
		    if (!incorrectLetters.contains(String.valueOf(guess))) {
			incorrectLetters += (guess + ", ");
			incorrectGuesses++;
		    }
		}
	    }
	    String win = (incorrectGuesses == -1) ? "You won!" : "You lost!";

	    System.out.println("Game over! " + win);
	    System.out.print("The word was: " + wordToGuess);
	    System.out.println(" | Incorrect guesses: " + incorrectLetters);
	    System.out.print("\nWould you like to play again? y/n: ");
	} while (scanner.next().charAt(0) == 'y');
	scanner.close();
    }

    public static void drawHangman(int attempts) {
	switch (attempts) {
	case 0:
	    System.out.println("┏╷━━━━┼━━━━");
	    System.out.println("┃╯    ┋    ");
	    System.out.println("┃          ");
	    System.out.println("┃          ");
	    System.out.println("┃          ");
	    System.out.println("┃          ");
	    System.out.println("┃          ");
	    System.out.println("┃╧╧╧╧╧╧╧╧╧╧╧╧");
	    System.out.println("┃╳╳╳╳╳╳╳╳╳╳╳╳╲");
	    System.out.println("┗═════════════");
	    break;
	case 1:
	    System.out.println("┏╷━━━━┼━━━━");
	    System.out.println("┃╯    ┋    ");
	    System.out.println("┃     0    ");
	    System.out.println("┃          ");
	    System.out.println("┃          ");
	    System.out.println("┃          ");
	    System.out.println("┃          ");
	    System.out.println("┃╧╧╧╧╧╧╧╧╧╧╧╧");
	    System.out.println("┃╳╳╳╳╳╳╳╳╳╳╳╳╲");
	    System.out.println("┗═════════════");
	    break;
	case 2:
	    System.out.println("┏╷━━━━┼━━━━");
	    System.out.println("┃╯    ┋    ");
	    System.out.println("┃     0    ");
	    System.out.println("┃     |    ");
	    System.out.println("┃          ");
	    System.out.println("┃          ");
	    System.out.println("┃          ");
	    System.out.println("┃╧╧╧╧╧╧╧╧╧╧╧╧");
	    System.out.println("┃╳╳╳╳╳╳╳╳╳╳╳╳╲");
	    System.out.println("┗═════════════");
	    break;
	case 3:
	    System.out.println("┏╷━━━━┼━━━━");
	    System.out.println("┃╯    ┋    ");
	    System.out.println("┃     0    ");
	    System.out.println("┃    -|    ");
	    System.out.println("┃          ");
	    System.out.println("┃          ");
	    System.out.println("┃          ");
	    System.out.println("┃╧╧╧╧╧╧╧╧╧╧╧╧");
	    System.out.println("┃╳╳╳╳╳╳╳╳╳╳╳╳╲");
	    System.out.println("┗═════════════");
	    break;
	case 4:
	    System.out.println("┏╷━━━━┼━━━━");
	    System.out.println("┃╯    ┋    ");
	    System.out.println("┃     0    ");
	    System.out.println("┃    -|-    ");
	    System.out.println("┃          ");
	    System.out.println("┃          ");
	    System.out.println("┃          ");
	    System.out.println("┃╧╧╧╧╧╧╧╧╧╧╧╧");
	    System.out.println("┃╳╳╳╳╳╳╳╳╳╳╳╳╲");
	    System.out.println("┗═════════════");
	    break;
	case 5:
	    System.out.println("┏╷━━━━┼━━━━");
	    System.out.println("┃╯    ┋    ");
	    System.out.println("┃     0    ");
	    System.out.println("┃    -|-    ");
	    System.out.println("┃    /      ");
	    System.out.println("┃          ");
	    System.out.println("┃          ");
	    System.out.println("┃╧╧╧╧╧╧╧╧╧╧╧╧");
	    System.out.println("┃╳╳╳╳╳╳╳╳╳╳╳╳╲");
	    System.out.println("┗═════════════");
	    break;
	case 6:
	    System.out.println("┏╷━━━━┼━━━━");
	    System.out.println("┃╯    ┋    ");
	    System.out.println("┃     0    ");
	    System.out.println("┃    -|-    ");
	    System.out.println("┃    / \\     ");
	    System.out.println("┃          ");
	    System.out.println("┃          ");
	    System.out.println("┃╧╧╧╧╧╧╧╧╧╧╧╧");
	    System.out.println("┃╳╳╳╳╳╳╳╳╳╳╳╳╲");
	    System.out.println("┗═════════════");
	    break;
	}
    }
}