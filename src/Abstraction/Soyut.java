package Abstraction;

// Sınıfın soyut olması için class önüne abstract etiketi eklenir.

public abstract class Soyut {
	
	// sınıfın içine soyut metotlar ya da normal metotlar eklenebilir. 
	abstract int topla(int a, int b);  // metot imzası oluşturulur
	
	//Normal metot oluşturalım.
	int carp (int a, int b) {
		return a*b;
	}
	
	int bol(int a, int b) {
		if (b == 0) {
			System.out.println("Zero division error. change the denominator");
			return -1;
		}
		return a/b;
	}

	int cikar(int a, int b) {
		return a-b;
	}

}
