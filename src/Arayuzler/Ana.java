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
		System.out.println("********************");
		ISekil sekil;
		sekil = k;
		double kAlan = sekil.alan(5);
		double kCevre = sekil.cevre(5);
		System.out.println("Kare alan: "+kAlan+"\nKare cevre: "+kCevre);
		
		sekil = d;
		double dAlan = sekil.alan(5);
		double dCevre = sekil.cevre(5);
		System.out.println("Daire alan: "+dAlan+"\nDaire cevre: "+dCevre);

	}

}
