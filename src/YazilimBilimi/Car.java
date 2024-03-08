package YazilimBilimi;

public class Car {
	// properties; fields
	private String color;
	private String model;
	private double engine;
	private int doors;
	
	
	// parametreli constructor
	public Car(String color, String model, double engine, int doors) {
		this.color = color;
		this.model = model;
		this.engine = engine;
		this.doors = doors;
	}
	
	// boş constructor
	public Car() {
		
	}
	
	//Bilgileri göster metodu
	public void showInfos() {
		System.out.println("Arabanın Rengi: "+this.color);
		System.out.println("Arabanın model: "+this.model);
		System.out.println("Arabanın motor: "+this.engine);
		System.out.println("Arabanın kapı : "+this.doors);
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setEngine(double engine) {
		this.engine = engine;
	}
	
	public void setDoors(int doors) {
		if (doors == 2 || doors == 4) {
			this.doors = doors;
		}
		else {
			System.out.println("Kapı sayısı sadece 2 veya 4 olabilir");
			this.doors = 2222;
		}
		
	}
	
	public String getColor() {
		return this.color;
	}
	public String getModel() {
		return this.model;
	}
	public double getEngine() {
		return this.engine;
	}
	public int getDoors() {
		return this.doors;
	}


	public void start() {
		System.out.println("Car started the engine");
	}
	public void stop() {
		System.out.println("Car stopped");
	}
}
