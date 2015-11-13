package controler.controlerLocal;

import model.Coord;
import model.observable.ChessGame;

public class ChessGameControler {
	
	private ChessGame _chessGame;

	public ChessGameControler(ChessGame chessGame) 
	{
		_chessGame = chessGame;
	}

	public void move(Coord coord, Coord coord2) 
	{
		_chessGame.move(coord.x, coord.y, coord2.x, coord2.y);
	}

	public String getMessage() 
	{
		return _chessGame.getMessage();
	}
	
	public String toString()
	{
		return _chessGame.toString();
	}

}
