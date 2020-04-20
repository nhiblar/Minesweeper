//Nate Hiblar

package Minesweeper;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Random;

public class createTester {

	public static void main(String[] args) throws FileNotFoundException {
		
		char[][] board;
		int row = 1;
		int col = 1;
		int percent = 0;
		PrintStream	output = new PrintStream(new File("mines.txt"));
	
		while(row > 0 && col > 0) {
			Random rand = new Random();
			System.out.println("Rows? : ");
			row = GetUserInput.getSizeFromUser();
			System.out.println("Columns? : ");
			col = GetUserInput.getSizeFromUser();
			
			if(row != 0 && col != 0) {
				System.out.println("Percent? : ");
				percent = GetUserInput.getSizeFromUser();
				System.out.println(percent);
			}
			board = new char[row][col];
			
			output.print(row + " " + col);
			output.println();
			boolean flipMe = true;
			
			for(int i = 0; i < row; i++) {
				for(int j = 0; j < col; j++) {
					char ch;
					if(percent == 50) {
						ch = (flipMe) ? '*' : '.' ;
						flipMe = !flipMe;
					}else if(percent == 100)
						ch = '*';
					else
						ch = '.';
					output.print(ch);
				}
				output.println();
			}
		}
	}//end main
}

