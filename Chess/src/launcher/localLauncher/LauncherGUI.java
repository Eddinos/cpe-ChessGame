package launcher.localLauncher;

import java.util.Observer;

import javax.swing.JFrame;

import model.observable.ChessGame;
import controler.controlerLocal.ChessGameControler;
import vue.ChessGameCmdLine;
import vue.observer.ChessGameGUI;

public class LauncherGUI 
{

	public static void main(String[] args) {
		
		ChessGame chessGame;
		ChessGameControler chessGameControler;
		ChessGameCmdLine cmdView;
		
		chessGame = new ChessGame();	
		
		chessGameControler = new ChessGameControler(chessGame);
				
		cmdView = new ChessGameCmdLine(chessGameControler);
		
		
		
		JFrame frame = new ChessGameGUI(cmdView);
		frame.pack();
		frame.setResizable(true);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		chessGame.addObserver((Observer)frame);
		chessGame.Init();
	}

}
