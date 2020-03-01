package be.fborgelin.quoridor;

import java.util.*;

public class Board {
			
	public void setWallOnBoard(int n, int p, Wall wall) {
		board[n][p] = wall;
	}	
	
	//Attributs
	private int nCols;
	private int nLines;
	private PlayablePieces[][] board; //tableau pouvant contenir differents types de pions
	
	//Constructor
	public Board(int n, int p) {
		nLines = n;
		nCols = p;
		board = new PlayablePieces[n][p];
		for(int i = 0; i < nLines; i++) {
			for(int j = 0; j < nCols; j++){				
				board[i][j] = null;		
			}
		}
	}	
	
	//Methods
	public void displayBoard() {	//affiche le board
		System.out.println();
		for(int i = 0; i < nLines; i++) {
			for(int j = 0; j < nCols; j++) {		         
				System.out.print(" | " + board[i][j]);
			}
			System.out.println(" | ");
		}
		System.out.println();
	}

}
