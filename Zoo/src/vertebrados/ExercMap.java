package vertebrados;

import java.util.HashMap;

public class ExercMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap mp=new HashMap();
		mp.put("Noturno","Alfredo");
		mp.put("Mel","Ângela");
		mp.put("Belinha","Patrícia");
		System.out.println(mp.get("Noturno"));
	}
}
