package ViewControllers;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JInternalFrame;
import java.awt.Panel;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.FlowLayout;
import javax.swing.JScrollPane;

public class adminView {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminView window = new adminView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public adminView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(UIManager.getColor("Button.light"));
		frame.setBounds(100, 100, 990, 551);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 6, 371, 247);
		frame.getContentPane().add(scrollPane);
		
		Panel panel = new Panel();
		scrollPane.setViewportView(panel);
		panel.setForeground(UIManager.getColor("Button.disabledText"));
		panel.setBackground(UIManager.getColor("Button.disabledText"));
		panel.setLayout(null);
	}
}
