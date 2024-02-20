package Inheritance;

public class Yonetici extends Kisi 	{
	String rol;
	
	public void yazdir() {
		super.yazdir();
		System.out.println("Rol	: "+rol);
	}
}
