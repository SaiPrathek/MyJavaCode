package swings;

import java.awt.*;
import javax.swing.*;

public class UserLoginFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	JTextField name;
	JPasswordField pwd;
	JButton log;

	public UserLoginFrame() {
		super("User Login");
		GridBagConstraints gbc = new GridBagConstraints();

		name = new JTextField(20);
		pwd = new JPasswordField(20);
		log = new JButton("Login");

		Container c = getContentPane();
		c.setLayout(new GridBagLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		c.add(new JLabel("User Name : "), gbc);

		gbc.gridwidth = 2;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.insets = new Insets(2, 2, 2, 2);
		c.add(name, gbc);

		gbc.gridx = 0;
		gbc.gridy = 1;
		c.add(new JLabel("Password : "), gbc);

		gbc.gridx = 1;
		gbc.gridwidth = 2;
		gbc.insets = new Insets(2, 2, 2, 2);
		c.add(pwd, gbc);

		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 3;
		gbc.fill = GridBagConstraints.NONE;
		gbc.insets = new Insets(2, 2, 2, 2);
		c.add(log, gbc);

		setSize(400, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new UserLoginFrame();
	}
}
