package swings;

import java.awt.*;
import javax.swing.*;

public class NullLayoutDemo extends JFrame {
	private static final long serialVersionUID = 1L;

	public NullLayoutDemo() {
		super("NullLayout Demo");
		Container c = getContentPane();
		c.setLayout(null);
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		b1.setBounds(10, 20, 100, 20);
		c.add(b1);
		b2.setBounds(120, 30, 100, 20);
		c.add(b2);
		b3.setBounds(230, 40, 100, 20);
		c.add(b3);
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new NullLayoutDemo();
	}

}
