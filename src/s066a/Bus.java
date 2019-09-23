package s066a;

public class Bus extends Vehicle implements Climatizzati {

	@Override
	public String changeTemp() {
		return "Temperature set to 20°.";
	}
}
