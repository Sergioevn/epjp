package Game;

public class Troll extends Character {
	private double bonusDef = 0.15;

	public double getBonusDef() {
		return bonusDef;
	}

	public Troll(String name, int hp, String clan, int attack) {
		super(name, hp, clan, attack);
	}

	public double Fight(Character obj) {
		double random = Math.random() + 1;
		double damage = (double) random * attack * 3;
		return Math.round(damage);

	}

}
