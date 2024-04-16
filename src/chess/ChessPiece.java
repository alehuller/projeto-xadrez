package chess;

import boardgame.Piece;
import boardgame.Board;

public class ChessPiece extends Piece{
	
	private Color color;

	public ChessPiece(Board tabuleiro, Color color) {
		super(tabuleiro);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
}
