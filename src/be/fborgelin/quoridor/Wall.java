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
	/* créer un dico reprenant ces coords et les associer à l'objet auquel elles sont liés
	 * méthode traduisant les coords en case de tableau
	 */
	public Coordinates getCoordinates() {	
		Wall wall = new Wall(n, p);
		int a = wall.getN();
		int b = wall.getP();
		return new Coordinates(a, b);
	}

	@Override
	public void setCoordinates(int n, int p) {
		setN(n);
		setP(p);		
	}



	

}


