package metotAsiriYukleme;

public class Ana {

	public static void main(String[] args) {
		
		Hesaplama h1 = new Hesaplama();
		int sonuc1 = h1.topla(3, 5);
		System.out.println("Sonuç: "+ sonuc1);
		float sonuc2 = h1.topla(3.5f, 1.78f);
		System.out.println("Sonuç2: "+sonuc2);
		float sonuc3 = h1.topla(5, 3.5f);
		System.out.println("Sonuç3: "+sonuc3);

	}

}
	