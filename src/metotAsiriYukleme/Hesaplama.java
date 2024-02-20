package metotAsiriYukleme;

public class Hesaplama {
	
	// metot adı aynı olmasına rağmen aldığı parametre tipleri(veya parametre sayısı) farklı
	// bu duruma metotların overloading olması işlemi denir. 
	
	public int topla(int a, int b) {
		System.out.println("Tam sayı toplam");
		return a+b;
	}
	public float topla(float a, float b) {
		System.out.println("Kesirli sayı toplam");
		return a+b;
	}
	public float topla(int a, float b) {
		System.out.println("tam+float sayı toplam");
		return a+b;
	}

}
