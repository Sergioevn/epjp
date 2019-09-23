package s066b;

public class Dipendente extends Persone {
	private double money;

	public Dipendente(String nome, String cognome, double money) {

		super(nome, cognome);
		this.money = money;
	}

	@Override
	public String toString() {
		return super.toString() + "\tSalario: " + money + "[€/month]";
	}

}
