package swings;

import java.awt.*;

import javax.swing.*;

public class BorderLayoutDemo extends JFrame {

	private static final long serialVersionUID = 1L;

	public BorderLayoutDemo() {
		super("BorderLayout Demo");
		Container c = getContentPane();
		c.add(new JButton("Top Button"), BorderLayout.PAGE_START);
		c.add(new JButton("Bottom Button"), BorderLayout.PAGE_END);
		c.add(new JButton("Left Button"), BorderLayout.LINE_START);

		c.add(new JButton("Right Button"), BorderLayout.LINE_END);
		// c.add(new JButton("Center Button"), BorderLayout.CENTER);

		JPanel p = new JPanel();
		p.add(new JLabel("Label"));
		p.add(new JTextField(20));
		c.add(p);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new BorderLayoutDemo();
	}

}
