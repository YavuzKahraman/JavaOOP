package References;

public class Ana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// referanslar üretilmiş nesneleri temsil eden değişkenleri ifade eder. 
		Kisi k1 = new Kisi("Yavuz","Kahraman",35);
		
		Yonetici y1 = new Yonetici("Mesut", "Şahin", 25);
		
		İsci i1 = new İsci("Beyza","Şahin",18);
		
		//k1.yazdir();System.out.println("--------------");
		//y1.yazdir();System.out.println("--------------");
		//i1.yazdir();System.out.println("--------------");
		
		
		// NOTE: kalıtım alınan sınıftan referans gösterilir. 
		Kisi referans1 ;  //Kisiden referans nesnesi
		referans1 = k1;  // k1 nesnesini temsil eden referans değişkeni atandı
		referans1.yazdir();  //k1 yerine referans değişkeni ile çağırma işlemi yapıldı
		// referans i1, i1 nesneleri de olabilir. 
		System.out.println("--------------");
		Yonetici referans2;
		İsci referans3;
		
		referans2 = y1;
		referans3 = i1;
		
		referans2.yazdir();System.out.println("--------------");
		referans3.yazdir();System.out.println("--------------");
	}

}
