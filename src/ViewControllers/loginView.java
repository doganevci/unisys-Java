package ViewControllers;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import Managers.dbCommands;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class loginView {

	private JFrame frmUnisysLogin;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel;
	private JLabel lblPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginView window = new loginView();
					window.frmUnisysLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public loginView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmUnisysLogin = new JFrame();
		frmUnisysLogin.setTitle("UniSys Login");
		frmUnisysLogin.getContentPane().setBackground(Color.DARK_GRAY);
		frmUnisysLogin.setBounds(100, 100, 450, 397);
		frmUnisysLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		lblNewLabel = new JLabel("UserName");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(88, 55, 64, 16);
		
		textField = new JTextField();
		textField.setBounds(176, 46, 169, 34);
		textField.setToolTipText("");
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(176, 98, 169, 34);
		textField_1.setToolTipText("");
		textField_1.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginAction(textField.getText().toString(),textField_1.getText().toString());
				
			}
		});
		btnLogin.setBounds(88, 158, 257, 29);
		
		lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setBounds(88, 107, 64, 16);
		frmUnisysLogin.getContentPane().setLayout(null);
		frmUnisysLogin.getContentPane().add(btnLogin);
		frmUnisysLogin.getContentPane().add(lblNewLabel);
		frmUnisysLogin.getContentPane().add(lblPassword);
		frmUnisysLogin.getContentPane().add(textField_1);
		frmUnisysLogin.getContentPane().add(textField);
	}
	
	
	public void loginAction(String uname,String pass)
	{
		System.out.println("login..."+uname);
		
		boolean aa=new dbCommands().checkIfIcanLogin(uname, pass);
		
		System.out.println("result"+aa);
		
	}
	
}
