package vertebrados;

import javax.swing.JOptionPane;

public class Array {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gato[] pet=new Gato [3];
		Object[] item = new Object [3];
		Object selecionado=new Object();
		
		for (int i=0;i<3;i++)
		{
			pet[i]= new Gato ("Bichano");
			pet[i].setPeso(JOptionPane.showInputDialog("Informe o peso do seu Gato"+i ));
			pet[i].setPelagem(JOptionPane.showInputDialog("Informe o tipo de pelagem do Gato"));
			pet[i].setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do seu Gato")));
		}
		
			
		for (int i=0;i<3;i++)  item[i]=pet[i].getPelagem();
		selecionado = JOptionPane.showInputDialog(null, "Escolha pelagem", "Opçao", JOptionPane.INFORMATION_MESSAGE, null, item, item[0]);
			
			
			
		for (int i=0;i<3;i++)
		{
			
			if (selecionado.equals(pet[i].getPelagem()))
				System.out.println("A pelagem do gato é " + pet[i].getPelagem());
			
		}
		
	}

}
