package SuperKeyword;

public class C extends B {
	int c;
	C(int a, int b, int c){
		super(a, b);
		this.c = c;
	}
	void yazdir() {
		super.yazdir();
		System.out.println("c: "+c);
	}
}
