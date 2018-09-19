package extra;

public class TacoMaker {
public static void main(String[] args) {
	Taco taco = new Taco();
	taco.setMeat("soup");
	taco.setSauce("S O U P");
	System.out.println("Taco has " + taco.getMeat() + " and " + taco.getSauce() + "!" );
}
}
