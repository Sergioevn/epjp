package Game;

public class Main {
public static void main(String[] args) {
	Troll[] trollArray = new Troll[5];
	Human[] humanArray = new Human [5];
	trollArray[0]= new Troll("Troll5", 100, "Parco della Vittoria", 1);
	trollArray[1] = new Troll("Troll4", 100, "Parco della Vittoria", 1);
	trollArray[2] = new Troll("Troll3", 100, "Parco della Vittoria", 1);
	trollArray[3] = new Troll("Troll2", 100, "Parco della Vittoria", 1);
	trollArray[4] = new Troll("Troll1", 100, "Parco della Vittoria", 1);
	humanArray [0] = new Human("Umano5", 100, "Casata1", 1);
	humanArray [1]= new Human("Umano4", 100, "Casata1", 1);
	humanArray [2]= new Human("Umano3", 100, "Casata1", 1);
	humanArray [3]= new Human("Umano2", 100, "Casata1", 1);
	humanArray [4]= new Human("Umano1", 100, "Casata1", 1);
while (humanArray[0].getHp()>0 && trollArray[0].getHp()>0) {
System.out.println(trollArray[0].getName() + " attacks " + humanArray[0].getName() + " Damage: " + trollArray[0].Fight(humanArray[0]) + "\n\n HP Left:" + humanArray[0].printHP());   
System.out.println(humanArray[0].getName() + " attacks " + trollArray[0].getName() + " Damage: " + humanArray[0].Fight(trollArray[0]) + "\nHP Left:" + trollArray[0].printHP());}   

}

}