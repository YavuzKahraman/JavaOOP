package References;

public class Kisi {
	String ad;
	String soyad;
	int yas;
	
	// this kullanılacaksa kisi parametreleri ve içerdeki
	// parametreler ynı olmaması için kullanılır
	Kisi(String ad, String soyad, int yas){
		this.ad = ad;
		this.soyad = soyad;
		this.yas = yas;
	}
	
	public void yazdir() {
		System.out.println("Ad	: "+ad);
		System.out.println("Soyad	: "+soyad);
		System.out.println("Yas	: "+yas);
	}

}
