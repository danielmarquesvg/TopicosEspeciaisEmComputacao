package exercicio1_PilhaFila;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class TelaInicial extends JFrame {

	Panelinicial panelInicial;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial frame = new TelaInicial();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaInicial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 800, 600);
		panelInicial = new Panelinicial();
		setContentPane(panelInicial);
		panelInicial.setLayout(null);
	}

}
