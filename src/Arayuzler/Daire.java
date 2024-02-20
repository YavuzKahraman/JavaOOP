package Arayuzler;

public class Daire implements ISekil{

	@Override
	public double alan(int a) {
		// TODO Auto-generated method stub
		return Math.PI*a*a;
	}

	@Override
	public double cevre(int a) {
		// TODO Auto-generated method stub
		return 2*Math.PI*a;
	}

}
