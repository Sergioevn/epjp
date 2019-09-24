package Game;

public class Human extends Character {
	private double bonusAtt= Math.random()+1;

	public Human(String name, int hp, String clan, int attack) {
		super(name, hp, clan, attack);
	}

	public void Fight(Character obj) {
		double att = (Math.random() + 1) * bonusAtt*3;
		double random = Math.random() + 1;
		double damage = (double) random * (attack * att);
		 if (obj instanceof Human) {obj.hp-= Math.round(damage);} else {obj.hp -= obj.getBonusDef*Math.round(damage);}

	}


}
