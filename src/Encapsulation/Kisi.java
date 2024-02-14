package Encapsulation;

public class Kisi {
	private String ad;
	private String soyad;
	private int yas;
	
	public void yazdir() {
		System.out.println("Ad: "+ad+" Soyad: "+soyad+" Yas: "+yas);
	}
	public void setAd(String a) {
		ad = a;
	}	
	public void setSoyAd(String s) {
		soyad = s;
	}
	public void setYas(int y) {
		if (y>=0 && y<100) {
			yas = y;			
		}else {
			yas = 0;
			System.out.println("Hatalı yaş bilgisi girildi");
		}

	}

}
