//Nate Hiblar

package Minesweeper;

import java.util.Random;

public class GameBoard{
	
	char[][] board;
	
	public GameBoard(int row, int col) {
		
		Random random = new Random();
		board = new char[row][col];
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				int tempVal = random.nextInt(4);
				board[i][j] = (tempVal < 1) ? '*' : '.';
			}
		}
	}
	
	void printBoard() {
		
		for(int i = 0; i < board.length; i++) {	      
			for(int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	void solve() {
		
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
	}//end output

}
