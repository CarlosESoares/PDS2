package br.com.loja.assistec.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class MensagemView extends JDialog{
	private static final long serialVersionUID = 1L;
	private int resposta;

	public MensagemView(String mensagem,int tipo) {
		setTitle("Mesnagem");
		setModal(true);
		//Criar panel
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		getContentPane().add(panel);
		
		
		//Rótulo mensagem
		JLabel lblMensagem = new JLabel(mensagem,SwingConstants.CENTER);
		panel.add(lblMensagem,BorderLayout.CENTER);
		
		//Caminha icon
		String iconPath;
		switch(tipo) {
		case 0:// Error
			iconPath="/br/com/loja/assistec/icones/erro.png";
			lblMensagem.setIcon(new ImageIcon(getClass().getResource(iconPath)));
			break;
		case 1: // Info 
			iconPath="/br/com/loja/assistec/icones/info.png";
			lblMensagem.setIcon(new ImageIcon(getClass().getResource(iconPath)));
			break;
		case 2: // Ateção
			iconPath="/br/com/loja/assistec/icones/alerta.png";
			lblMensagem.setIcon(new ImageIcon(getClass().getResource(iconPath)));
			break;
		case 3: // Sucesso
			iconPath="/br/com/loja/assistec/icones/sucesso.png";
			lblMensagem.setIcon(new ImageIcon(getClass().getResource(iconPath)));
			break;
		case 10:// Assisec
			iconPath="/br/com/loja/assistec/icones/assistec.png";
			lblMensagem.setIcon(new ImageIcon(getClass().getResource(iconPath)));
			break;
		}
		
		JPanel painelSul = new JPanel(new FlowLayout(FlowLayout.CENTER,20,10));
		painelSul.add(new JPanel());
		JButton btnok = new JButton("ok");
		btnok.setPreferredSize(new Dimension(100,30));
		btnok.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setVisible(false);
			}
		});
		painelSul.add(btnok);
		painelSul.add(new JPanel());
		painelSul.setBorder(new EmptyBorder(10,10,10,10));
		setResizable(false);
		panel.add(painelSul,BorderLayout.SOUTH);
		getRootPane().setDefaultButton(btnok);
		setSize(350,200);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
/**
 * @wbp.parser.constructor
 */
	public MensagemView(String pergunta) {
		setTitle("Mensagem");
		setModal(true);
		
		//Criar Panel
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		add(panel);
		
		JLabel labelPergunta = new JLabel(pergunta, SwingConstants.CENTER);
		String iconPath;
		iconPath = "/br/com/loja/assistec/icones/question.png";
		labelPergunta.setIcon(new ImageIcon(getClass().getResource(iconPath)));
		panel.add(labelPergunta, BorderLayout.CENTER);
		
		JPanel painelSul = new JPanel(new FlowLayout(FlowLayout.CENTER,20,10));
		JButton btnSim = new JButton("Sim");
		btnSim.setPreferredSize(new Dimension(100,30));
		btnSim.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				resposta = 1;
				setVisible(false);
				
			}
		});
		painelSul.add(btnSim);
		
		JButton btnNao = new JButton("Não");
		btnNao.setPreferredSize(new Dimension(100,30));
		btnNao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				resposta = 0;
				setVisible(false);
				
			}
		});
		painelSul.add(btnNao);
		
		panel.add(painelSul, BorderLayout.SOUTH);
		
		setSize(400,200);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
public int getResposta() {
	return resposta;
	
}

}