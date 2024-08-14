package hms;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.JDesktopPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

@SuppressWarnings("serial")
public class HMS_Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HMS_Main frame = new HMS_Main();
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
	public HMS_Main() {
		setResizable(false);
		setBackground(Color.DARK_GRAY);

		setTitle("Room Booking");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 891, 511);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(Color.DARK_GRAY));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 209, 472);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Management");
		lblNewLabel.setBounds(35, 49, 148, 29);
		panel.add(lblNewLabel);
		lblNewLabel.setBackground(Color.DARK_GRAY);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setForeground(Color.WHITE);

		JLabel lblNewLabel_1 = new JLabel("Hotle");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1.setBackground(Color.DARK_GRAY);
		lblNewLabel_1.setBounds(78, 22, 55, 29);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("System");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1_1.setBackground(Color.DARK_GRAY);
		lblNewLabel_1_1.setBounds(67, 77, 86, 29);
		panel.add(lblNewLabel_1_1);

		JButton bookRoomBtn = new JButton("Book Room");
		bookRoomBtn.setBorder(new LineBorder(Color.black));
		bookRoomBtn.setBackground(Color.DARK_GRAY);
		bookRoomBtn.setForeground(Color.WHITE);
		bookRoomBtn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		bookRoomBtn.setBounds(0, 167, 209, 49);
		panel.add(bookRoomBtn);

		JButton btnLogout = new JButton("Logout");
		btnLogout.setBounds(46, 409, 113, 39);
		panel.add(btnLogout);
		btnLogout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new SignIn().setVisible(true);
				dispose();
			}
		});
		btnLogout.setForeground(Color.WHITE);
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnLogout.setBorder(new LineBorder(Color.black));
		btnLogout.setBackground(Color.GRAY);

		JButton btnBookings = new JButton("Bookings");
		btnBookings.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				new Booking().setVisible(true);
				dispose();
			}
		});
		btnBookings.setForeground(Color.WHITE);
		btnBookings.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnBookings.setBorder(new LineBorder(Color.black));
		btnBookings.setBackground(Color.DARK_GRAY);
		btnBookings.setBounds(0, 215, 209, 49);
		panel.add(btnBookings);
		
		JButton records = new JButton("Records");
		records.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Record().setVisible(true);
				dispose();
			}
		});
		records.setForeground(Color.WHITE);
		records.setFont(new Font("Tahoma", Font.PLAIN, 18));
		records.setBorder(new LineBorder(Color.black));
		records.setBackground(Color.DARK_GRAY);
		records.setBounds(0, 263, 209, 49);
		panel.add(records);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(Color.WHITE);
		tabbedPane.setBounds(258, 22, 561, 313);
		contentPane.add(tabbedPane);

		JDesktopPane monday = new JDesktopPane();
		monday.setBackground(Color.WHITE);
		tabbedPane.addTab("Monday", null, monday, null);
		monday.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(10, 11, 536, 263);
		monday.add(panel_1);
		panel_1.setLayout(null);

		// ---------------------- Tuesday ----------------------
		JDesktopPane tuesday = new JDesktopPane();
		tuesday.setBackground(Color.WHITE);
		tabbedPane.addTab("Tuesday", null, tuesday, null);

		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setBounds(10, 11, 536, 263);
		tuesday.add(panel_1_1);

		// ---------------------- Wednesday ----------------------

		JDesktopPane wednesday = new JDesktopPane();
		wednesday.setBackground(Color.WHITE);
		tabbedPane.addTab("Wednesday", null, wednesday, null);

//		String wednesdayTitle = tabbedPane.getTitleAt(tabbedPane.indexOfTab("Wednesday"));
//		System.out.println(wednesdayTitle);

		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBackground(Color.WHITE);
		panel_1_2.setBounds(10, 11, 536, 263);
		wednesday.add(panel_1_2);

		// ---------------------- Thursday ----------------------

		JDesktopPane thursday = new JDesktopPane();
		thursday.setBackground(Color.WHITE);
		tabbedPane.addTab("Thursday", null, thursday, null);

		JPanel panel_1_3 = new JPanel();
		panel_1_3.setLayout(null);
		panel_1_3.setBackground(Color.WHITE);
		panel_1_3.setBounds(10, 11, 536, 263);
		thursday.add(panel_1_3);

		// ---------------------- Friday ----------------------

		JDesktopPane friday = new JDesktopPane();
		friday.setBackground(Color.WHITE);
		tabbedPane.addTab("Friday", null, friday, null);

		JPanel panel_1_4 = new JPanel();
		panel_1_4.setLayout(null);
		panel_1_4.setBackground(Color.WHITE);
		panel_1_4.setBounds(10, 11, 536, 263);
		friday.add(panel_1_4);

		// ---------------------- Saturday ----------------------

		JDesktopPane saturday = new JDesktopPane();
		saturday.setBackground(Color.WHITE);
		tabbedPane.addTab("Saturday", null, saturday, null);

		JPanel panel_1_5 = new JPanel();
		panel_1_5.setLayout(null);
		panel_1_5.setBackground(Color.WHITE);
		panel_1_5.setBounds(10, 11, 536, 263);
		saturday.add(panel_1_5);

		// ---------------------- Sunday ----------------------

		JDesktopPane sunday = new JDesktopPane();
		sunday.setBackground(Color.WHITE);
		tabbedPane.addTab("Sunday", null, sunday, null);

		JPanel panel_1_6 = new JPanel();
		panel_1_6.setLayout(null);
		panel_1_6.setBackground(Color.WHITE);
		panel_1_6.setBounds(10, 11, 536, 263);
		sunday.add(panel_1_6);

		// Add a ChangeListener to the JTabbedPane
		tabbedPane.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int selectedTabIndex = tabbedPane.getSelectedIndex();
				String selectedTabTitle = tabbedPane.getTitleAt(selectedTabIndex);
				System.out.println("Selected tab: " + selectedTabTitle);

				// Perform your action here based on the selected tab
				if (selectedTabTitle.equals("Monday")) {
					// Handle Monday tab selection

					JScrollPane scrollPane = new JScrollPane();
					scrollPane.setBounds(49, 24, 454, 213);
					panel_1.add(scrollPane);

					table = new JTable();
					scrollPane.setViewportView(table);
					table.setModel(
							new DefaultTableModel(new Object[][] {}, new String[] { "Room ID", "Room Availability" }));

					Object[][] roomDataMON = new Object[20][2];
					for (int i = 0; i < 20; i++) {
						int roomID = Database.monday.get(i).getRoomNumber(); // Assuming room IDs start from 1
						boolean roomAvailability = Database.monday.get(i).getBooked(); // You can set this based on your
																						// data
						roomDataMON[i] = new Object[] { roomID, roomAvailability };
					}

					// Get the DefaultTableModel and add the room data
					DefaultTableModel model = (DefaultTableModel) table.getModel();
					for (Object[] rowData : roomDataMON) {
						model.addRow(rowData);
					}

				} else if (selectedTabTitle.equals("Tuesday")) {

					JScrollPane scrollPane_1 = new JScrollPane();
					scrollPane_1.setBounds(49, 24, 454, 213);
					panel_1_1.add(scrollPane_1);

					tTable = new JTable();
					scrollPane_1.setViewportView(tTable);
					tTable.setModel(
							new DefaultTableModel(new Object[][] {}, new String[] { "Room ID", "Room Availability" }));

					Object[][] roomDataTue = new Object[20][2];
					for (int i = 0; i < 20; i++) {
						int roomID = Database.tuesday.get(i).getRoomNumber();
						boolean roomAvailability = Database.tuesday.get(i).getBooked();
						roomDataTue[i] = new Object[] { roomID, roomAvailability };
					}

					DefaultTableModel model = (DefaultTableModel) tTable.getModel();
					for (Object[] rowData : roomDataTue) {
						model.addRow(rowData);
					}
				} else if (selectedTabTitle.equals("Wednesday")) {

					JScrollPane scrollPane_1 = new JScrollPane();
					scrollPane_1.setBounds(49, 24, 454, 213);
					panel_1_2.add(scrollPane_1);

					wTable = new JTable();
					scrollPane_1.setViewportView(wTable);
					wTable.setModel(
							new DefaultTableModel(new Object[][] {}, new String[] { "Room ID", "Room Availability" }));

					Object[][] roomDatawed = new Object[20][2];
					for (int i = 0; i < 20; i++) {
						int roomID = Database.wednesday.get(i).getRoomNumber();
						boolean roomAvailability = Database.wednesday.get(i).getBooked();
						roomDatawed[i] = new Object[] { roomID, roomAvailability };
					}

					DefaultTableModel model = (DefaultTableModel) wTable.getModel();
					for (Object[] rowData : roomDatawed) {
						model.addRow(rowData);
					}
				}

				else if (selectedTabTitle.equals("Thursday")) {

					JScrollPane scrollPane_1 = new JScrollPane();
					scrollPane_1.setBounds(49, 24, 454, 213);
					panel_1_3.add(scrollPane_1);

					TTable = new JTable();
					scrollPane_1.setViewportView(TTable);
					TTable.setModel(
							new DefaultTableModel(new Object[][] {}, new String[] { "Room ID", "Room Availability" }));

					Object[][] roomDatathu = new Object[20][2];
					for (int i = 0; i < 20; i++) {
						int roomID = Database.thursday.get(i).getRoomNumber();
						boolean roomAvailability = Database.thursday.get(i).getBooked();
						roomDatathu[i] = new Object[] { roomID, roomAvailability };
					}

					DefaultTableModel model = (DefaultTableModel) TTable.getModel();
					for (Object[] rowData : roomDatathu) {
						model.addRow(rowData);
					}
				}

				else if (selectedTabTitle.equals("Friday")) {

					JScrollPane scrollPane_1 = new JScrollPane();
					scrollPane_1.setBounds(49, 24, 454, 213);
					panel_1_4.add(scrollPane_1);

					fTable = new JTable();
					scrollPane_1.setViewportView(fTable);
					fTable.setModel(
							new DefaultTableModel(new Object[][] {}, new String[] { "Room ID", "Room Availability" }));

					Object[][] roomDatathu = new Object[20][2];
					for (int i = 0; i < 20; i++) {
						int roomID = Database.friday.get(i).getRoomNumber();
						boolean roomAvailability = Database.friday.get(i).getBooked();
						roomDatathu[i] = new Object[] { roomID, roomAvailability };
					}

					DefaultTableModel model = (DefaultTableModel) fTable.getModel();
					for (Object[] rowData : roomDatathu) {
						model.addRow(rowData);
					}
				}

				else if (selectedTabTitle.equals("Saturday")) {

					JScrollPane scrollPane_1 = new JScrollPane();
					scrollPane_1.setBounds(49, 24, 454, 213);
					panel_1_5.add(scrollPane_1);

					sTable = new JTable();
					scrollPane_1.setViewportView(sTable);
					sTable.setModel(
							new DefaultTableModel(new Object[][] {}, new String[] { "Room ID", "Room Availability" }));

					Object[][] roomDatathu = new Object[20][2];
					for (int i = 0; i < 20; i++) {
						int roomID = Database.saturday.get(i).getRoomNumber();
						boolean roomAvailability = Database.saturday.get(i).getBooked();
						roomDatathu[i] = new Object[] { roomID, roomAvailability };
					}

					DefaultTableModel model = (DefaultTableModel) sTable.getModel();
					for (Object[] rowData : roomDatathu) {
						model.addRow(rowData);
					}
				}

				else if (selectedTabTitle.equals("Sunday")) {

					JScrollPane scrollPane_1 = new JScrollPane();
					scrollPane_1.setBounds(49, 24, 454, 213);
					panel_1_6.add(scrollPane_1);

					suTable = new JTable();
					scrollPane_1.setViewportView(suTable);
					suTable.setModel(
							new DefaultTableModel(new Object[][] {}, new String[] { "Room ID", "Room Availability" }));

					Object[][] roomDatathu = new Object[20][2];
					for (int i = 0; i < 20; i++) {
						int roomID = Database.sunday.get(i).getRoomNumber();
						boolean roomAvailability = Database.sunday.get(i).getBooked();
						roomDatathu[i] = new Object[] { roomID, roomAvailability };
					}

					DefaultTableModel model = (DefaultTableModel) suTable.getModel();
					for (Object[] rowData : roomDatathu) {
						model.addRow(rowData);
					}
				}
			}
		});

		JButton bookingsBtn = new JButton("Book");
		bookingsBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				boolean dur = false, days = false, room = false;

				int durationInt = 0;
				try {
					durationInt = Integer.parseInt(duration.getText());
					dur = true;
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(contentPane, "Please enter a valid integer for duration.", "Error",
							JOptionPane.ERROR_MESSAGE);
				}

				String inputDay = day.getText();
				String[] validDays = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

				boolean isValidDay = false;
				for (String validDay : validDays) {
					if (validDay.equalsIgnoreCase(inputDay)) {
						isValidDay = true;
						break;
					}
				}

				if (isValidDay) {
					days = true;
				} else {
					JOptionPane.showMessageDialog(contentPane, "Please enter a valid day (Monday to Sunday).", "Error",
							JOptionPane.ERROR_MESSAGE);
				}

				int newRoomID = 0;
				try {
					newRoomID = Integer.parseInt(roomID.getText());
					if (newRoomID >= 1 && newRoomID <= 20) {

						room = true;
						// Check if the room ID is within the valid range (1 to 20)
					} else {
						room = false;
						// Display an error message if the room ID is not within the valid range
						JOptionPane.showMessageDialog(null, "Invalid room ID. Please enter a value between 1 and 20.");
					}
				} catch (NumberFormatException ex) {
					// Handle the case where roomID.getText() is not a valid integer
					// For example, you can show an error message to the user
					JOptionPane.showMessageDialog(null, "Invalid room ID. Please enter a valid integer.");
				}

				if (dur && days && room) {

					boolean isAvailable = checkListDays(newRoomID, day.getText());

					if (isAvailable) {

						Customer cust = new Customer(custName.getText(), custID.getText(), custPhone.getText());
						Database.c.add(cust);

						Database.b.add(new Booking(durationInt, newRoomID, cust, day.getText()));

						// Store booking information in a text file
						try {
							Path filePath = Paths.get("src/data/bookings.txt");
							if (!Files.exists(filePath)) {
								Files.createDirectories(filePath.getParent());
								Files.createFile(filePath);
							}

							BufferedWriter writer = new BufferedWriter(new FileWriter(filePath.toString(), true));

							String bookingData = String.format("%s,%s,%s,%d,%s%n", custName.getText(), custID.getText(),
									custPhone.getText(), newRoomID, day.getText());

							writer.write(bookingData);
							writer.close();

						} catch (IOException ee) {
							ee.printStackTrace();
							JOptionPane.showMessageDialog(null, "An error occurred while saving booking information.");
						}
						
						// receipt
						
						// Calculate total room charges based on room rate (you need to have room rates defined)
						double roomRate = 350.0;
						double totalRoomCharges = roomRate * durationInt;

						// Calculate service tax (10% of total room charges)
						double serviceTaxRate = 0.10;
						double serviceTax = totalRoomCharges * serviceTaxRate;

						// Calculate tourism tax (RM10 per night)
						double tourismTaxRate = 10.0;
						double tourismTax = durationInt * tourismTaxRate;

						// Calculate total charges
						double totalCharges = totalRoomCharges + serviceTax + tourismTax;

						// Generate receipt
						String receipt = "Receipt\n" +
						        "Customer Name: " + cust.getName() + "\n" +
						        "Customer ID: " + cust.getId() + "\n" +
						        "Phone Number: " + cust.getContactNumber() + "\n" +
						        "Room ID: " + newRoomID + "\n" +
						        "Day: " + day.getText() + "\n" +
						        "Duration: " + durationInt + " days\n" +
						        "Total Room Charges: RM " + totalRoomCharges + "\n" +
						        "Service Tax (10%): RM " + serviceTax + "\n" +
						        "Tourism Tax: RM " + tourismTax + "\n" +
						        "Total Charges: RM " + totalCharges;

						// Display receipt
						JOptionPane.showMessageDialog(null, receipt);
						
						
						// save receipts to files
						try {
						    BufferedWriter writer = new BufferedWriter(new FileWriter("src/data/receipts.txt", true));
						    writer.write(receipt);
						    writer.newLine();
						    writer.newLine();
						    writer.newLine();
						    writer.close();
						} catch (IOException ex) {
						    ex.printStackTrace();
						}

						
						JOptionPane.showMessageDialog(null, "Room booked successfully!");

						new Booking().setVisible(true);
						dispose();
					} else {
						// Room is already booked for the selected day
						JOptionPane.showMessageDialog(null, "Room is already booked for the selected day.");
					}
				}
			}
		});
		bookingsBtn.setBounds(723, 422, 142, 39);
		contentPane.add(bookingsBtn);
		bookingsBtn.setBackground(Color.DARK_GRAY);
		bookingsBtn.setForeground(Color.WHITE);
		bookingsBtn.setBorder(new LineBorder(Color.black));
		bookingsBtn.setFont(new Font("Tahoma", Font.PLAIN, 18));

		custName = new JTextField();
		custName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		custName.setBounds(348, 346, 167, 21);
		contentPane.add(custName);
		custName.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Customer Name");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(258, 350, 93, 14);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_3_1 = new JLabel("Customer ID");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3_1.setBounds(258, 375, 93, 14);
		contentPane.add(lblNewLabel_3_1);

		custID = new JTextField();
		custID.setFont(new Font("Tahoma", Font.PLAIN, 12));
		custID.setColumns(10);
		custID.setBounds(348, 371, 167, 21);
		contentPane.add(custID);

		custPhone = new JTextField();
		custPhone.setFont(new Font("Tahoma", Font.PLAIN, 12));
		custPhone.setColumns(10);
		custPhone.setBounds(348, 397, 167, 21);
		contentPane.add(custPhone);

		JLabel lblNewLabel_3_1_1 = new JLabel("Phone Number");
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3_1_1.setBounds(258, 401, 93, 14);
		contentPane.add(lblNewLabel_3_1_1);

		JLabel lblNewLabel_3_1_1_1 = new JLabel("Room ID");
		lblNewLabel_3_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3_1_1_1.setBounds(538, 349, 66, 14);
		contentPane.add(lblNewLabel_3_1_1_1);

		roomID = new JTextField();
		roomID.setFont(new Font("Tahoma", Font.PLAIN, 12));
		roomID.setColumns(10);
		roomID.setBounds(622, 343, 120, 21);
		contentPane.add(roomID);

		JLabel lblNewLabel_3_1_1_1_1 = new JLabel("Stay duration");
		lblNewLabel_3_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3_1_1_1_1.setBounds(538, 374, 84, 14);
		contentPane.add(lblNewLabel_3_1_1_1_1);

		duration = new JTextField();
		duration.setFont(new Font("Tahoma", Font.PLAIN, 12));
		duration.setColumns(10);
		duration.setBounds(622, 368, 120, 21);
		contentPane.add(duration);

		JLabel lblNewLabel_3_1_1_1_1_1 = new JLabel("Day");
		lblNewLabel_3_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3_1_1_1_1_1.setBounds(538, 396, 84, 14);
		contentPane.add(lblNewLabel_3_1_1_1_1_1);

		day = new JTextField();
		day.setFont(new Font("Tahoma", Font.PLAIN, 12));
		day.setColumns(10);
		day.setBounds(622, 390, 120, 21);
		contentPane.add(day);
	}

	public static boolean checkListDays(int roomID, String day) {
		if (day.equals("Monday")) {
			if (Database.monday.get(roomID - 1).getBooked() == true) {
				Database.monday.get(roomID - 1).setBooked(false);
				return true;
			} else {
				return false;
			}
		} else if (day.equals("Tuesday")) {
			if (Database.tuesday.get(roomID - 1).getBooked() == true) {
				Database.tuesday.get(roomID - 1).setBooked(false);
				return true;
			} else {
				return false;
			}
		} else if (day.equals("Wednesday")) {
			if (Database.wednesday.get(roomID - 1).getBooked() == true) {
				Database.wednesday.get(roomID - 1).setBooked(false);
				return true;
			} else {
				return false;
			}
		} else if (day.equals("Thursday")) {
			if (Database.thursday.get(roomID - 1).getBooked() == true) {
				Database.thursday.get(roomID - 1).setBooked(false);
				return true;
			} else {
				return false;
			}
		} else if (day.equals("Friday")) {
			if (Database.friday.get(roomID - 1).getBooked() == true) {
				Database.friday.get(roomID - 1).setBooked(false);
				return true;
			} else {
				return false;
			}
		} else if (day.equals("Saturday")) {
			if (Database.saturday.get(roomID - 1).getBooked() == true) {
				Database.saturday.get(roomID - 1).setBooked(false);
				return true;
			} else {
				return false;
			}
		} else if (day.equals("Sunday")) {
			if (Database.sunday.get(roomID - 1).getBooked() == true) {
				Database.sunday.get(roomID - 1).setBooked(false);
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	private JTextField custName;
	private JTextField custID;
	private JTextField custPhone;
	private JTextField roomID;
	private JTextField duration;
	private JTable table;
	private JTable tTable;
	private JTable wTable;
	private JTable TTable;
	private JTable fTable;
	private JTable sTable;
	private JTable suTable;
	private JTextField day;
}
