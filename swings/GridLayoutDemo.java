package swings;

import java.awt.*;
import javax.swing.*;

public class GridLayoutDemo extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GridLayoutDemo() {
		super("GridLayout Demo");
		Container c = getContentPane();
		c.setLayout(new GridLayout(0, 3));

		c.add(new JButton("1"));
		c.add(new JButton("2"));
		c.add(new JButton("33"));
		c.add(new JButton("4"));
		c.add(new JButton("5"));

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new GridLayoutDemo();
	}

}
