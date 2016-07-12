package exercicio1_PilhaFila;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Panelinicial extends JPanel {
	public static JTextField textField;
	public static JTextPane textVerificacao;
	public static Control control = new Control();

	/**
	 * Create the panel.
	 */
	public Panelinicial() {
		setBackground(Color.WHITE);
		setSize(800, 600);
		setLayout(null);
		
		JPanel panelSuperior = new JPanel();
		panelSuperior.setBackground(new Color(0, 153, 204));
		panelSuperior.setBounds(0, 0, 800, 59);
		add(panelSuperior);
		panelSuperior.setLayout(null);
		
		JLabel labelNomeDoPrograma = new JLabel("MathExpression");
		labelNomeDoPrograma.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		labelNomeDoPrograma.setForeground(new Color(255, 255, 255));
		labelNomeDoPrograma.setBounds(10, 11, 477, 37);
		panelSuperior.add(labelNomeDoPrograma);
		
		JPanel panelDaExpressao = new JPanel();
		panelDaExpressao.setBackground(new Color(0, 204, 102));
		panelDaExpressao.setBounds(0, 59, 800, 150);
		add(panelDaExpressao);
		panelDaExpressao.setLayout(null);
		
		JLabel labelDescricao = new JLabel("Digite a expressão matemática no campo abaixo:");
		labelDescricao.setForeground(new Color(255, 255, 255));
		labelDescricao.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		labelDescricao.setBounds(10, 11, 574, 36);
		panelDaExpressao.add(labelDescricao);
		
		textField = new JTextField();
		textField.setFont(new Font("Segoe UI Semibold", Font.BOLD, 36));
		textField.setBackground(new Color(204, 255, 204));
		textField.setBounds(10, 52, 500, 87);
		panelDaExpressao.add(textField);
		textField.setColumns(10);
		
		JButton botaoVerificacao = new JButton("Verificar Expressão");
		botaoVerificacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					control.limparCampo();
					control.inserirExpressaoMatematica(textField.getText());
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		botaoVerificacao.setForeground(new Color(255, 255, 255));
		botaoVerificacao.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		botaoVerificacao.setBackground(new Color(0, 153, 204));
		botaoVerificacao.setBounds(532, 52, 222, 87);
		panelDaExpressao.add(botaoVerificacao);
		
		JPanel panelDeValidacao = new JPanel();
		panelDeValidacao.setBackground(new Color(0, 153, 102));
		panelDeValidacao.setBounds(0, 209, 800, 380);
		add(panelDeValidacao);
		panelDeValidacao.setLayout(null);
		
		textVerificacao = new JTextPane();
		textVerificacao.setText("");
		textVerificacao.setBounds(10, 56, 496, 132);
		panelDeValidacao.add(textVerificacao);
		
	}
}
