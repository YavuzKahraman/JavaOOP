package Inheritance;

public class Kisi {
	private String ad;
	private String soyad;
	private int yas;
	
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
		if(yas>=0 && yas<150) {
			this.yas = yas;
		}else {
			this.yas=66666;
			System.out.println("Yaş bilgisi yanlış girildi");
		}

	}
	
	
	public void yazdir() {
		System.out.println("Ad	: "+getAd());
		System.out.println("Soyad	: "+getSoyad());
		System.out.println("Yaş	: "+getYas());
	}
}
