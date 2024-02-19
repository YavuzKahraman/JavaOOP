package Inheritance;

public class Kisi {
	String ad;
	String soyad;
	int yas;
	
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
	
}
