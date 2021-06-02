package DTO;

public class GatoDTO {
	
	//atributos
	private String nome;//
	private String raca;//
	private String genero;//
	private String cor;//	
	private String dono;
	private int ddd;//
	private int telefone;//
	private String pelagem;
	private int id_gato;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
		
	public String getPelagem() {
		return pelagem;
	}
	public void setPelagem(String pelagem) {
		this.pelagem = pelagem;
	}
	
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raça) {
		this.raca = raça;
	}

	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	
	public int getDdd() {
		return ddd;
	}
	public void setDdd(int ddd) {
		this.ddd = ddd;
	}
	
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getId_gato() {
		return id_gato;
	}
	public void setId_gato(int id_gato) {
		this.id_gato = id_gato;
	}	
	
	
	

}
