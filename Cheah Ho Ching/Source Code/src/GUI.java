import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;


public class GUI implements ActionListener{

	private JFrame frmCarRentalSystem;
	private JTextField textField;
	private JLabel textframe;
	String input = "-1";

	private JLabel Header;
	private JLabel one;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frmCarRentalSystem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public GUI() {
		initialize();
	}

	private void initialize() {
		frmCarRentalSystem = new JFrame();
		frmCarRentalSystem.setTitle("Car Rental System");
		frmCarRentalSystem.setBounds(100, 100, 624, 738);
		frmCarRentalSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCarRentalSystem.getContentPane().setLayout(null);
		
		Button Menu_1 = new Button("Menu");
		Menu_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu();
				displayc();
			}
		});
		Menu_1.setBounds(524, 10, 74, 27);
		frmCarRentalSystem.getContentPane().add(Menu_1);
		
		textField = new JTextField();
		textField.setBounds(10, 660, 507, 31);
		frmCarRentalSystem.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("OK");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input = new String(textField.getText());
			}
		});
		button.setBounds(524, 660, 74, 31);
		frmCarRentalSystem.getContentPane().add(button);
		textframe = new JLabel("");
		textframe.setBounds(0, 46, 598, 604);
		frmCarRentalSystem.getContentPane().add(textframe);
		
		Header = new JLabel("");
		Header.setBounds(0, 10, 518, 27);
		frmCarRentalSystem.getContentPane().add(Header);
		
		frmCarRentalSystem.getRootPane().setDefaultButton(button);
		
		one = new JLabel("");
		one.setBounds(562, 223, 46, 14);
		frmCarRentalSystem.getContentPane().add(one);
		
		frmCarRentalSystem.setVisible(true);
	}
	
	public String getInput()
	{
		return input;
	}
	
	public void resetInput()
	{
		input = "-1";
	}
	
	public void menu()
	{
		display("<html>1. Find car<br/>2. Add car<br/>3. Delete car<br/>4. Rent/Return car<br/>5. Show car list<br/>"
				+ "6. Update text file<br/><br/>Please enter your option :<br/><br/>(Update text file before closing the programe!)");
	}

	public void display(String string) {
		textframe.setText(string);
	}
	
	public void displayh(String string) {
		Header.setText(string);
	}
	
	public void displaym() {
		Header.setText("return to menu >>>");
	}
	
	public void displayc() {
		Header.setText(" ");
	}
	
	public void displayd(String string) {
		one.setText(string);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		input = new String(textField.getText());
		
	}
}
