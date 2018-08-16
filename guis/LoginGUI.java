package guis;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/* FaceBook group: Programming
 * GitHub : Java how to
 * Simple login screen can be implemented in other guis by making
 * new object "LoginGUI loginObj = new LoginGUI();" and adding it to a frame
 * this example starts from MainForGUIs class
 */
public class LoginGUI extends JPanel implements ActionListener {

	private JLabel lblTitle; // text label for a title
	private JLabel lblUserName; // text label for user name
	private JLabel lblPassword; // text label for password
	private JTextField txtfUserName; // input field for user name
	private JTextField txtfPassword; // input field for password
	private JButton btnSubmit; // button for submitting
	private JButton btnCancel; // button for canceling

	// constructor setting up everything
	public LoginGUI() {

		// main panel setup
		setBorder(BorderFactory.createLineBorder(Color.BLACK)); // panel border
		setBounds(10, 10, 300, 200); // panel location and size (x,y,width,height)
		setLayout(null); // turning of the default layout

		// adding title to panel
		lblTitle = new JLabel("Login form"); // title label instance
		lblTitle.setFont(new Font("SansSerif", Font.BOLD, 18)); // defining font for title label
		lblTitle.setBounds(100, 20, 100, 22); // title label location and size (x,y,width,height)
		add(lblTitle); // adding title label to main panel

		// adding user name label and input field to panel
		lblUserName = new JLabel("User name: "); // user name label instance
		lblUserName.setBounds(60, 60, 100, 20); // user name label location and size (x,y,width, height)
		add(lblUserName); // adding user name label to main panel
		txtfUserName = new JTextField(15); // user name text field instance with 15 character size
		txtfUserName.setBounds(140, 60, 100, 20); // user name text field location and size (x,y,width,height)
		add(txtfUserName); // adding user name text field to main panel

		// adding password label and input field to panel
		lblPassword = new JLabel("Password: "); // password label instance
		lblPassword.setBounds(60, 90, 100, 20); // password label location and size (x,y,width,height)
		add(lblPassword);// adding password label to main panel
		txtfPassword = new JTextField(15); // password text field instance with 15 character size
		txtfPassword.setBounds(140, 90, 100, 20); // password text field location and size (x,y,width,height)
		add(txtfPassword); // adding password text field to main panel

		// adding submit and cancel buttons to panel
		btnSubmit = new JButton("Submit"); // submit button instance
		btnSubmit.setBounds(60, 130, 80, 20); // submit button location and size(x,y,width,height)
		btnSubmit.addActionListener(this); // adding action listener to submit button
		add(btnSubmit); // adding submit button to main panel
		btnCancel = new JButton("Cancel"); // Cancel button instance
		btnCancel.setBounds(160, 130, 80, 20); // cancel button location (x,y,width,height)
		btnCancel.addActionListener(this); // adding action listener to cancel button
		add(btnCancel); // adding cancel button to main panel

	}

	/*
	 * This is where stuff happens when buttons are clicked or text is written in
	 * text fields etc. Action listener must be added to all of the components that
	 * will use this.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {

		// if submit button pressed print user name and password in the console
		// can be changed to whatever necessary
		if (e.getSource() == btnSubmit) {
			System.out.println(
					"Submit button clicked. User: " + txtfUserName.getText() + ", Pass: " + txtfPassword.getText());
		}

		// if cancel button pressed clear user name and password from text fields
		// can be changed to whatever necessary
		if (e.getSource() == btnCancel) {
			txtfUserName.setText(null);
			txtfPassword.setText(null);
			System.out.println("Cancel button clicked");

		}
	}

}
