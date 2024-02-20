package Abstraction;

public class Ana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Soyut ss;  // sadece referans kullanılır soyut sınıflarda
		Hesap hs  = new Hesap();
		
		// hs nesnesi
		System.out.println("Topla: "+hs.topla(3, 5));
		System.out.println("Çıkar: "+hs.cikar(3, 5));
		System.out.println("Çarp: "+hs.carp(3, 5));
		System.out.println("Bol: "+hs.bol(10, 5));


	}

}
