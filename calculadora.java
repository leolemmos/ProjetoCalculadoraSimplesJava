package menu03;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora {

	private JFrame frmCalculadoraSimples;
	private JTextField texto01;
	private JTextField texto02;
	private JTextField texto03;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frmCalculadoraSimples.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadoraSimples = new JFrame();
		frmCalculadoraSimples.setTitle("Calculadora Simples");
		frmCalculadoraSimples.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Leonardo\\Pictures\\icones\\calc_calculator_10824.png"));
		frmCalculadoraSimples.setBounds(100, 100, 625, 409);
		frmCalculadoraSimples.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadoraSimples.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Leonardo\\Pictures\\icones\\calculator_46872.png"));
		lblNewLabel.setBounds(251, 11, 103, 96);
		frmCalculadoraSimples.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(0, 118, 609, 48);
		frmCalculadoraSimples.getContentPane().add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("CALCULADORA");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Valor 01");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(41, 177, 74, 14);
		frmCalculadoraSimples.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Valor 02");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_1.setBounds(41, 202, 74, 14);
		frmCalculadoraSimples.getContentPane().add(lblNewLabel_2_1);
		
		texto01 = new JTextField();
		texto01.setFont(new Font("Tahoma", Font.PLAIN, 14));
		texto01.setBounds(138, 176, 227, 20);
		frmCalculadoraSimples.getContentPane().add(texto01);
		texto01.setColumns(10);
		
		texto02 = new JTextField();
		texto02.setFont(new Font("Tahoma", Font.PLAIN, 14));
		texto02.setColumns(10);
		texto02.setBounds(138, 202, 227, 20);
		frmCalculadoraSimples.getContentPane().add(texto02);
		
		JButton btnMultiplicacao = new JButton("Multilplica\u00E7\u00E3o");
		btnMultiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				float resultado = Float.parseFloat(texto01.getText()) * Float.parseFloat(texto02.getText());texto03.setText(String.valueOf(resultado));
			}
		});
		btnMultiplicacao.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnMultiplicacao.setBounds(297, 253, 153, 31);
		frmCalculadoraSimples.getContentPane().add(btnMultiplicacao);
		
		JButton btnSoma = new JButton("Adi\u00E7\u00E3o");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				float resultado = Float.parseFloat(texto01.getText()) + Float.parseFloat(texto02.getText());texto03.setText(String.valueOf(resultado));

			}
		});
		btnSoma.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSoma.setBounds(10, 253, 137, 31);
		frmCalculadoraSimples.getContentPane().add(btnSoma);
		
		JButton btnDivisao = new JButton("Divis\u00E3o");
		btnDivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				float resultado = Float.parseFloat(texto01.getText()) / Float.parseFloat(texto02.getText());texto03.setText(String.valueOf(resultado));
			}
		});
		btnDivisao.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDivisao.setBounds(460, 253, 137, 31);
		frmCalculadoraSimples.getContentPane().add(btnDivisao);
		
		JButton btnSubtracao = new JButton("Subtra\u00E7\u00E3o");
		btnSubtracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				float resultado = Float.parseFloat(texto01.getText()) - Float.parseFloat(texto02.getText());texto03.setText(String.valueOf(resultado));
			}
		});
		btnSubtracao.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSubtracao.setBounds(150, 253, 137, 31);
		frmCalculadoraSimples.getContentPane().add(btnSubtracao);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Resultado");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_1_1.setBounds(41, 316, 74, 14);
		frmCalculadoraSimples.getContentPane().add(lblNewLabel_2_1_1);
		
		texto03 = new JTextField();
		texto03.setFont(new Font("Tahoma", Font.PLAIN, 14));
		texto03.setColumns(10);
		texto03.setBounds(138, 316, 227, 20);
		frmCalculadoraSimples.getContentPane().add(texto03);
	}

}
