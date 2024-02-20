package Arayuzler;

public class Ana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kare k = new Kare();
		Daire d = new Daire();
		double kareAlan = k.alan(4);
		double kareCevre = k.cevre(4);
		double daireAlan = d.alan(4);
		double daireCevre = d.cevre(4);
		
		System.out.println("Kare alan: "+kareAlan+"\nKare cevre: "+kareCevre);
		System.out.println("Daire alan: "+daireAlan+"\nDaire cevre: "+daireCevre);

	}

}
