package s066a;

public class Auto extends Vehicle implements ClimAndClose {
	@Override
	public String changeTemp() {
		return "Temperature set to 20°.";
	}

	public String closeWindows() {
		return "Car's windows closed.";
	}
}