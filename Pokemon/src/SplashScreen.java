import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SplashScreen {

	private JFrame frame;
	private Pokemon pokemonWindow;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SplashScreen window = new SplashScreen();
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
	public SplashScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() { 
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblWelcome = new JLabel("Batalla Pokemon");
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcome.setFont(new Font("Dialog", Font.BOLD, 15));
		lblWelcome.setBounds(128, 33, 165, 27);
		frame.getContentPane().add(lblWelcome);
		
		JButton btnPicachu = new JButton("Picachu");
		btnPicachu.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnPicachu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pokemonWindow = new Pokemon("Picachu");
				pokemonWindow.setVisibility(true);
			}
		});
		btnPicachu.setBounds(76, 194, 89, 27);
		frame.getContentPane().add(btnPicachu);
		
		JButton btnCharmander = new JButton("Charmander");
		btnCharmander.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					pokemonWindow = new Pokemon("Charmander");
					pokemonWindow.setVisibility(true);
				}
			
		});
		
		
		btnCharmander.setBounds(229, 197, 128, 27);
		frame.getContentPane().add(btnCharmander);
	}
}
