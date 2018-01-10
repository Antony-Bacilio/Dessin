package Interface;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


@SuppressWarnings("serial")
public class Interface_User extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txt_ident;
	private JButton btn_accepter;
	private JButton btn_Annuler;
	private JLabel lbl_username;
	private JLabel lbl_user;
	private JLabel lbl_fond;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface_User frame = new Interface_User();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Interface_User() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 10, 480, 640);
		this.setLocationRelativeTo(null);
		this.setUndecorated(true);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ImageIcon icon_UL = new ImageIcon("src/Imagenes/UL.jpg");
		this.setIconImage(icon_UL.getImage());
		
		btn_Annuler = new JButton("Annuler");
		btn_Annuler.setBounds(310, 560, 97, 25);
		btn_Annuler.setFont(new Font("Tahoma",Font.BOLD,14));
		contentPane.add(btn_Annuler);
		btn_Annuler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		
		txt_ident = new JTextField();
		txt_ident.setFont(new Font("Tahoma",Font.BOLD,18));
		txt_ident.setBounds(65, 447, 380, 25);
		txt_ident.setColumns(10);
		contentPane.add(txt_ident);
		txt_ident.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char entrer = e.getKeyChar();
				if(entrer == KeyEvent.VK_ENTER)btn_accepter.doClick();;
			}
		});
		
		btn_accepter = new JButton("Accepter");
		btn_accepter.setBounds(105, 560, 97, 25);
		btn_accepter.setFont(new Font("Tahoma",Font.BOLD,14));
		contentPane.add(btn_accepter);
		btn_accepter.addActionListener(this);
		
		lbl_username = new JLabel("Identifiant :");
		lbl_username.setFont(new Font("Tahoma", Font.BOLD, 22));
		lbl_username.setForeground(new Color(255, 153, 51));
		lbl_username.setBounds(65, 403, 137, 43);
		contentPane.add(lbl_username);
		
		lbl_user = new JLabel("");
		lbl_user.setIcon(new ImageIcon("src/Imagenes/user.png"));
		lbl_user.setBounds(118, 32, 275, 335);
		contentPane.add(lbl_user);
		
		lbl_fond = new JLabel("");
		lbl_fond.setIcon(new ImageIcon("src/Imagenes/fond4.jpg"));
		lbl_fond.setBounds(0, 0, 502, 672);
		contentPane.add(lbl_fond);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Stub de la méthode généré automatiquement
		Dessin_Test D_Test= new Dessin_Test("Figures Géométriques");
		this.setVisible(false);
		D_Test.setVisible(true);
		D_Test.setLocationRelativeTo(null);
		String Message = "Bienvenue "+txt_ident.getText();
		JOptionPane.showMessageDialog(null,Message, " IUT de Metz", JOptionPane.INFORMATION_MESSAGE);
	}
	
	
}
