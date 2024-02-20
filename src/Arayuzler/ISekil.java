package Arayuzler;

public interface ISekil {
	// erişim belirleyicisi default ya da public olmak zorundadır.
	// body kısmı yani parantezli kısmı olmaz. İmza şeklinde olmalıdır.
	// arayüzlerin değişken tanımlama özellikler bulunmaz. Yani
	// int sayi; şeklinde tanımlama yapılamaz.	
	
	public double alan(int a);
	public double cevre(int a);
}
