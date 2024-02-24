package Example;

public class Kare extends Sekil{
	Kare (int x) {
		this.x = x;
	}
	
	@Override
	double alan() {
		return x*x;
	}
	
	@Override
	double cevre() {
		return 4*x;
	}
	
	
}
