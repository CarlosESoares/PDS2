package AssistecMVC.src.main.java.br.com.loja.assistec;

import AssistecMVC.src.main.java.br.com.loja.assistec.controller.LoginController;
import AssistecMVC.src.main.java.br.com.loja.assistec.model.LoginDAO;
import AssistecMVC.src.main.java.br.com.loja.assistec.view.LoginView;


public class App {
    public static void main(String[] args) {
		LoginView view = new LoginView();
		LoginDAO dao = new LoginDAO();
		new LoginController(dao, view);
    }
}
