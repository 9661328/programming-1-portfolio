/*
 * Written by: Jonathan Su
 * Date: 12/14/2021
 * 
 * A console Tic-Tac-Toe game.
 * */

import java.util.*;
import java.awt.*;
import javax.swing.*;

public class TicTacToe {

    static int windowSize = 500;

    public static void main(String[] args) {
	// graphics don't work yet
	JFrame frame = new JFrame("Tic Tac Toe");
	frame.setSize(windowSize, windowSize);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setLayout(null);

	Button b = new Button("Click here");
	b.setBounds(0, 20, 100, 30);
	frame.add(b);
	frame.setVisible(true);

	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a coordinate with no parentheses, separated by a comma: row,column");

	String[][] board = { { "#", "#", "#" }, { "#", "#", "#" }, { "#", "#", "#" } };

	int player = 1;
	boolean win = false;

	do {
	    System.out.print("Player " + player + ": ");
	    String coordinate = scanner.nextLine();

	    if (coordinate.length() != 3) {
		System.out.println("Invalid coordinate format, try again.\n");
		continue;
	    }

	    int row = Integer.parseInt(String.valueOf(coordinate.charAt(0)));
	    int column = Integer.parseInt(String.valueOf(coordinate.charAt(2)));

	    if (row < 4 && column < 4) {
		if (board[row - 1][column - 1].equals("#")) {
		    if (player == 1) {
			board[row - 1][column - 1] = "X";
			player = 2;
		    } else if (player == 2) {
			board[row - 1][column - 1] = "O";
			player = 1;
		    }
		} else {
		    System.out.println("Place is already taken, try again.\n");
		    continue;
		}
	    } else {
		System.out.println("Invalid coordinate, try again.\n");
		continue;
	    }

	    for (String[] r : board) {
		for (String c : r) {
		    System.out.printf("%2s", c);
		}
		System.out.println();
	    }
	    System.out.println();

	    for (int i = 0; i < 3; i++) {
		int j = 0;
		// checks rows
		if ((board[i][j].equals("X") && board[i][j + 1].equals("X") && board[i][j + 2].equals("X"))
			|| (board[i][j].equals("O") && board[i][j + 1].equals("O") && board[i][j + 2].equals("O"))) {
		    if (player == 1) {
			player = 2;
		    } else {
			player = 1;
		    }
		    System.out.println("Player " + player + " won!");
		    win = true;
		}

		// checks columns
		if ((board[j][i].equals("X") && board[j + 1][i].equals("X") && board[j + 2][i].equals("X"))
			|| (board[j][i].equals("O") && board[j + 1][i].equals("O") && board[j + 2][i].equals("O"))) {
		    if (player == 1) {
			player = 2;
		    } else {
			player = 1;
		    }
		    System.out.println("Player " + player + " won!");
		    win = true;
		}
	    }

	    // checks for diagonals
	    if ((board[0][0].equals("X") && board[1][1].equals("X") && board[2][2].equals("X"))
		    || board[0][2].equals("X") && board[1][1].equals("X") && board[2][0].equals("X")) {
		System.out.println("Player 1 won!");
		win = true;
	    }

	    if ((board[0][0].equals("O") && board[1][1].equals("O") && board[2][2].equals("O"))
		    || board[0][2].equals("O") && board[1][1].equals("O") && board[2][0].equals("O")) {
		System.out.println("Player 2 won!");
		win = true;
	    }

	} while (!win);
	scanner.close();
    }
}