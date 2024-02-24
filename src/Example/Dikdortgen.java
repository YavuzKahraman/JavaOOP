package Example;

public class Dikdortgen extends Sekil{
	
	Dikdortgen(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	double alan() {
		return x*y;
	}
	
	@Override
	double cevre() {
		return 2*(x+y);
	}

}
