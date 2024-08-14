package hms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.JPasswordField;

@SuppressWarnings("serial")
public class SignIn extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		Database.s.add(new Staff("usman", "1111111111", "1234"));
		Database.s.add(new Staff("saim", "1111111112", "1234"));
		Database.s.add(new Staff("hamid", "1111111113", "1234"));
		Database.s.add(new Staff("malik", "1111111114", "1234"));
		Database.s.add(new Staff("1", "1", "1"));

		if (Database.count == 0) {

			for (int i = 0; i < 7; i++) {
				for (int j = 0; j < 20; j++) {
					if (i == 0) {
						Database.monday.add(j, new Room(j + 1, true));
					} else if (i == 1) {
						Database.tuesday.add(j, new Room(j + 1, true));
					} else if (i == 2) {
						Database.wednesday.add(j, new Room(j + 1, true));
					} else if (i == 3) {
						Database.thursday.add(j, new Room(j + 1, true));
					} else if (i == 4) {
						Database.friday.add(j, new Room(j + 1, true));
					} else if (i == 5) {
						Database.saturday.add(j, new Room(j + 1, true));
					} else if (i == 6) {
						Database.sunday.add(j, new Room(j + 1, true));
					}
				}
			}
			Database.count = 1;
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignIn frame = new SignIn();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SignIn() {
		setTitle("Sign In");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 817, 511);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel hms = new JLabel("Hotel Management System");
		hms.setForeground(Color.WHITE);
		hms.setFont(new Font("Tahoma", Font.BOLD, 24));
		hms.setBounds(263, 71, 328, 36);
		contentPane.add(hms);

		username = new JTextField();
		username.setToolTipText("");
		username.setFont(new Font("Tahoma", Font.PLAIN, 18));
		username.setBounds(372, 197, 202, 26);
		contentPane.add(username);
		username.setColumns(10);

		JButton signin = new JButton("Sign In");
		signin.setBackground(Color.WHITE);
		signin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				String inputUsername = username.getText();
				String inputPassword = new String(passwordField.getPassword());

				boolean isValid = false;

				// Check if the provided credentials are valid
				for (Staff staff : Database.s) {
					if (staff.getName().equals(inputUsername) && staff.getPassword().equals(inputPassword)) {
						isValid = true;
						break;
					}
				}

				if (isValid) {
					new HMS_Main().setVisible(true);
					dispose();
				} else {
					// Show an error message for invalid credentials
					JOptionPane.showMessageDialog(null, "Invalid username or password", "Sign In Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		signin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		signin.setBounds(386, 333, 99, 36);
		contentPane.add(signin);

		JLabel usernameLabel = new JLabel("Username: ");
		usernameLabel.setForeground(Color.WHITE);
		usernameLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		usernameLabel.setBounds(263, 197, 99, 26);
		contentPane.add(usernameLabel);

		JLabel passwordLabel = new JLabel("Password:");
		passwordLabel.setForeground(Color.WHITE);
		passwordLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		passwordLabel.setBounds(263, 261, 99, 26);
		contentPane.add(passwordLabel);

		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		passwordField.setBounds(372, 261, 202, 26);
		contentPane.add(passwordField);
	}
}
