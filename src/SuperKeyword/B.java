package SuperKeyword;

public class B extends A{
	int b;
	B(int a, int b) {
		super(a); // super demek kalıtım alınan sınıfın değişkenlerini ifade eder.
		this.b = b;
	}
	void yazdir() {
		super.yazdir();
		System.out.println("b: "+b);
	}

}
