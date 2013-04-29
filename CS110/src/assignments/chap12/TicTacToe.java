package assignments.chap12;

import javax.swing.*;

import java.awt.*;
import java.util.Random;

public class TicTacToe extends JFrame {
	ImageIcon x = new ImageIcon("images/x.gif");
	ImageIcon o = new ImageIcon("images/o.gif");
	
	public TicTacToe() {
		setLayout(new GridLayout(3,3));
		
		Random rand = new Random();
		
		int numberOfTiles = 9;
		
		for(int i = 0; i < numberOfTiles; i++) {
			if (rand.nextInt(2) == 0) {
				add(new JLabel(x));
			}
			else {
				add(new JLabel(o));
			}
		}
	}
	
	public static void main(String[] args) {
		TicTacToe frame = new TicTacToe();
		frame.setTitle("Tic Tac Toe");
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
