package boardgame;

public class Piece {
	protected Position position;
	private Board tabuleiro;
	
	public Piece(Board tabuleiro) {
		this.tabuleiro = tabuleiro;
		position = null;
	}

	protected Board getTabuleiro() {
		return tabuleiro;
	}
	
}
