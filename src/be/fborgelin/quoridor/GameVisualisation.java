package be.fborgelin.quoridor;

public class GameVisualisation {
	
	private Game game;
	
	public GameVisualisation(Game game) {
		this.game = game;
	}
	
/*	public void displayBoard() {	//affiche le board
		System.out.println();
		for(int i = 0; i < game.boardGame.nLines; i++) {
			for(int j = 0; j < game.boardGame.nCols; j++) {	
				if(game.boardGame[i][j] == Pawn.class) {				//how to make it correct?
					System.out.println("P");
				}
				else if(game.boardGame[i][j] == Wall.class) {
					System.out.println("W");
				}
				else if(game.boardGame[i][j] == null) {
					System.out.println("0");
				}
				System.out.print(" | " + game.boardGame[i][j]); //what's wrong ?
			}
			System.out.println(" | ");
		}
		System.out.println(); 	*/
	}

	public static void main(String[] args) {
		
		

	}

}
