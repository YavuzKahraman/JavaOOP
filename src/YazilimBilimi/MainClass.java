package YazilimBilimi;

public class MainClass {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.setColor("red");
		car1.setModel("Megane");
		car1.setEngine(1.6);
		car1.setDoors(4);
		
		
		
		//System.out.println("Araba rengi: "+car1.color);
		//System.out.println("Araba model: "+car1.model);
		//System.out.println("Araba motor hacmi: "+car1.engine);
		//System.out.println("Araba kapı sayısı: "+car1.doors);
		System.out.println("Car color : "+car1.getColor());
		System.out.println("Car model : "+car1.getModel());
		System.out.println("Car engine: "+car1.getEngine());
		System.out.println("Car doors : "+car1.getDoors());
		System.out.println("Arabayı çalıştırıyorum....");
		car1.start();
		System.out.println("Arabayı durduruyourm...");
		car1.stop();
	}

}
