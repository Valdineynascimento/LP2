package vertebrados;

import java.util.HashSet;

public class ExercSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet conjunto =new HashSet();
		conjunto.add("Noturno");
		conjunto.add("Mel");
		conjunto.add("Belinha");
		conjunto.add("Floco de neve");
		conjunto.add("Garfield");
		{
			System.out.println(conjunto.toString());
		}
		
		conjunto.remove("Floco de neve");
		
		{
			System.out.println(conjunto.toString());
		}
		
		conjunto.add("Barto");
		conjunto.add("Cruel");
		conjunto.remove("Noturno");
		
		{
			System.out.println(conjunto.toString());
		}
		
	}

}
