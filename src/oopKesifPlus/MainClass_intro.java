package oopKesifPlus;

public class MainClass_intro {

	public static void main(String[] args) {

		Insan hamza = new Insan();
		// set the variables
		hamza.setAnadil("TR");
		hamza.setIsim("hamza");
		hamza.setKimlikNo(22323);
		hamza.setYas(35);
		System.out.println("***********");
		System.out.println("İsim		:"+hamza.getIsim()+
		"\nAnadil		:"+hamza.getAnadil()+
		"\nKimlik no	:"+hamza.getKimlikNo()+
		"\nYas		:"+hamza.getYas());
		System.out.println("***********");
		Insan ahmet = new Insan();
		
	}

}
