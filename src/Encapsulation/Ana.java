package Encapsulation;

// kapsülleme işlemi kişi klası içinde verilen değişkenlere değer ataması
// yapıldığında atanan değer olması gereken aralığın dışındaysa kullanılır.
// yani diyelim ki yaşa negatif değer giremeyiz ama değişken bu değeri kabul ediyorsa
// kapsülleme işlemi devreye girer. Bunu yapabilmek için de Kişi classı içinde 
// tanımlanan değişkenler private olarak tanımlanır. Peki private olan değişkenlere erişim nasıl olacak? 
// erişim kontrollü olacak ve bu kontrol kisi classı içinde sağlanır. 

public class Ana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kisi k1 = new Kisi();
//		k1.ad ="AH";
//		k1.soyad ="Kahraman";
//		k1.yas = 3;
		
		k1.setAd("Ayşema");
		k1.setSoyAd("Kahraman");
		k1.setYas(3);
		k1.yazdir();
	}

}
