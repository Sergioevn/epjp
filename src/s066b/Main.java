package s066b;

public class Main {
	public static void main(String[] args) {
		Persone[] persone = new Persone[6];

		persone[0] = new Dipendente("Ugo", "Verdi", Math.round(Math.random()*10000));
		persone[1] = new Dipendente("Marco", "Rossi", Math.round(Math.random()*10000));
		persone[2] = new Consulente("Paolo", "Verdi", "Accenture", Math.round(Math.random()*10000));
		persone[3] = new Dipendente("Giovanni", "Marchi", Math.round(Math.random()*10000));
		persone[4] = new Consulente("Antonio", "Gialli", "Deloitte", Math.round(Math.random()*10000));
		persone[5] = new Consulente("Franco", "Neri", "KPMG", Math.round(Math.random()*10000));
		for (Persone lavoratori : persone)
			System.out.println(lavoratori.toString());
	}
}
