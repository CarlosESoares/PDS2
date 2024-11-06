import controller.LoginController;
import model.Usuarios;
import view.LoginView;

public class App {

	public static void main(String[] args) {
		LoginView view = new LoginView();
		Usuarios user = new Usuarios();
		@SuppressWarnings("unused")
		LoginController lc = new LoginController(user, view);
	}

}
