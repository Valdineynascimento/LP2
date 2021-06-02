package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import DTO.GatoDTO;

public class GatoDAO {
	
	Connection conn;
	PreparedStatement pstm;
	ResultSet rs;
	ArrayList<GatoDTO> lista = new ArrayList<>();
	
	public void cadastarGato(GatoDTO objgatodto) {
		String sql = "insert into gato (nome, raca, pelagem, cor, dono, genero, ddd, telefone) values (?, ?, ?, ?, ?, ?, ?, ?)";

		conn = new ConexaoDAO().conexaoBD();

		try {

			pstm = conn.prepareStatement(sql);
			pstm.setString(1, objgatodto.getNome());
			pstm.setString(2, objgatodto.getRaca());
			pstm.setString(3, objgatodto.getPelagem());
			pstm.setString(4, objgatodto.getCor());
			pstm.setString(5, objgatodto.getDono());
			pstm.setString(6, objgatodto.getGenero());
			pstm.setInt(7, objgatodto.getDdd());
			pstm.setInt(8, objgatodto.getTelefone());
			
			
			pstm.execute();
			pstm.close();

		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null, "GatoDAO Cadastrar" + erro);
		}

	}
	
	public ArrayList<GatoDTO> PesquisarGato() {
		
		String sql = "select * from gato";
		conn = new ConexaoDAO().conexaoBD();
		
		try {
			
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery(sql);
			
			while(rs.next()) {
				
				GatoDTO objgatodto = new GatoDTO();
				objgatodto.setId_gato(rs.getInt("id_gato"));
				objgatodto.setNome(rs.getString("nome"));
				objgatodto.setRaca(rs.getString("raca"));
				objgatodto.setPelagem(rs.getString("pelagem"));
				objgatodto.setCor(rs.getString("cor"));
				objgatodto.setDono(rs.getString("dono"));
				objgatodto.setGenero(rs.getString("genero"));
				objgatodto.setDdd(rs.getInt("ddd"));
				objgatodto.setTelefone(rs.getInt("telefone"));
				
				lista.add(objgatodto);
			}
			
			
		} catch (SQLException erro) {
			
			JOptionPane.showMessageDialog(null, "GatoDAO Pesquisar: " + erro);
			
		}
		
		return lista;
	}
	
	public void alterarGato(GatoDTO objgatodto) {//nome, raca, pelagem, cor, dono, genero, ddd, telefone
		String sql = "update gato set nome = ?, raca = ?, pelagem = ?, cor = ?, dono = ?, genero = ?, ddd = ?, telefone = ? where id_gato = ?";

		conn = new ConexaoDAO().conexaoBD();

		try {

			pstm = conn.prepareStatement(sql);
			pstm.setString(1, objgatodto.getNome());
			pstm.setString(2, objgatodto.getRaca());
			pstm.setString(3, objgatodto.getPelagem());
			pstm.setString(4, objgatodto.getCor());
			pstm.setString(5, objgatodto.getDono());
			pstm.setString(6, objgatodto.getGenero());
			pstm.setInt(7, objgatodto.getDdd());
			pstm.setInt(8, objgatodto.getTelefone());
			pstm.setInt(9, objgatodto.getId_gato());
			
			
			pstm.execute();
			pstm.close();

		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null, "GatoDAO Alterar" + erro);
		}
	}
	
	
	public void excluirGato(GatoDTO objgatodto) {
		String sql = "delete from gato where id_gato = ?";

		conn = new ConexaoDAO().conexaoBD();

		try {

			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, objgatodto.getId_gato());
						
			pstm.execute();
			pstm.close();

		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null, "GatoDAO Excluir" + erro);
		}
	}
	
	
	/*public ResultSet listarPelagem() {
		
		String sql = "SELECT * FROM pelagem ORDER BY altura_pelagem;";
		conn = new ConexaoDAO().conexaoBD();
		
		try {
			
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery(sql);
			
			/*while(rs.next()) {
				
				GatoDTO objgatodto = new GatoDTO();
				objgatodto.setNome(rs.getString("nome"));
				objgatodto.setRaca(rs.getString("raca"));
				objgatodto.setPelagem(rs.getInt("pelagem"));
				objgatodto.setCor(rs.getString("cor"));
				objgatodto.setDono(rs.getString("dono"));
				objgatodto.setGenero(rs.getString("genero"));
				objgatodto.setDdd(rs.getInt("ddd"));
				objgatodto.setTel(rs.getInt("telefone"));
				
				lista.add(objgatodto);
			}
			
			
		} catch (SQLException erro) {
			
			JOptionPane.showMessageDialog(null, "GatoDAO listarPelagem: " + erro);
			
		}
		
		return null;
	}*/


}
