package basic.exam02;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame03 extends JFrame {
	public MyFrame03() {
		setSize(300, 150);
		setTitle("");
		
		setLayout(new GridLayout(2,1));
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		
		JButton b1 = new JButton("button1");
		b1.setBackground(Color.pink);
		JButton b2 = new JButton("button2");
		b2.setBackground(Color.green);
		
		add(p1);
		p1.setBackground(Color.yellow);
		p1.add(b1);
	
		add(p2);
		p2.setBackground(Color.blue);
		p2.add(b2);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	public static void main(String[] args) {
		MyFrame03 f = new MyFrame03();

	}

}
