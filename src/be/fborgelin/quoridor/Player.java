package be.fborgelin.quoridor;

public class Player {
	
	private int nWalls = 10;	//number of walls per player set on 10
	Pawn pawn;
	
	//Constructor
	public Player(int nWalls, Pawn pawn) { //maybe delete pawn var)
		this.nWalls = nWalls;
		pawn = new Pawn(0, 0); //change the player constructor to get 1 pawn per player (not correct here)
	}
	
	//Accessors
	public int getnWalls() {
		return nWalls;
	}
	
	 //Mutators
	public void setnWalls(int v) {
		nWalls = v;
	}
	

}
