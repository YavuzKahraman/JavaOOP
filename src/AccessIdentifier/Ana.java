package AccessIdentifier;

public class Ana {

	public static void main(String[] args) {

		Kisi kisi1 = new Kisi("yy","kk",36);
		
		System.out.println("Kisi1 nesnesinin elemanları: ");
		kisi1.yazdir();
		kisi1.ad= "yusuf";
		System.out.println(kisi1.ad);
		
		Kisi k2 = new Kisi("Elif","Kahraman",25);
		System.out.println("k2 nesnesinin elemanları");
		k2.yazdir();
	}

}
