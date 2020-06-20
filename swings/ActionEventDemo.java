package swings;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class ActionEventDemo extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;

	JButton b1;
	JLabel lbl;

	public ActionEventDemo() {
		super("ActionEvent Demo");

		b1 = new JButton("Click Here");
		b1.addActionListener(this);

		lbl = new JLabel();
		lbl.setHorizontalAlignment(JLabel.CENTER);

		Container c = getContentPane();
		c.add(lbl);
		c.add(b1, BorderLayout.PAGE_END);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(300, 200);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		lbl.setText(new Date().toString());
	}

	public static void main(String[] args) {
		new ActionEventDemo();
	}
}
