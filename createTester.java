//Nate Hiblar

package Minesweeper;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class createTester {

	public static void main(String[] args) throws FileNotFoundException {
		
		char[][] board;
		int row = 1;
		int col = 1;
		int percent = 0;
		PrintStream	output = new PrintStream(new File("mines.txt"));
	
		while(row > 0 && col > 0) {
			System.out.println("Rows? : ");
			col = GetUserInput.getSizeFromUser();
			System.out.println("Columns? : ");
			row = GetUserInput.getSizeFromUser();
			System.out.println("Percent? : ");
			percent = GetUserInput.getSizeFromUser();

			board = new char[row][col];
			
			output.print(col + " " + row);
			output.println();

			for(int i = 0; i < row; i++) {
				for(int j = 0; j < col; j++) {
					char ch;
					ch = ((int)Math.random() * 100 < percent) ? '*' : '.' ;
					output.print(ch);
				}
				output.println();
			}
		}
	}//end main
}

