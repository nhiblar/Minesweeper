//Nate Hiblar

package Minesweeper;

import java.util.Random;

public class Tester {

	public static void main(String[] args) {
		
		Random random = new Random();
		System.out.println("Choose the size of the Minesweeper board."
						+ "\nEnter the number of rows: ");
		int x = GetUserInput.getSizeFromUser();
		System.out.println("Enter the number of columns: ");
		int y = GetUserInput.getSizeFromUser();
		
		GameBoard newGame = new GameBoard(x, y);
		System.out.println("Input: ");
		newGame.printBoard();
		System.out.println("Output: ");
		newGame.solve();
		newGame.printBoard();
	}

	

}
