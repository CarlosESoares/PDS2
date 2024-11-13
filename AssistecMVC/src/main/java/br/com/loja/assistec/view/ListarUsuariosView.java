package br.com.loja.assistec.view;

import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableRowSorter;

import br.com.loja.assistec.model.Usuario;
import br.com.loja.assistec.model.UsuarioTableModel;
import java.awt.event.ActionEvent;

public class ListarUsuariosView extends JFrame {

	private static final long serialVersionUID = 1L;
	public JTextField txtLocalizar;
	private JTable tabela;
	private ArrayList<Usuario> usuariosList;
	private ListarUsuariosView listarUsusariosView;
	private UsuarioTableModel usuarioTableModel;
	private TableRowSorter<UsuarioTableModel> rowSorter;
	private JScrollPane scroolPanel;
	private JButton btnCadastrar;
	private JButton btnFechar;
	


	public ListarUsuariosView() {
	inicializarComponentes();
	configurarJanela();
	}
	public void inicializarComponentes(){
		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCadastrar.setActionCommand("BotaoCadastrar");
		btnCadastrar.setBounds(49,12,80,20);
		
		btnFechar=new JButton("Fechar");
		btnFechar.setActionCommand("BotaoFechar");
		btnFechar.setBounds(261,279,119,20);
		
		txtLocalizar=new JTextField();
		txtLocalizar.setBounds(139, 12, 252, 20);
	
		tabela = new JTable();
		scroolPanel = new JScrollPane(tabela);
		scroolPanel.setBounds(10,53,539,215);
		
		getContentPane().setLayout(null);
		getContentPane().add(btnCadastrar);
		getContentPane().add(btnFechar);
		getContentPane().add(txtLocalizar);
		getContentPane().add(scroolPanel);
	
	}
	public void configurarJanela() {
		setTitle("Listagem de usuários");
		setBounds(500, 500, 581, 352);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void addListarUsuarioListener(ActionListener listener) {
		btnCadastrar.addActionListener(listener);
		btnFechar.addActionListener(listener);
		
	}
		
}
	
