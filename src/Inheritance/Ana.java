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
		
		m1.yazdir();
		
		

	}

}
