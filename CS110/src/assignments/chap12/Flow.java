package assignments.chap12;

import javax.swing.*;
import java.awt.*;

public class Flow extends JFrame {
	public Flow() {
		setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		JPanel p1 = new JPanel();
		p1.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		JPanel p2 = new JPanel();
		p2.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		p1.add(new JButton("Button 1"));
		p1.add(new JButton("Button 2"));
		p1.add(new JButton("Button 3"));
		
		p2.add(new JButton("Button 4"));
		p2.add(new JButton("Button 5"));
		p2.add(new JButton("Button 6"));
		
		add(p1);
		add(p2);
	}
	
	public static void main(String[] args) {
		Flow frame = new Flow();
		frame.setTitle("PE 12.1");
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
}
