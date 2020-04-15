//Nate Hiblar

package Minesweeper;

//import java.io.BufferedReader;
//import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Minesweeper {

	public static void main(String[] args) throws IOException {
		
		Scanner kb = new Scanner(System.in);
		//BufferedReader br = new BufferedReader(new FileReader("minesTester.txt"));
		int row, col;
		int count = 1;
		
		do{
			//String str = br.readLine();
			String str = kb.nextLine();
			String[] strArrRowAndCol = str.split(" ");
			row = Integer.parseInt(String.valueOf(strArrRowAndCol[0]));
			col = Integer.parseInt(String.valueOf(strArrRowAndCol[1]));
			if(row != 0 && col != 0)	
				System.out.println("Field #" + count + ":");
			
			char[][] board = new char[row][col];
			
			for(int i = 0; i < row; i++) {
				//str = br.readLine();	
				str = kb.nextLine();
				for(int j = 0; j < col; j++) {
					board[i][j] = str.charAt(j);
				}
			}//end outer for
			
			solve(board);
			printBoard(board);
			System.out.println();
			count++;

		}while(row != 0 && col != 0);
	
	}//end main

	private static void printBoard(char[][] board) {

		for(int i = 0; i < board.length; i++) {	      
			for(int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}

	}

	private static void solve(char[][] board) {

		for(int i = 0; i < board.length; i++) {	      
			for(int j = 0; j < board[i].length; j++) {

				if(board[i][j] != '*') {
					int count = 0;
					boolean nw, n, ne, w, e, sw, s, se;
					nw = n = ne = w = e = sw = s = se = true;
					if(i == 0) ne = n = nw = false; 
					if(j == 0) nw = w = sw = false;
					if(i == board.length-1) sw = s = se = false;
					if(j == board[i].length - 1) ne = e = se = false;

					if(nw)
						if(board[i-1][j-1] == '*') count++;
					if(n)
						if(board[i-1][j]   == '*') count++;
					if(ne)
						if(board[i-1][j+1] == '*') count++;
					if(w)
						if(board[i]  [j-1] == '*') count++;
					if(e)
						if(board[i]  [j+1] == '*') count++;
					if(sw)
						if(board[i+1][j-1] == '*') count++;
					if(s)	
						if(board[i+1][j]   == '*') count++;
					if(se)	
						if(board[i+1][j+1] == '*') count++;

					board[i][j] = Character.forDigit(count,10);
				}//end if
			}//end inner for
		}//end outer for
	}//end solve

}//end Driver
