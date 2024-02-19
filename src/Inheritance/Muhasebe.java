package Inheritance;

public class Muhasebe extends Kisi{
	int maas;
	
	public int getMaas() {
		return maas;
	}

	public void setMaas(int maas) {
		this.maas = maas;
	}

	public void yazdir() {
		System.out.println("Ad	: "+getAd());
		System.out.println("Soyad	: "+getSoyad());
		System.out.println("Yaş	: "+getYas());
		System.out.println("Maaş	: "+getMaas());
	}
}
