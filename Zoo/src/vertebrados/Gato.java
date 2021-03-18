package vertebrados;

public class Gato {
		//atributos
		private String pelagem;
		private String ra�a;
		private char genero;
		private float peso;
		private String cor;
		private int idade;
		private boolean vacina;
		private boolean pedigree;
		//m�todos de acesso
		
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

		//m�todo construtor
		public Gato(String ra�a, String cor1, char gen) {
			this.ra�a=ra�a;
			this.cor=cor1;
			this.genero=gen;
			
		}
		//m�todos de classes
		public void miar() {
			System.out.println("miau, miau, miau");
		}
		
		public void levantarRabo() {
			System.out.println("levatou, levantou, levantou");
		}
		
		public boolean ca�ador(boolean ca�a) {
			if (ca�a) {
				System.out.println("A presa est� na boca");
			}
			else
			{
				System.out.println("Fica esperando a ra��o");
			}
			
			return ca�a;
		}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			Gato o1=new Gato("siames","branco",'M');
			o1.setIdade(5);
			Gato o2=new Gato("muchkin","bege",'M');
			o2.miar();
			Gato o3=new Gato("mesti�o","caramelo",'F');
			o3.ca�ador(false);
			Gato o4=new Gato("mesti�o","preto",'F');
			o4.ca�ador(true);
		}
	
}
