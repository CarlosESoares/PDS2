package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Usuarios;
import view.LoginView;

public class LoginController {
	private Usuarios user;
	private LoginView view;

	public LoginController(Usuarios model, LoginView view) {
		this.user = model;
		this.view = view;
		view.setBounds(0, 0, 450, 350);
		view.setLocationRelativeTo(null);
		view.setVisible(true);
		// Adiciona listener para a view
		view.addLoginListener(new LoginListener());
	}

	// Classe interna para capturar o evento de clique
	class LoginListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// Obtém o comando de ação do botão clicado
			String command = e.getActionCommand();

			//Se o comando for a ação do botão Login
			if (command.equals("BotaoLoginAction")) {
				// Captura os dados da view e processa o login
				String login = view.getLogin();
				String senha = view.getSenha();

				// Atualiza e busca informações no modelo de dados
				salvar(login, senha);

				// Atualiza a view
				atualizarView();
			} else if (command.equals("BotaoFecharAction")) {
				// Implementa o comportamento fechar, se necessário
				System.exit(0);

			}
		}
	}

	//Método para salvar dados na Base
	public void salvar(String login, String senha) {
		user.setLogin(login);
		user.setSenha(senha);
	}

	//Método para atualizar a view
	public void atualizarView() {
		view.mostrar(user.getLogin(), user.getSenha());
	}

}
