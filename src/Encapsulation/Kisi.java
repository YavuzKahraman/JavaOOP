package Encapsulation;

public class Kisi {
	// değişkenleri private yaparak kapsuılleme işlemi yapılır
	
	private String ad;
	private String soyad;
	private int yas;
	

	
//	public void setAd(String a) {
//		ad = a;
//	}
//	public void setSoyad(String s) {
//		soyad = s;
//	}
//	public void setYas(int y) {
//		if(y<=110 &&y>0 ) {
//			yas = y;
//		}else { 
//			yas = 9999990;
//			System.out.println("Girilen yaş değeri hatalıdır...");
//		}
//	}
//
//	public String getAd() {
//		return ad;
//	}
//	public String getSoyad() {
//		return soyad;
//	}
//	public int getYas() {
//		return yas;
//	}
//	
	
	
	// gettter ve setter metotları kullanmak için sağ tıklayıp source dan generate get set var.
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public int getYas() {
		return yas;
	}
	public void setYas(int yas) {
		
		if(yas>0 && yas<=120 ) {
			this.yas = yas;
		}else { 
			this.yas = 99999;
			System.out.println("Hatalı yaş girdisi......");
		}
	}

	public void yazdir() {
		System.out.println("Ad	:"+getAd());
		System.out.println("Soyad	:"+getSoyad());
		System.out.println("Yaş	:"+getYas());
	}
}
