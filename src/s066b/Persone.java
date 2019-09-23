package s066b;

public class Persone {
	private String nome;
	private String cognome;

	public Persone(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}
	

	public String toString() {
		return "Nome: " + nome + "\tCognome: " + cognome;
	}

//	public String getEarnings() {
//		return getEarnings();
//	}
}
