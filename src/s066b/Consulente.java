package s066b;

public class Consulente extends Persone {
	private double commissioni;
	private String ditta;

	public Consulente(String nome, String cognome, String ditta, double commissioni) {

		super(nome, cognome);
		this.commissioni = commissioni;
		this.ditta = ditta;
	}

	@Override
	public String toString() {
		return super.toString() + "\tCommissioni: " + commissioni + "[€]" + "\tDitta: " + ditta;
	}

}
