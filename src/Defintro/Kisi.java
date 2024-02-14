package Defintro;

public class Kisi {
	// Şimdilik Kisi class ı içinde yapıcı metot görünmüyor. Aşağıdaki yapıcı metot otomatik olarak gizlenmiştir. 
	String isim;
	String soyisim;
	int yas;
	public Kisi() {
		System.out.println("parametresiz yapıcı metot");
		} //Yapıcı metot. Parametre almayan hali. biz oluşturduk. 
	
	public Kisi(String i) {
		System.out.println("String parametreli yapıcı metot");
		isim = i;
		} // Parametre alan yapıcı metot
	
	public Kisi(String i,String s, int y) {
		System.out.println("string ve integer parametreli yapıcı metot.");
		isim = i;
		soyisim = s;
		yas = y;
		}
	
	

}
