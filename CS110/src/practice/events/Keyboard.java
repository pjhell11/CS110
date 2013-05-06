package practice.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;


public class Keyboard extends JFrame {
	public Keyboard() {
		JPanel p = new JPanel();
		setTitle("Keyboard Listener");
		JTextField tf = new JTextField(12);
		tf.addKeyListener(new KeyboardTracker());
		p.add(tf);
		add(p);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		Keyboard x = new Keyboard();
	}
	
	class KeyboardTracker implements KeyListener {

		@Override
		public void keyPressed(KeyEvent arg0) {
			System.out.println(arg0.getKeyChar() + " Key Pressed");
		}

		@Override
		public void keyReleased(KeyEvent arg0) {
			System.out.println(arg0.getKeyChar() + " Key Released");

		}

		@Override
		public void keyTyped(KeyEvent arg0) {
			System.out.println(arg0.getKeyChar() + " Key Typed");

		}
		
	}

}
