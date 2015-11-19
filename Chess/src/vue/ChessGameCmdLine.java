package vue;

import controler.controlerLocal.ChessGameControler;
import model.Coord;
import model.observable.ChessGame;



/**
 * @author francoise.perrin
 * Inspiration Jacques SARAYDARYAN, Adrien GUENARD *
 * 
 */
public class ChessGameCmdLine {
	
	public   ChessGameCmdLine(ChessGameControler chessGameControler) {
		
		System.out.println(chessGameControler + "\n");
		
		/*chessGameControler.move(new Coord(3,6), new Coord(3, 4));	// true
		System.out.print(chessGameControler);

		
		chessGameControler.move(new Coord(3,4), new Coord(3, 6));	// false
		System.out.print(chessGameControler);
		
		
		chessGameControler.move(new Coord(4, 1), new Coord(4, 3));	// true
		System.out.print(chessGameControler);

		
		chessGameControler.move(new Coord(3, 4), new Coord(3, 4));	// false
		System.out.print(chessGameControler);

		
		chessGameControler.move(new Coord(3, 4), new Coord(4, 3));	// true
		System.out.print(chessGameControler);*/

		
	}

}
