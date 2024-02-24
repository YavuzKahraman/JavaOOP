package SuperKeyword;


// NOT: static bir metota direk erişim sağlanır. 
// Ancak statik olmayan bir metoda erişmek için nesne oluşturmalıyız
// static bir değişkene statik veya statik olmayan bir metot erişebilir 
// ancak statik olmayan bir değişkene statik bir metot erişemez.
// normal bir değişken nesneye özel olur. Ancak statik bir değişken global olur
public class Ana {

	public static void main(String[] args) {
		int s1, s2, s3;
		s1 = 10; s2 = 20; s3 = 30;
		A a = new A(s1);
		B b = new B(s1,s2);
		C c = new C(s1,s2, s3);
		
		System.out.println("A nesnesi bilgileri: ");
		a.yazdir();
		System.out.println("__________________");
		
		System.out.println("B nesnesi bilgileri: ");
		b.yazdir();		
		System.out.println("__________________");

		System.out.println("C nesnesi bilgileri: ");
		c.yazdir();
		System.out.println("__________________");

	}

}
