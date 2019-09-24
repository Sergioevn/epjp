package Game;

public class Character {
	String name;
	int hp;
	String clan;
	double attack= Math.random()+1;
	public long getBonusDef;

	public Character(String name, int hp, String clan, int attack) {
		this.name = name;
		this.hp = hp;
		this.clan = clan;
		this.attack = attack;
	}

	public String printHP() {
		return String.valueOf(hp);
	}
	public void Fight() {};
	
	public void Attack(Character obj) {
	}

}
