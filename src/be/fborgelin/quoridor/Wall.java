package be.fborgelin.quoridor;

public class Wall implements PlayablePieces {
	
	private int n;
	private int p;
	
	public Wall(int n, int p) {
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
	/* cr�er un dico reprenant ces coords et les associer � l'objet auquel elles sont li�s
	 * m�thode traduisant les coords en case de tableau
	 */
	public CoupleOfNumbers getCoordonates() {	
		Wall wall = new Wall(n, p);
		int a = wall.getN();
		int b = wall.getP();
		return new CoupleOfNumbers(a, b);
	}



	

}


