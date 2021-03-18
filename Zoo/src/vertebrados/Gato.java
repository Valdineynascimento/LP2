package vertebrados;

public class Gato {
		//atributos
		private String pelagem;
		private String raça;
		private char genero;
		private float peso;
		private String cor;
		private int idade;
		private boolean vacina;
		private boolean pedigree;
		//métodos de acesso
		
		public String getPelagem() {
			return pelagem;
		}

		public void setPelagem(String pelagem) {
			this.pelagem = pelagem;
		}

		public float getPeso() {
			return peso;
		}

		public void setPeso(float peso) {
			this.peso = peso;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}

		public boolean isVacina() {
			return vacina;
		}

		public void setVacina(boolean vacina) {
			this.vacina = vacina;
		}

		public boolean isPedigree() {
			return pedigree;
		}

		public void setPedigree(boolean pedigree) {
			this.pedigree = pedigree;
		}

		//método construtor
		public Gato(String raça, String cor1, char gen) {
			this.raça=raça;
			this.cor=cor1;
			this.genero=gen;
			
		}
		//métodos de classes
		public void miar() {
			System.out.println("miau, miau, miau");
		}
		
		public void levantarRabo() {
			System.out.println("levatou, levantou, levantou");
		}
		
		public boolean caçador(boolean caça) {
			if (caça) {
				System.out.println("A presa está na boca");
			}
			else
			{
				System.out.println("Fica esperando a ração");
			}
			
			return caça;
		}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			Gato o1=new Gato("siames","branco",'M');
			o1.setIdade(5);
			Gato o2=new Gato("muchkin","bege",'M');
			o2.miar();
			Gato o3=new Gato("mestiço","caramelo",'F');
			o3.caçador(false);
			Gato o4=new Gato("mestiço","preto",'F');
			o4.caçador(true);
		}
	
}
