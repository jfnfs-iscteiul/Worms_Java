package pt.iscte.pi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class GameWindow {

	private JFrame frame;


	/**
	 * Create the application.
	 */
	public GameWindow() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1087, 717);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	}
}
