package be.fborgelin.quoridor;

public class Game {
	
	int n = 7;
	int p = 7; //board 7x7 default
	
	Pawn pieceP1;
	Pawn pieceP2; //will delete these pawn args and modify object player (am i right ?)
	
	Player p1 = new Player(5, pieceP1);
	Player p2 = new Player(5, pieceP2);
	
	Board board;
	
	public Game(Player p1, Player p2) {
		this.p1 = p1;
		this.p2 = p2;
		this.board = new Board(n, p);
	}
	
}
