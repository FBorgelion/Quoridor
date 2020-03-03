package be.fborgelin.quoridor;

public class Game {
	
	private final int n = 7;
	private final int p = 7; //board 7x7 default
	
	Pawn pieceP1;
	Pawn pieceP2; 
	
	Player p1 = new Player(pieceP1);
	Player p2 = new Player(pieceP2);
	
	Board boardGame;
	
	public Game(Player p1, Player p2) {
		this.p1 = p1;
		this.p2 = p2;
		this.boardGame = new Board(n, p);
	}
	
/*	public void setPawnOnStart() {	//set pawn on start
		int mid = (p / 2) + (p % 2);
		boardGame[n][mid] = pieceP1;
		boardGame[0][mid] = pieceP2; //search how to get correct
	}*/
	
}
