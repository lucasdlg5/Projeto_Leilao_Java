package Forms;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import edu.fatec.model.ModelCliente;
import edu.fatec.model.ModelLeilao;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;

public class Controller extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Controller frame = new Controller();
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
	public Controller() {
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 344);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" Bem-Vindo ao Sistema de Leil\u00F5es Eletr\u00F4nicos (SLE) ");
		lblNewLabel.setBounds(5, 5, 424, 19);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(lblNewLabel);
		
		JButton btnChecarLeilesAtuais = new JButton("Area de Leil\u00F5es");
		btnChecarLeilesAtuais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				ModelLeilao leilao = new ModelLeilao();
				System.out.println(ModelLeilao.getLisLeiloes());
				if (ModelLeilao.getLisLeiloes().size()<1) {
					Form_Cadastro_Leilao a = new Form_Cadastro_Leilao();
					a.setVisible(true);
					dispose();
				}
				else {
				Form_Leiloes_Atuais janela_leiloes_atuais = new Form_Leiloes_Atuais();
				janela_leiloes_atuais.setVisible(true);
				dispose();
				}
			}
		});
		btnChecarLeilesAtuais.setBounds(128, 119, 164, 71);
		contentPane.add(btnChecarLeilesAtuais);
		
		JButton btnHistricoDeLeiles = new JButton("Hist\u00F3rico de\r\n Leil\u00F5es");
		btnHistricoDeLeiles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Form_Historico_Leiloes janela_historico_leiloes = new Form_Historico_Leiloes();
				janela_historico_leiloes.setVisible(true);
				dispose();
				
			}
		});
		btnHistricoDeLeiles.setBounds(128, 202, 164, 71);
		contentPane.add(btnHistricoDeLeiles);
	}


	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
