import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;

public class Pokemon {

	private JFrame frame;
	private String pokemonName;
	private String pokemonImage;

	/**
	 * Launch the application.
	

	/**
	 * Create the application.
	 */
	public Pokemon(String pokemonName) {
		
		//Inicializa variables de instancias
		
		switch(pokemonName) {
		case "Picachu":
		 this.pokemonName = "Picachu";
		 pokemonImage = "Resources\\pikachu.png";
		 break;
		case "Charmander":
			this.pokemonName = "Charmander";
			pokemonImage = "Resources\\charmander.png";
			break;
		}
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.setBounds(100, 100, 447, 396);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPokemonName = new JLabel("Pokemon Label"); 
		lblPokemonName.setHorizontalAlignment(SwingConstants.CENTER);
		lblPokemonName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPokemonName.setBounds(85, 290, 149, 38);
		lblPokemonName.setText(this.pokemonName);
		frame.getContentPane().add(lblPokemonName);
		
		JLabel imgPokemon = new JLabel("Pokemon Image");
		imgPokemon.setIcon(new ImageIcon(this.pokemonImage));
		imgPokemon.setBounds(14, 11, 308, 285);
		frame.getContentPane().add(imgPokemon);
		
		JButton btnBack = new JButton("Volver");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		btnBack.setBounds(332, 11, 89, 27);
		frame.getContentPane().add(btnBack);
	}
	public void setVisibility(boolean visible) {
		frame.setVisible(visible);
	}
	
	public void dispose() {
		this.frame.dispose();
		
	
	}

}
