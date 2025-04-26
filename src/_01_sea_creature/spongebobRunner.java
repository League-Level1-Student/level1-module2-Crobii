package _01_sea_creature;

public class spongebobRunner {
	public static void main (String [] args) {
		//Spongebob
		SeaCreature spongebob = new SeaCreature("Spongebob");
		System.out.println(spongebob.getName());
		spongebob.eat();
		spongebob.laugh();
		//Patrick
		SeaCreature patrick = new SeaCreature("Patrick");
		System.out.println(patrick.getName());
		patrick.eat();
		patrick.laugh();
		//Squidward
		SeaCreature squidward = new SeaCreature("Squidward");
		System.out.println(squidward.getName());
		squidward.eat();
		squidward.laugh();
		}
}
