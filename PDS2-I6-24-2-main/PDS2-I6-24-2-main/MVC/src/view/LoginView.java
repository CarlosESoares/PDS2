package view;

import javax.swing.JFrame;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class LoginView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField txtLogin;
	private JTextField txtSenha;
	private JButton btnLogin;
	private JButton btnFechar;

	public LoginView() {
		getContentPane().setLayout(null);

		btnLogin = new JButton("Login");
		// Definindo o comando de ação do botão Login
		btnLogin.setActionCommand("BotaoLoginAction"); 
		btnLogin.setBounds(229, 182, 89, 23);
		getContentPane().add(btnLogin);

		txtLogin = new JTextField();
		txtLogin.setBounds(199, 76, 86, 20);
		getContentPane().add(txtLogin);
		txtLogin.setColumns(10);

		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(143, 79, 46, 14);
		getContentPane().add(lblLogin);

		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(143, 128, 46, 14);
		getContentPane().add(lblSenha);

		txtSenha = new JTextField();
		txtSenha.setBounds(199, 125, 86, 20);
		getContentPane().add(txtSenha);
		txtSenha.setColumns(10);

		btnFechar = new JButton("Fechar");
		// Definindo o comando de ação do botão Fechar
		btnFechar.setActionCommand("BotaoFecharAction");
		btnFechar.setBounds(100, 182, 89, 23);
		getContentPane().add(btnFechar);
	}

	public void mostrar(String login, String senha) {
		String mensagem = "Login: " + login + " senha: " + senha;
		JOptionPane.showMessageDialog(this, mensagem, "Mensagem", JOptionPane.INFORMATION_MESSAGE);
	}

	//Cria o método para adicionar os elementos listener
	public void addLoginListener(ActionListener listener) {
		btnLogin.addActionListener(listener);
		btnFechar.addActionListener(listener);
	}

	public String getLogin() {
		return txtLogin.getText();
	}

	public String getSenha() {
		return txtSenha.getText();
	}
}
