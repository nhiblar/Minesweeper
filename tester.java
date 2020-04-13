package Minesweeper;

import java.util.Random;

public class Tester {

	public static void main(String[] args) {
		
		Random random = new Random();
		int x = random.nextInt(15) + 5;
		int y = random.nextInt(15) + 5;
		
		GameBoard newGame = new GameBoard(x, y);
		System.out.println("Input: ");
		newGame.printBoard();
		System.out.println("Output: ");
		newGame.solve();
		newGame.printBoard();
	}

	

}
