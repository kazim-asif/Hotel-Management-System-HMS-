package hms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Record extends JFrame {

	JLabel nameV, idV, phoneV, roomV, error;
	
	
	private JPanel contentPane;
	private JTextField searchField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Record frame = new Record();
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
	public Record() {
		setTitle("Records");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 891, 511);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 163, 472);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Management");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setBackground(Color.DARK_GRAY);
		lblNewLabel.setBounds(10, 49, 148, 29);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Hotle");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1.setBackground(Color.DARK_GRAY);
		lblNewLabel_1.setBounds(53, 22, 55, 29);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("System");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1_1.setBackground(Color.DARK_GRAY);
		lblNewLabel_1_1.setBounds(42, 77, 86, 29);
		panel.add(lblNewLabel_1_1);
		
		JButton backBtn = new JButton("Back");
		backBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				clear();
				new HMS_Main().setVisible(true);
				dispose();
			}
		});
		backBtn.setForeground(Color.WHITE);
		backBtn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		backBtn.setBorder(new LineBorder(Color.black));
		backBtn.setBackground(Color.GRAY);
		backBtn.setBounds(23, 410, 113, 39);
		panel.add(backBtn);
		
		searchField = new JTextField();
		searchField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		searchField.setBounds(374, 69, 306, 34);
		contentPane.add(searchField);
		searchField.setColumns(10);
		
		
		JLabel lblNewLabel_2 = new JLabel("Search Bills ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_2.setBounds(469, 24, 127, 34);
		contentPane.add(lblNewLabel_2);
		
		JLabel nameL = new JLabel("Name");
		nameL.setFont(new Font("Tahoma", Font.PLAIN, 12));
		nameL.setBounds(447, 197, 46, 14);
		contentPane.add(nameL);
		
		JLabel idL = new JLabel("ID");
		idL.setFont(new Font("Tahoma", Font.PLAIN, 12));
		idL.setBounds(447, 231, 46, 14);
		contentPane.add(idL);
		
		JLabel phoneL = new JLabel("Phone");
		phoneL.setFont(new Font("Tahoma", Font.PLAIN, 12));
		phoneL.setBounds(447, 263, 46, 14);
		contentPane.add(phoneL);
		
		JLabel lblRoomId = new JLabel("Room ID");
		lblRoomId.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblRoomId.setBounds(447, 298, 61, 14);
		contentPane.add(lblRoomId);
		
		nameV = new JLabel("");
		nameV.setFont(new Font("Tahoma", Font.PLAIN, 12));
		nameV.setBounds(515, 197, 208, 14);
		contentPane.add(nameV);
		
		idV = new JLabel("");
		idV.setFont(new Font("Tahoma", Font.PLAIN, 12));
		idV.setBounds(515, 231, 208, 14);
		contentPane.add(idV);
		
		phoneV = new JLabel("");
		phoneV.setFont(new Font("Tahoma", Font.PLAIN, 12));
		phoneV.setBounds(515, 263, 208, 14);
		contentPane.add(phoneV);
		
		roomV = new JLabel("");
		roomV.setFont(new Font("Tahoma", Font.PLAIN, 12));
		roomV.setBounds(515, 298, 208, 14);
		contentPane.add(roomV);
		
		
		JButton searchBtn = new JButton("Search Name");
		searchBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				boolean b = false;
				String search = searchField.getText();
				
				for(int i=0; i<Database.b.size(); i++)
				{
					if(Database.b.get(i).getCust().getName().equals(search))
					{
						b = true;
						nameV.setText(Database.b.get(i).getCust().getName());
						phoneV.setText(Database.b.get(i).getCust().getContactNumber());
						idV.setText(Database.b.get(i).getCust().getId());
						roomV.setText(String.valueOf(Database.b.get(i).getRoomID()));
						error.setText("");
						break;
					}
				}
				
				if(!b)
				{
					nameV.setText("");
					phoneV.setText("");
					idV.setText("");
					roomV.setText("");
					error.setText("No data found");
				}
				
			}
		});
		searchBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		searchBtn.setBounds(469, 114, 111, 23);
		contentPane.add(searchBtn);
		
		error = new JLabel("");
		error.setForeground(Color.RED);
		error.setFont(new Font("Tahoma", Font.PLAIN, 16));
		error.setBounds(472, 160, 173, 26);
		contentPane.add(error);
	}
	
	public void clear() 
	{
		nameV.setText("");
		phoneV.setText("");
		idV.setText("");
		roomV.setText("");
		error.setText("");
	}
	
}
