package vue.observer;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

import model.PieceIHM;
import tools.ChessImageProvider;
import vue.ChessGameCmdLine;

public class ChessGameGUI extends JFrame implements MouseListener, MouseMotionListener, Observer
{
	
	ChessGameCmdLine cmdView;
	JLayeredPane layeredPane;
	JPanel chessBoard;
	JLabel chessPiece;
	int xAdjustment;
	int yAdjustment;
	private List<PieceIHM> pieces;
	
	public ChessGameGUI(ChessGameCmdLine cmdView)
	{
		this.cmdView = cmdView;
		Dimension boardSize = new Dimension(800, 800);
		
		// Use a Layered Pane for this this application
		layeredPane = new JLayeredPane();
		getContentPane().add(layeredPane);
		layeredPane.setPreferredSize(boardSize);
		layeredPane.addMouseListener(this);
		layeredPane.addMouseMotionListener(this);
		
		// Add a chess board to the Layered Pane
		chessBoard = new JPanel();
		layeredPane.add(chessBoard, JLayeredPane.DEFAULT_LAYER);
		chessBoard.setLayout(new GridLayout(8, 8));
		chessBoard.setPreferredSize(boardSize);
		chessBoard.setBounds(0, 0, boardSize.width, boardSize.height);
		
		for (int i = 0; i < 64; i++) 
		{
			JPanel square = new JPanel(new BorderLayout());
			chessBoard.add(square);

			int row = (i / 8) % 2;
			if (row == 0)
				square.setBackground(i % 2 == 0 ? Color.black : Color.white);
			else
				square.setBackground(i % 2 == 0 ? Color.white : Color.black);
		}
		
		
	}

	@Override
	public void update(Observable o, Object arg) 
	{
		pieces = (List<PieceIHM>) arg;
		drawPieces(pieces);
	}

	private void drawPieces(List<PieceIHM> pieces)
	{
		JLabel piece = new JLabel(new ImageIcon(
				"images/cavalierBlancS.png"));
		JPanel panel = (JPanel) chessBoard.getComponent(0);
		panel.add(piece);
		int i = 0;
		for (PieceIHM pieceIHM : pieces) 
		{
			
			
		}
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
