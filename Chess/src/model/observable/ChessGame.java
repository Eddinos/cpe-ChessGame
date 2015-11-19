package model.observable;

import java.util.Observable;
import java.util.Observer;

import model.Couleur;
import model.Echiquier;

public class ChessGame extends Observable implements IChessGame
{
	private Echiquier chessBoard;	
	
	public String toString()
	{
		return  chessBoard.toString() + getMessage() + '\n';
	}
	
	public ChessGame() 
	{
		chessBoard = new Echiquier();
	}
	
	public void Init()
	{
		notifyObservers();

	}
	
	@Override
	public void notifyObservers() 
	{
		setChanged();
		notifyObservers(chessBoard.getPiecesIHM());
	}

	@Override
	public boolean move(int xInit, int yInit, int xFinal, int yFinal) 
	{
		
		Boolean move = false;
		if(chessBoard.isMoveOk(xInit, yInit, xFinal, yFinal))
		{
			move =  chessBoard.move(xInit, yInit, xFinal, yFinal);
			chessBoard.switchJoueur();
		}
		notifyObservers();
		return move;
		
	}

	@Override
	public boolean isEnd() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getMessage() {
		return chessBoard.getMessage();
	}

	@Override
	public Couleur getColorCurrentPlayer() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
