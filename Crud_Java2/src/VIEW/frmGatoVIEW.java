package VIEW;

import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import DAO.GatoDAO;
import DTO.GatoDTO;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JScrollBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.ListSelectionModel;
import javax.swing.JMenuBar;
import java.awt.Insets;
import javax.swing.JMenuItem;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTabbedPane;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public class frmGatoVIEW extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtRaca;
	private JTextField txtCor;
	private JTextField txtDono;
	private JTextField txtDdd;
	private JTextField txtGenero;
	private JTextField txtTelefone;
	private JTable tabelaGato;
	private JTextField txtPelagem;
	private JTextField txtId_gato;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmGatoVIEW frame = new frmGatoVIEW();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	
		 
	}
	
	
	public frmGatoVIEW() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 602, 612);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(new Color(240, 240, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CADASTRO DO GATO");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblNewLabel.setBounds(96, 11, 397, 40);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setToolTipText("");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(22, 118, 64, 27);
		contentPane.add(lblNewLabel_1);
		
		txtNome = new JTextField();
		txtNome.setBounds(96, 119, 323, 27);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Raca");
		lblNewLabel_1_1.setToolTipText("");
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(22, 158, 64, 23);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Pelagem");
		lblNewLabel_1_2.setToolTipText("");
		lblNewLabel_1_2.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(22, 194, 64, 27);
		contentPane.add(lblNewLabel_1_2);
		
		JButton btnCadastrar = new JButton("Incluir Cadasto");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cadastrarGato();
				//listarValoresGato();
				limparCampos();
				
			}
		});
		
		btnCadastrar.setBounds(436, 78, 133, 23);
		contentPane.add(btnCadastrar);
		
		JButton btnListar_Cadastro = new JButton("Buscar Cadastro");
		btnListar_Cadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				listarValoresGato();
			}
		});
		btnListar_Cadastro.setBounds(436, 180, 133, 23);
		contentPane.add(btnListar_Cadastro);
		
		JButton btnAlterar = new JButton("Alterar Cadastro");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				alterarGato();
				listarValoresGato();
				limparCampos();
			}
		});
		btnAlterar.setBounds(436, 112, 133, 23);
		contentPane.add(btnAlterar);
		
		txtRaca = new JTextField();
		txtRaca.setColumns(10);
		txtRaca.setBounds(96, 157, 323, 27);
		contentPane.add(txtRaca);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Cor");
		lblNewLabel_1_2_1.setToolTipText("");
		lblNewLabel_1_2_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_1_2_1.setBounds(22, 232, 64, 27);
		contentPane.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_1_3 = new JLabel("Dono");
		lblNewLabel_1_2_1_3.setToolTipText("");
		lblNewLabel_1_2_1_3.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_1_2_1_3.setBounds(22, 270, 64, 27);
		contentPane.add(lblNewLabel_1_2_1_3);
		
		txtCor = new JTextField();
		txtCor.setColumns(10);
		txtCor.setBounds(96, 233, 182, 27);
		contentPane.add(txtCor);
		
		txtDono = new JTextField();
		txtDono.setColumns(10);
		txtDono.setBounds(96, 271, 323, 27);
		contentPane.add(txtDono);
		
		txtDdd = new JTextField();
		txtDdd.setColumns(10);
		txtDdd.setBounds(96, 309, 48, 27);
		contentPane.add(txtDdd);
		
		JLabel lblNewLabel_1_2_1_3_1 = new JLabel("DDD");
		lblNewLabel_1_2_1_3_1.setToolTipText("");
		lblNewLabel_1_2_1_3_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_1_2_1_3_1.setBounds(22, 308, 64, 27);
		contentPane.add(lblNewLabel_1_2_1_3_1);
		
		JButton btnExcluir = new JButton("Excluir Cadastro");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				excluirGato();
				listarValoresGato();
				limparCampos();
				
			}
		});
		btnExcluir.setBounds(436, 146, 133, 23);
		contentPane.add(btnExcluir);
		
		txtGenero = new JTextField();
		txtGenero.setColumns(10);
		txtGenero.setBounds(371, 233, 48, 27);
		contentPane.add(txtGenero);
		
		JLabel lblNewLabel_1_2_1_2_1 = new JLabel("G\u00EAnero");
		lblNewLabel_1_2_1_2_1.setToolTipText("");
		lblNewLabel_1_2_1_2_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_1_2_1_2_1.setBounds(315, 232, 51, 27);
		contentPane.add(lblNewLabel_1_2_1_2_1);
		
		JLabel lblNewLabel_1_2_1_3_1_1 = new JLabel("Telefone");
		lblNewLabel_1_2_1_3_1_1.setToolTipText("");
		lblNewLabel_1_2_1_3_1_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_1_2_1_3_1_1.setBounds(148, 308, 64, 27);
		contentPane.add(lblNewLabel_1_2_1_3_1_1);
		
		txtTelefone = new JTextField();
		txtTelefone.setColumns(10);
		txtTelefone.setBounds(222, 309, 197, 27);
		contentPane.add(txtTelefone);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 347, 559, 206);
		contentPane.add(panel);
		
		tabelaGato = new JTable();
		tabelaGato.setFont(new Font("Tahoma", Font.PLAIN, 11));
		tabelaGato.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		tabelaGato.setBackground(new Color(255, 255, 255));
		tabelaGato.setForeground(new Color(0, 0, 0));
		tabelaGato.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"ID", "Nome", "Raca", "Pelagem", "Cor", "Dono", "Genero", "DDD", "Telefone"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		tabelaGato.getColumnModel().getColumn(0).setPreferredWidth(40);
		tabelaGato.getColumnModel().getColumn(1).setPreferredWidth(117);
		tabelaGato.getColumnModel().getColumn(2).setPreferredWidth(60);
		tabelaGato.getColumnModel().getColumn(3).setPreferredWidth(58);
		tabelaGato.getColumnModel().getColumn(4).setPreferredWidth(60);
		tabelaGato.getColumnModel().getColumn(5).setPreferredWidth(53);
		tabelaGato.getColumnModel().getColumn(6).setPreferredWidth(35);
		tabelaGato.getColumnModel().getColumn(7).setPreferredWidth(40);
		tabelaGato.getColumnModel().getColumn(8).setPreferredWidth(83);
		panel.add(tabelaGato);
		
		txtPelagem = new JTextField();
		txtPelagem.setBounds(96, 195, 270, 27);
		contentPane.add(txtPelagem);
		txtPelagem.setColumns(10);
		
		JButton btnCarregarCampos = new JButton("Carregar Campos");
		btnCarregarCampos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				carregarCampos();
				
			}
			
		});
		btnCarregarCampos.setBounds(436, 214, 133, 23);
		contentPane.add(btnCarregarCampos);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("ID");
		lblNewLabel_1_2_1_1.setToolTipText("");
		lblNewLabel_1_2_1_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_1_2_1_1.setBounds(22, 75, 64, 27);
		contentPane.add(lblNewLabel_1_2_1_1);
		
		txtId_gato = new JTextField();
		txtId_gato.setEditable(false);
		txtId_gato.setColumns(10);
		txtId_gato.setBounds(96, 76, 182, 27);
		contentPane.add(txtId_gato);
		
		JPanel panel_1 = new JPanel();
		panel_1.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
			}
		});
		panel_1.setBounds(436, 248, 133, 88);
		contentPane.add(panel_1);
		
	listarValoresGato();
	limparCampos();
	
	}
	
	private void cadastrarGato() {
		
		String nome, raca, pelagem, genero, cor, dono;
		int ddd, telefone;
		//float peso;
		
	
		nome = txtNome.getText();
		raca = txtRaca.getText();
		genero = txtGenero.getText();
		dono = txtDono.getText();
		cor = txtCor.getText();
		pelagem = txtPelagem.getText();//Integer.parseInt(cbxPelagem.getText());
		ddd = Integer.parseInt(txtDdd.getText());
		telefone = Integer.parseInt(txtTelefone.getText());

		GatoDTO objgatodto = new GatoDTO();
		objgatodto.setNome(nome);
		objgatodto.setRaca(raca);
		objgatodto.setGenero(genero);
		objgatodto.setDono(dono);
		objgatodto.setCor(cor);
		objgatodto.setPelagem(pelagem);
		objgatodto.setDdd(ddd);
		objgatodto.setTelefone(telefone);

		GatoDAO objgatodao = new GatoDAO();
		objgatodao.cadastarGato(objgatodto);
		
	}
	
	private void limparCampos() {
		
		txtId_gato.setText("");
		txtNome.setText("");
		txtRaca.setText("");
		txtGenero.setText("");
		txtDono.setText("");
		txtCor.setText("");
		txtPelagem.setText("");//Integer.parseInt(cbxPelagem.getText(""));
		txtDdd.setText("");
		txtTelefone.setText("");
		txtNome.requestFocus();
	}
	
	private void alterarGato() {
		String nome, raca, pelagem, genero, cor, dono;
		int id_gato, ddd, telefone;
		//float peso;
		
		
		id_gato = Integer.parseInt(txtId_gato.getText());
		nome = txtNome.getText();
		raca = txtRaca.getText();
		genero = txtGenero.getText();
		dono = txtDono.getText();
		cor = txtCor.getText();
		pelagem = txtPelagem.getText();//Integer.parseInt(cbxPelagem.getseleted());
		ddd = Integer.parseInt(txtDdd.getText());
		telefone = Integer.parseInt(txtTelefone.getText());

		GatoDTO objgatodto = new GatoDTO();
		objgatodto.setId_gato(id_gato);
		objgatodto.setNome(nome);
		objgatodto.setRaca(raca);
		objgatodto.setGenero(genero);
		objgatodto.setDono(dono);
		objgatodto.setCor(cor);
		objgatodto.setPelagem(pelagem);
		objgatodto.setDdd(ddd);
		objgatodto.setTelefone(telefone);
		
		GatoDAO objgatodao = new GatoDAO();
		objgatodao.alterarGato(objgatodto);
		
	}
	
	private void excluirGato() {
		
		int id_gato;
		
		id_gato = Integer.parseInt(txtId_gato.getText());
				
		
		GatoDTO objgatodto = new GatoDTO();
		objgatodto.setId_gato(id_gato);
		
		GatoDAO objgatodao = new GatoDAO();
		objgatodao.excluirGato(objgatodto);
		
		
	}
	
	private void listarValoresGato() {

		try {

			GatoDAO objgatodao = new GatoDAO();

			DefaultTableModel model = (DefaultTableModel) tabelaGato.getModel();
			model.setNumRows(0);

			ArrayList<GatoDTO> lista = objgatodao.PesquisarGato();

			for (int num = 0; num < lista.size(); num++) {

				model.addRow(new Object[] { lista.get(num).getId_gato(),lista.get(num).getNome(), lista.get(num).getRaca(), lista.get(num).getPelagem(), 
						 lista.get(num).getCor(), lista.get(num).getGenero(), lista.get(num).getDono(),
						 lista.get(num).getDdd(), lista.get(num).getTelefone()

				});
			}

		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "Listar Valores VIEW " + erro);
		}
	}

	private void carregarCampos() {

		int setar = tabelaGato.getSelectedRow();//"id_gato", "Nome", "Raca", "Pelagem", "Cor", "Genero", "Dono", "DDD", "Telefone"

		txtId_gato.setText(tabelaGato.getModel().getValueAt(setar, 0).toString());
		txtNome.setText(tabelaGato.getModel().getValueAt(setar, 1).toString());
		txtRaca.setText(tabelaGato.getModel().getValueAt(setar, 2).toString());
		txtPelagem.setText(tabelaGato.getModel().getValueAt(setar, 3).toString());
		txtCor.setText(tabelaGato.getModel().getValueAt(setar, 4).toString());
		txtGenero.setText(tabelaGato.getModel().getValueAt(setar, 5).toString());
		txtDono.setText(tabelaGato.getModel().getValueAt(setar, 6).toString());
		txtDdd.setText(tabelaGato.getModel().getValueAt(setar, 7).toString());
		txtTelefone.setText(tabelaGato.getModel().getValueAt(setar, 8).toString());

	}
}
