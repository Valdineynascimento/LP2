package VIEW;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAO.UsuarioDAO;
import DTO.UsuarioDTO;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class frmLoginVIEW extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtSenha;
	private JButton btnEntrarSistema;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmLoginVIEW frame = new frmLoginVIEW();
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
	public frmLoginVIEW() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome de Usuario");
		lblNome.setBounds(38, 22, 86, 14);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(38, 36, 151, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtSenha = new JTextField();
		txtSenha.setBounds(38, 117, 151, 20);
		contentPane.add(txtSenha);
		txtSenha.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha de Usuario");
		lblSenha.setBounds(38, 104, 86, 14);
		contentPane.add(lblSenha);
		
		btnEntrarSistema = new JButton("Entrar");
		btnEntrarSistema.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Logar();
			}
		});
		btnEntrarSistema.setBounds(38, 161, 89, 23);
		contentPane.add(btnEntrarSistema);
	}
	
	private void Logar() {
		
		try {
			
			String nome_usuario, senha_usuario;
		
			nome_usuario = txtNome.getText();
			senha_usuario = txtSenha.getText();
					
			UsuarioDTO objusuariodto = new UsuarioDTO();
			objusuariodto.setNome_usuario(nome_usuario);
			objusuariodto.setSenha_usuario(senha_usuario);
			
			UsuarioDAO objusuariodao = new UsuarioDAO();
			ResultSet rsusuariodao = objusuariodao.autenticacaoUsuario(objusuariodto);
			
			if (rsusuariodao.next()) {
				//chamar tela que eu quero abrir
				frmPrincipalVIEW objfrmprincipalview = new frmPrincipalVIEW();
				objfrmprincipalview.setVisible(true);
				
				dispose();
				
			} else {
				//enviar mensagem dizendo incorreto
				JOptionPane.showMessageDialog(null, "Usuário ou Senha Inválida!");

			}
					
		} catch (SQLException errocon) {
			JOptionPane.showMessageDialog(null, "FRMLOGINVIEW: " + errocon);
		}
		
	}
}
