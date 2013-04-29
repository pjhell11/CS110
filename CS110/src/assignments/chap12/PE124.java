package assignments.chap12;


import javax.swing.*;

import java.awt.*;

public class PE124 extends JPanel {
	public PE124(int b1, int b2, int b3) {
		
		PE124 panel = new PE124(b1, b2, b3);
		panel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		panel.add(new JButton("Button " + b1));
		panel.add(new JButton("Button " + b2));
		panel.add(new JButton("Button " + b3));
	}
	
}
