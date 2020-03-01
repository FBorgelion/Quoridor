package be.fborgelin.quoridor;

public class Player {
	
	private int nWalls;	//nombre murs du joueur
	private Pawn pawn;	//attribution d'un pion au joueur
	
	//Constructor
	public Player(int w, Pawn p) {
		nWalls = w;
		pawn = p;
	}
	
	//Accessors
	public int getnWalls() {
		return nWalls;
	}
	
	 //Mutators
	public void setnWalls(int v) {
		nWalls = v;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
