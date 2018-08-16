package guis;

import javax.swing.JFrame;
/* FaceBook group: Programming
 * GitHub : Java how to
 * this starts the GUI. You can make you own Frame but it has to have 
 * some properties 
 */
public class MainForGUIs {
	
	
	public static void main(String[] args) {
		JFrame frame= new JFrame();
		frame.setBounds(0,0,325,250);	// must have this for gui to work
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);	
		frame.add(new LoginGUI());
		frame.setVisible(true);
		frame.setResizable(false);	// doesnt allow for resizing the window
		frame.setLocationRelativeTo(null);	// shows in the middle
	}
	
}
