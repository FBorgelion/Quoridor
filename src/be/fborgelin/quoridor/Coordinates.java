package be.fborgelin.quoridor;

public class Coordinates {
	
	//Attributs
	private int a;
	private int b;
	
	//Mutators and accessors
	public int getA() {
		return a;
	}
	
	public void setA(int a) {
		this.a = a;
	}
	
	public int getB() {
		return b;
	}
	
	public void setB(int b) {
		this.b = b;
	}
	
	//Constructor
	public Coordinates(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
}
