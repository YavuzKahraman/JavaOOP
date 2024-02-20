package Arayuzler;

public class Kare implements ISekil{

	// kare sınıfında ISekil rayüzünden kalıtım alındığı zaman
	// ISekil içindeki alan ve cevre metotları override edilmek zorundadır.
	// Not: Arayüzler kalıtım alınacaksa extends yerine implement alınır.
	
	@Override
	public double alan(int a) {
		
		return a*a;
	}

	@Override
	public double cevre(int a) {
		
		return 4*a;
	}

}
