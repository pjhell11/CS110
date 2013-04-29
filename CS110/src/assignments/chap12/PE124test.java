package assignments.chap12;

import javax.swing.*;

import java.awt.*;

public class PE124test extends JFrame {

	public PE124test() {
		setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		PE124 p1 = new PE124(1,2,3);
		PE124 p2 = new PE124(4,5,6);
		add(p1);
		add(p2);
	}
	
	public static void main(String[] args) {
		Flow frame = new Flow();
		frame.setTitle("PE 12.4");
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
