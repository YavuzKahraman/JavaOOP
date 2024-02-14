package Encapsulation;

public class Kisi {
	private String ad;
	private String soyad;
	private int yas;

// değişkenlere değer atama metotları oluşturuldu
//	public void setAd(String a) { ad = a; }	
//	public void setSoyAd(String s) { soyad = s; }
//	public void setYas(int y) {
//		if (y>=0 && y<100) { yas = y;}
//		else {yas = 0; System.out.println("Hatalı yaş bilgisi girildi");}
//	}

	
// ad soyad ve yaş bilgisini geri dönüşlü olarak metotla alalım
//	public String getAd() {	return ad;}
//	public String getSoyad() { return soyad;}
//	public int getYas() { return yas;}
	

	
	// sağ tıklayıp getter setter ekle.........
	public String getAd() {return ad;}
	public void setAd(String ad) { this.ad = ad;}
	public String getSoyad() { return soyad;}
	public void setSoyad(String soyad) {this.soyad = soyad;}
	public int getYas() {return yas;}
	public void setYas(int yas) {this.yas = yas;}	
	
	
	// kapsüllenmiş değişkenleri yazdırma
	public void yazdir() {
		//Get set metotları kullanılarak yazdırma
		System.out.println("Ad: "+getAd()+" Soyad: "+getSoyad()+" Yaş: "+getYas());
	}

}
