package Inheritance;

public class Ana {

	public static void main(String[] args) {
		// muhasebe sınıfından bir nesne oluştur:
		// hem encapsulation işlemi var hem de inheritance işlemi yapıldı
		Muhasebe m1 = new Muhasebe();
		m1.setAd("YUSUF");
		m1.setSoyad("MÜROĞLU");
		m1.setMaas(25000);
		m1.setYas(32);
		
		Kisi k1 = new Kisi();
		k1.setAd("yunus");
		k1.setSoyad("emre");
		k1.setYas(10);
		
		k1.yazdir();
		System.out.println("***********");
		m1.yazdir();
		
		System.out.println("***************");
		Yonetici y1 = new Yonetici();
		y1.setAd("Tapduk");
		y1.setSoyad("Emre");
		y1.setYas(55);
		y1.rol = "Müdür";
		y1.yazdir();
		
		

	}

}
