package Example;

public class Ana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=4, y=6, r=2;
		
		Kare kare = new Kare(x);
		Dikdortgen dikdortgen = new Dikdortgen(x,y);
		Daire daire = new Daire(r);
		
		System.out.println("Karenin bilgileri: "+kare.alan()+" ***"+kare.cevre());
		System.out.println("Dikdörtgen bilgileri: "+dikdortgen.alan()+"*** "+dikdortgen.cevre());
		System.out.println("daire bilgileri: "+daire.alan()+"*** "+daire.cevre());
		

	}

}
