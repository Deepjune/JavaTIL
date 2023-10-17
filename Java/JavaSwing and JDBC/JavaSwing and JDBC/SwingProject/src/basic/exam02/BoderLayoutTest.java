package basic.exam02;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BoderLayoutTest extends JFrame {
	public BoderLayoutTest() {
		setTitle("BorderLayoutTest");
		setSize(300,150);
		
		JPanel panel = new JPanel(new BorderLayout());
		
		JButton b1 = new JButton("North");
		JButton b2 = new JButton("Center");
		JButton b3 = new JButton("West");
		JButton b4 = new JButton("East");
		JButton b5 = new JButton("South");
		
		add(b1, "North");
		add(b2, "Center");
		add(b3, "West");
		add(b4, "East");
		add(b5, "South");
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		BoderLayoutTest b = new BoderLayoutTest();

	}

}
