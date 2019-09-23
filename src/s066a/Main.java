package s066a;

public class Main {
	public static void main(String[] args) {
		Climatizzati[] climatizzati = new Climatizzati[2];

		climatizzati[0] = new Bus();
		climatizzati[1] = new Auto();

		for (Climatizzati veicoli : climatizzati) {
			System.out.println(veicoli.changeTemp());
		}
		ClimAndClose cac = new Auto();
		System.out.println(cac.closeWindows());
	
	Vehicle[] vehicles = new Vehicle[3];

	vehicles[0]=new Bus();
	vehicles[1]=new Auto();
	vehicles[2]= new Moto();
	for (Vehicle item:vehicles) {
		System.out.println((item.getClass()).getName() + " " + item.changeDir());
	}
	}}


