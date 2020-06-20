package swings;

import java.awt.*;
import java.util.Date;
import javax.swing.*;

public class SimpleFrame extends JFrame {
	private static final long serialVersionUID = 1L;

	public SimpleFrame() {
		super("Date And Time");
		Container c = getContentPane();
		JLabel label = new JLabel();
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setText(new Date().toString());
		c.add(label);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		SimpleFrame f = new SimpleFrame();
		f.setSize(300, 200);
		f.setVisible(true);
	}

}
