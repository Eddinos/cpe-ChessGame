package model.observable;

import java.util.Observer;

import model.Couleur;

public interface IChessGame {
	public String toString(); 
	public boolean move (int xInit, int yInit, int xFinal, int yFinal); 
	public boolean isEnd();
	public String getMessage();
	public Couleur getColorCurrentPlayer(); 
	
}
