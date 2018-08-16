package Main;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/* FaceBook group: Programming
 * GitHub : Java how to
 * program for executing other program. Example on how to invoke other programs
 * from Java
 */
public class QuickExecutorSoftMain extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	JButton btn1 = new JButton("notepad");
	JButton btn2 = new JButton("regEdit");
	JButton btn3 = new JButton("wordPad");
	JButton btn4 = new JButton("explorer");

	//Setup for JPanel with constructor
	public QuickExecutorSoftMain() {
		this.setLayout(null);
		this.setBounds(0, 0, 275, 300);
		this.btn1.setBounds(25, 25, 100, 100);
		this.btn1.addActionListener(this);
		this.btn2.setBounds(150, 25, 100, 100);
		this.btn2.addActionListener(this);
		this.btn3.setBounds(25, 150, 100, 100);
		this.btn3.addActionListener(this);
		this.btn4.setBounds(150, 150, 100, 100);
		this.btn4.addActionListener(this);
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		this.add(btn4);
	}

	public static void main(String[] args) {
		QuickExecutorSoftMain m = new QuickExecutorSoftMain();
		m.startProgram();
	}

	private void startProgram() {
		JFrame frame = new JFrame();
		frame.setPreferredSize(new Dimension(275, 300));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.pack();
		frame.add(this);
		frame.setLocationRelativeTo(null);
	}

	//When buttons clicked, other programs autside Java start 
	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == this.btn1) {
			try {
				Process p = Runtime.getRuntime().exec("notepad.exe");
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		if (e.getSource() == this.btn2) {
			try {
				Process r = Runtime.getRuntime().exec("regedit.exe");
			} catch (IOException e1) {
				e1.printStackTrace();
				JOptionPane.showMessageDialog(this, "Start program with root permissions to do this");

			}
		}
		if (e.getSource() == this.btn3) {
			try {
				Process w = Runtime.getRuntime().exec("write.exe");
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		if (e.getSource() == this.btn4) {
			try {
				Process x = Runtime.getRuntime().exec("explorer.exe");
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}
}
