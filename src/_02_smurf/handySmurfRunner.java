package _02_smurf;

public class handySmurfRunner {
	public static void main (String [] args) {
	Smurf handySmurf = new Smurf("Handy");
	System.out.println(handySmurf.getName());
	handySmurf.eat();

	Smurf papaSmurf = new Smurf("papa");
	System.out.println(papaSmurf.getName());
	System.out.println(papaSmurf.getHatColor());
	papaSmurf.eat();
	
	Smurf smurfette = new Smurf("smurfette");
	System.out.println(smurfette.getName());
	
	
	
}
}
