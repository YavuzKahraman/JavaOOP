package Example;

public class Daire extends Sekil{
	Daire(int r) {
		this.r = r;
	}
	@Override
	double alan() {
		return Math.PI*r*r;
	}
	
	@Override
	double cevre() {
		return 2*Math.PI*r;
	}

}
