import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SplashScreen {
    private JFrame frame;
    private Pokemon pikachu;
    private Pokemon charmander;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
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

    public SplashScreen() {
        initialize();
        pikachu = new Pokemon("Pikachu", "Rayo", 300);
        charmander = new Pokemon("Charmander", "Fuego", 300);
        agregarBotones();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 593, 415);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void agregarBotones() {
        JButton btnPikachu = new JButton("Pikachu");
        btnPikachu.setBounds(62, 342, 91, 23);
        JButton btnCharmander = new JButton("Charmander");
        btnCharmander.setBounds(353, 342, 113, 23);

        btnPikachu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                iniciarCombate(pikachu);
            }
        });

        btnCharmander.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                iniciarCombate(charmander);
            }
        });
        frame.getContentPane().setLayout(null);
        frame.getContentPane().add(btnPikachu);
        frame.getContentPane().add(btnCharmander);

        JLabel lblPokemon1 = new JLabel("New label");
        lblPokemon1.setIcon(new ImageIcon("Resources\\pikachu.png"));
        lblPokemon1.setBounds(10, 45, 251, 286);

        frame.getContentPane().add(lblPokemon1);

        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon("Resources\\\\charmander.png"));
        lblNewLabel.setBounds(307, 45, 242, 286);
        frame.getContentPane().add(lblNewLabel);
    }

    private void iniciarCombate(Pokemon pokemon) {
        if (pokemon != null) {
            Pokemon otroPokemon = (pokemon.getNombre().equals("Pikachu")) ? charmander : pikachu;

            pokemon.atacar(otroPokemon);

            JOptionPane.showMessageDialog(frame,
                    pokemon.getNombre() + " atacó a " + otroPokemon.getNombre() + ". " +
                            otroPokemon.getNombre() + " tiene " + otroPokemon.getVida() + " de vida.",
                    "Resultado del Ataque", JOptionPane.INFORMATION_MESSAGE);

            // Check for winner
            if (otroPokemon.getVida() <= 0) {
                mostrarGanador(pokemon);
            }
        }
    }

    private void mostrarGanador(Pokemon ganador) {
        JOptionPane.showMessageDialog(frame,
                "¡" + ganador.getNombre() + " es el ganador!",
                "Fin del juego", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
