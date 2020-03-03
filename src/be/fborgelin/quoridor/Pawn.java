package be.fborgelin.quoridor;

public class Pawn implements PlayablePieces {
	
	private int n;
	private int p;
	private Pawn pawn;
	
	public Pawn(int n, int p) {
		this.n = n;
		this.p = p;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int getP() {
		return p;
	}

	public void setP(int p) {
		this.p = p;
	}

	@Override
	public Coordinates getCoordinates() { 
		int a = pawn.getN();
		int b = pawn.getP();
		return new Coordinates(a, b);
	}

	@Override
	public void setCoordinates(int n, int p) {
		pawn.setN(n);
		pawn.setP(p);
	}



}
