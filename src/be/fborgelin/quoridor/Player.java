package be.fborgelin.quoridor;

public class Player {
	
	private int nWalls = 5;	//number of walls per player set on 10
	Wall wallInventory[] = new Wall[nWalls];
	
	//Constructor
	public Player(Pawn pawn) {
		int n = this.nWalls;
		pawn = new Pawn(0, 0);
		for(int i = 0; i < n; i++) {		//create a certain number of walls and store in wallInventory 
			Wall wall = new Wall(i, i);
			wallInventory[i] = wall;
		} 
	}
	
	//Accessors
	public int getnWalls() {
		return nWalls;
	}
	
	 //Mutators
	public void setNWalls(int v) {
		nWalls = v;
	}
	
	public static void main(String[] args) {
		
		/*test for wallInventory and Player creation*/
		Pawn pawn = new Pawn(0,0);
		Player p = new Player(pawn);
		for(int k = 0; k < p.wallInventory.length; k++) {
			System.out.println(p.wallInventory[k]);
		}
	}
	

}
