package MetotOverride;

public class Ana {

	public static void main(String[] args) {
		
		// kus nesnesinin özellikleri
		Kus k = new Kus();
		k.boy = 5;
		k.kilo = 1;
		k.sesVer();
		
		// Kopek nesnesinin özellikleri
		Kopek kp = new Kopek();
		kp.boy = 8;
		kp.kilo =16;
		kp.sesVer();
		
		// Kedi nesnesinin özellikleri
		Kedi kd = new Kedi();
		kd.boy = 6;
		kd.kilo = 6;
		kd.sesVer();
				

	}

}
