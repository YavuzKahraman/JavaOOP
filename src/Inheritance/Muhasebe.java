package Inheritance;

public class Muhasebe extends Kisi{
	private int maas;
	
	public int getMaas() {
		return maas;
	}

	public void setMaas(int maas) {
		this.maas = maas;
	}

	public void yazdir() {
		super.yazdir();
		System.out.println("Maaş	: "+getMaas());
	}
}
