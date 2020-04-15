//Nate Hiblar

package Minesweeper;

import java.util.Scanner;

public class GetUserInput {

	public static int getSizeFromUser() {

		int choice = 0;
		Scanner kb = new Scanner(System.in);
		String input = kb.nextLine();
		try {
			choice = Integer.parseInt(input); 
		}catch(NumberFormatException e) {
			System.out.println("input is not an int value"); 
		} 

		return choice;
	}


}
