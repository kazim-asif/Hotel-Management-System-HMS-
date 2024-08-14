package hms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.border.LineBorder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Booking extends JFrame {

	private JPanel contentPane;

	private int noOfDays;
	private int roomID;
	private Customer cust;
	private JTable table;
	private String day;
	private JTextField nameField;
	private JTextField idField;
	private JTextField phoneField;
	private JTextField roomIdField;
	private JTextField durationField;
	private JTextField DayField;

	String dayPre;
	int roomPre = 0;
	int newRoomID = 0;

	public Booking(int noOfDays, int roomIDInt, Customer cust, String day) throws HeadlessException {
		super();
		this.noOfDays = noOfDays;
		this.roomID = roomIDInt;
		this.cust = cust;
		this.day = day;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}

	public int getRoomID() {
		return roomID;
	}

	public void setRoomID(int roomID) {
		this.roomID = roomID;
	}

	public Customer getCust() {
		return cust;
	}

	public void setCust(Customer cust) {
		this.cust = cust;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Booking frame = new Booking();
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
	public Booking() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 891, 511);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 209, 472);
		panel.setLayout(null);
		panel.setBackground(Color.DARK_GRAY);
		contentPane.add(panel);

		JLabel lblNewLabel = new JLabel("Management");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setBackground(Color.DARK_GRAY);
		lblNewLabel.setBounds(35, 49, 148, 29);
		panel.add(lblNewLabel);

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

		JButton backBtn = new JButton("Back");
		backBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				new HMS_Main().setVisible(true);
				dispose();

			}
		});
		backBtn.setForeground(Color.WHITE);
		backBtn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		backBtn.setBorder(new LineBorder(Color.black));
		backBtn.setBackground(Color.GRAY);
		backBtn.setBounds(46, 409, 113, 39);
		panel.add(backBtn);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

			}
		});
		scrollPane.setBounds(231, 51, 623, 201);
		contentPane.add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "Customer Name", "Customer ID", "Phone Number", "Room ID", "Day", "Duration" }));

		JLabel lblNewLabel_3 = new JLabel("Customer Name");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(297, 284, 93, 14);
		contentPane.add(lblNewLabel_3);

		nameField = new JTextField();
		nameField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		nameField.setColumns(10);
		nameField.setBounds(387, 280, 167, 21);
		contentPane.add(nameField);

		idField = new JTextField();
		idField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		idField.setColumns(10);
		idField.setBounds(387, 305, 167, 21);
		contentPane.add(idField);

		JLabel lblNewLabel_3_1 = new JLabel("Customer ID");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3_1.setBounds(297, 309, 93, 14);
		contentPane.add(lblNewLabel_3_1);

		JLabel lblNewLabel_3_1_1 = new JLabel("Phone Number");
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3_1_1.setBounds(297, 335, 93, 14);
		contentPane.add(lblNewLabel_3_1_1);

		phoneField = new JTextField();
		phoneField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		phoneField.setColumns(10);
		phoneField.setBounds(387, 331, 167, 21);
		contentPane.add(phoneField);

		JLabel lblNewLabel_3_1_1_1 = new JLabel("Room ID");
		lblNewLabel_3_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3_1_1_1.setBounds(297, 366, 66, 14);
		contentPane.add(lblNewLabel_3_1_1_1);

		roomIdField = new JTextField();
		roomIdField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		roomIdField.setColumns(10);
		roomIdField.setBounds(387, 359, 167, 21);
		contentPane.add(roomIdField);

		durationField = new JTextField();
		durationField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		durationField.setColumns(10);
		durationField.setBounds(387, 384, 167, 21);
		contentPane.add(durationField);

		JLabel lblNewLabel_3_1_1_1_1 = new JLabel("Stay duration");
		lblNewLabel_3_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3_1_1_1_1.setBounds(297, 391, 84, 14);
		contentPane.add(lblNewLabel_3_1_1_1_1);

		JLabel lblNewLabel_3_1_1_1_1_1 = new JLabel("Day");
		lblNewLabel_3_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3_1_1_1_1_1.setBounds(297, 413, 84, 14);
		contentPane.add(lblNewLabel_3_1_1_1_1_1);

		DayField = new JTextField();
		DayField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		DayField.setColumns(10);
		DayField.setBounds(387, 406, 167, 21);
		contentPane.add(DayField);

		JButton fillBtn = new JButton("Fill TextFields");
		fillBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int selectedRow = table.getSelectedRow();
				if (selectedRow != -1) {
					String custName = (String) table.getValueAt(selectedRow, 0);
					String custID = (String) table.getValueAt(selectedRow, 1);
					String phone = (String) table.getValueAt(selectedRow, 2);
					int roomID = (int) table.getValueAt(selectedRow, 3);
					String day = (String) table.getValueAt(selectedRow, 4);
					int duration = (int) table.getValueAt(selectedRow, 5);

					dayPre = day;
					roomPre = roomID;

					// Populate text fields with the retrieved data
					nameField.setText(custName);
					idField.setText(custID);
					phoneField.setText(phone);
					roomIdField.setText(String.valueOf(roomID));
					DayField.setText(day);
					durationField.setText(String.valueOf(duration));
				}
			}
		});
		fillBtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		fillBtn.setBackground(Color.GRAY);
		fillBtn.setBounds(592, 295, 159, 38);
		contentPane.add(fillBtn);

		JButton deleteRecordBtn = new JButton("Delete Record");
		deleteRecordBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int selectedRow = table.getSelectedRow();
				if (selectedRow != -1) {
					// Retrieve data from the selected row
					String custName = (String) table.getValueAt(selectedRow, 0);
					String custID = (String) table.getValueAt(selectedRow, 1);
					String phone = (String) table.getValueAt(selectedRow, 2);
					int roomID = Integer.parseInt(table.getValueAt(selectedRow, 3).toString());
					String dayOfTheWeek = (String) table.getValueAt(selectedRow, 4);

					if (dayOfTheWeek.equals("Monday")) {
						Database.monday.get(roomID - 1).setBooked(true);
					}
					if (dayOfTheWeek.equals("Tuesday")) {
						Database.tuesday.get(roomID - 1).setBooked(true);
					}
					if (dayOfTheWeek.equals("Wednesday")) {
						Database.wednesday.get(roomID - 1).setBooked(true);
					}
					if (dayOfTheWeek.equals("Thursday")) {
						Database.thursday.get(roomID - 1).setBooked(true);
					}
					if (dayOfTheWeek.equals("Friday")) {
						Database.friday.get(roomID - 1).setBooked(true);
					}
					if (dayOfTheWeek.equals("Saturday")) {
						Database.saturday.get(roomID - 1).setBooked(true);
					}
					if (dayOfTheWeek.equals("Sunday")) {
						Database.sunday.get(roomID - 1).setBooked(true);
					}

					DefaultTableModel model = (DefaultTableModel) table.getModel();
					model.removeRow(selectedRow);

					for (int i = 0; i < Database.b.size(); i++) {
						if (Database.b.get(i).getCust().getName().equals(custName)
								&& Database.b.get(i).getCust().getId().equals(custID)
								&& Database.b.get(i).getCust().getContactNumber().equals(phone)
								&& String.valueOf(Database.b.get(i).getRoomID()).equals(String.valueOf(roomID))) {
							Database.b.remove(i);
							break; // Exit the loop after removing the record
						}
					}
				}
			}
		});
		deleteRecordBtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		deleteRecordBtn.setBackground(Color.GRAY);
		deleteRecordBtn.setBounds(592, 400, 159, 38);
		contentPane.add(deleteRecordBtn);

		JButton UpdateRecordBtn = new JButton("Update Record");
		UpdateRecordBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				boolean dur = false, days = false, room = false;
				int durationInt = 0;

				try {

					for (int i = 0; i < Database.b.size(); i++) {

						if (!(nameField.getText().isEmpty() || idField.getText().isEmpty()
								|| phoneField.getText().isEmpty() || roomIdField.getText().isEmpty()
								|| durationField.getText().isEmpty() || DayField.getText().isEmpty())) {

							if (Database.b.get(i).getCust().getName().equals(nameField.getText())
									&& Database.b.get(i).getCust().getId().equals(idField.getText())) {

								try {
									newRoomID = Integer.parseInt(roomIdField.getText());
									if (newRoomID > 0 && newRoomID <= 20) {
										room = true; // Valid room ID, you can proceed with your logic
									} else {
										// Invalid room ID, show an error message
										JOptionPane.showMessageDialog(null, "Room ID must be between 1 and 20", "Error",
												JOptionPane.ERROR_MESSAGE);
									}
								} catch (NumberFormatException ex) {
									// Parsing failed, show an error message
									JOptionPane.showMessageDialog(null,
											"Invalid Room ID. Please enter a valid integer.", "Error",
											JOptionPane.ERROR_MESSAGE);
								}

								String inputDay = DayField.getText();
								String[] validDays = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
										"Saturday", "Sunday" };

								boolean isValidDay = false;
								for (String day : validDays) {
									if (day.equalsIgnoreCase(inputDay)) {
										isValidDay = true;
										break;
									}
								}

								if (isValidDay) {
									days = true;
								} else {
									JOptionPane.showMessageDialog(contentPane,
											"Please enter a valid day (Monday to Sunday).", "Error",
											JOptionPane.ERROR_MESSAGE);
								}

								try {
									durationInt = Integer.parseInt(durationField.getText());
									dur = true;
								} catch (NumberFormatException ex) {
									// Handle the case where the input is not a valid integer
									JOptionPane.showMessageDialog(contentPane,
											"Please enter a valid integer for the duration.", "Error",
											JOptionPane.ERROR_MESSAGE);
								}

								if (dur && days && room) {

									boolean isAvailable = HMS_Main.checkListDays(newRoomID, inputDay);
									if (isAvailable) {
										
										if ((newRoomID != roomPre) || !(dayPre.equals(inputDay))) {
											if (dayPre.equals("Monday")) {
												Database.monday.get(roomPre - 1).setBooked(true);
											}
											if (dayPre.equals("Tuesday")) {
												Database.tuesday.get(roomPre - 1).setBooked(true);
											}
											if (dayPre.equals("Wednesday")) {
												Database.wednesday.get(roomPre - 1).setBooked(true);
											}
											if (dayPre.equals("Thursday")) {
												Database.thursday.get(roomPre - 1).setBooked(true);
											}
											if (dayPre.equals("Friday")) {
												Database.friday.get(roomPre - 1).setBooked(true);
											}
											if (dayPre.equals("Saturday")) {
												Database.saturday.get(roomPre - 1).setBooked(true);
											}
											if (dayPre.equals("Sunday")) {
												Database.sunday.get(roomPre - 1).setBooked(true);
											}
										}

										Database.b.get(i).setDay(inputDay);
										Database.b.get(i).getCust().setName(nameField.getText());
										Database.b.get(i).getCust().setContactNumber(phoneField.getText());
										Database.b.get(i).getCust().setId(idField.getText());
										Database.b.get(i).setNoOfDays(durationInt);

										new HMS_Main().setVisible(true);
										dispose();
										break;
									} else {
										// Room is already booked for the selected day
										JOptionPane.showMessageDialog(null,
												"Room is already booked for the selected day.");
									}
								}

							}
						} else {
							JOptionPane.showMessageDialog(contentPane, "Please fill out all fields.", "Error",
									JOptionPane.ERROR_MESSAGE);
						}
					}

				} catch (Exception eee) {
					System.out.println(eee);
				}
			}
		});
		UpdateRecordBtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		UpdateRecordBtn.setBackground(Color.GRAY);
		UpdateRecordBtn.setBounds(592, 344, 159, 38);
		contentPane.add(UpdateRecordBtn);

		Object[][] data = new Object[Database.b.size()][5];
		for (int i = 0; i < Database.b.size(); i++) {
			String custName = Database.b.get(i).getCust().getName();
			String custID = Database.b.get(i).getCust().getId();
			String phone = Database.b.get(i).getCust().getContactNumber();
			int roomID = Database.b.get(i).getRoomID();
			String day = Database.b.get(i).getDay();
			int duration = Database.b.get(i).getNoOfDays();

			data[i] = new Object[] { custName, custID, phone, roomID, day, duration };
		}

		DefaultTableModel model = (DefaultTableModel) table.getModel();
		for (Object[] rowData : data) {
			model.addRow(rowData);
		}

	}

}
