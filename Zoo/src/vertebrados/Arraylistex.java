package vertebrados;

import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner cons=new Scanner(System.in);
		ArrayList<Gato> loja=new ArrayList<Gato>();
		Gato pet;
		
		for (int i=0;i<3;i++)
		{
			pet=new Gato("Bichano");
			System.out.println("Digite a Peso do Gato"+i );
			pet.setPeso(cons.nextFloat());            //nextFloat());
			pet.setPelagem(JOptionPane.showInputDialog("A pelagem do gato"));
			System.out.println("A idade do gato");
			pet.setIdade(cons.nextInt());
			loja.add(pet);
			
		}
		
		System.out.println("tamanho "+loja.size());
		for (int i=0;i<loja.size();i++)
		{
			pet=(Gato)loja.get(i);
			System.out.println("A pelagem do gato é " +pet.getPelagem());
		}
	}

}
