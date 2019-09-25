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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public String getClan() {
		return clan;
	}

	public void setClan(String clan) {
		this.clan = clan;
	}

	public double getAttack() {
		return attack;
	}

	public void setAttack(double attack) {
		this.attack = attack;
	}

	public long getGetBonusDef() {
		return getBonusDef;
	}

	public void setGetBonusDef(long getBonusDef) {
		this.getBonusDef = getBonusDef;
	}

	public String printHP() {
		return String.valueOf(hp);
	}
	public void Fight() {};
	
	public void Attack(Character obj) {
	}

}
