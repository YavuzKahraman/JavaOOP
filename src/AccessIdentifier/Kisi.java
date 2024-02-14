package AccessIdentifier;

public class Kisi {
	public String ad;  // private olsaydı ana sınıf dosyasında erişime kapalı olacaktı.
	private String soyad;      // başında erişim belirleyici yok ama default olarak içinde bulunduğu projede erişilebilir.
	int yas;
	
	//Constructor metodu yazalım
	public Kisi(String i, String s, int y) {
		ad = i;
		soyad = s;
		yas = y;
	}
	//private olmasına rağmen erişmek istersek;
	public void yazdir() {
		System.out.println(ad+" "+soyad+" "+yas);
	}
	


}
