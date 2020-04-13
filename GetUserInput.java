//Nate Hiblar

package Minesweeper;

import java.util.Scanner;

public class GetUserInput {

	public static int getSizeFromUser() {
		
		int choice = 0;
		do {
			Scanner kb = new Scanner(System.in);
			String input = kb.nextLine();
			try {
				choice = Integer.parseInt(input); 
			}catch(NumberFormatException e) {
				System.out.println("input is not an int value"); 
			} 

		}while(choice < 1 || choice > 100);
		
		return choice;
	}


}
