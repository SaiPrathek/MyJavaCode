package swings;

import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import javax.swing.*;

public class EventWithInnerClass extends JFrame {
	private static final long serialVersionUID = 1L;

	JButton b1;
	JLabel lbl;

	public EventWithInnerClass() {
		super("Event With Inner CLass");
		lbl = new JLabel();
		lbl.setHorizontalAlignment(JLabel.CENTER);
		b1 = new JButton("Click Here");
		b1.addActionListener(new ActionEventHandler());

		Container c = getContentPane();
		c.add(lbl);
		c.add(b1, BorderLayout.PAGE_END);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(300, 200);
	}

	class ActionEventHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			lbl.setText(new Date().toString());
		}
	}

	public static void main(String[] args) {
		new EventWithInnerClass();
	}

}
