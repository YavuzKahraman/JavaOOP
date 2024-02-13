package OOP;

public class Araba {

	String plaka;
	int modelYili;
	String renk;
	String marka;
	
	public void hareketEt() {
		System.out.println("Araç hareket etti...");
	}
	
	public void durdur() {
		System.out.println("Araç durdu...");
	}
	public void yazdir() {
		System.out.println("Araç bilgileri: ");
		System.out.println("Marka : "+marka+", Model yılı: "+modelYili+", renk: "+renk+", plaka: "+plaka);
	}
	
	public String markaGoster() {
		return marka;
	}
	
}
