

import java.awt.*;
import javax.swing.*;


public class Sue extends JFrame {
	private static final long serialVersionUID = 1L;

	public Sue() {
		super("Sue");
		Container c = getContentPane();
		JLabel label = new JLabel();
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setText("SUE");
		c.add(label);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		Sue f = new Sue();
		f.setSize(300, 200);
		f.setVisible(true);
	}

}
