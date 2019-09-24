package Game;

public class Main {
public static void main(String[] args) {
	Troll troll = new Troll("Troll1", 100, "Parco della Vittoria", 1);
	Human human = new Human("Umano1", 100, "Casata1", 1);

System.out.println(troll.name + " attacks " + human.name + " Damage: " + troll.Fight(human) + "\nHP Left:" + human.printHP());   
System.out.println(troll.name + " attacks " + human.name + " Damage: " + troll.Fight(human) + "\nHP Left:" + human.printHP());}
}