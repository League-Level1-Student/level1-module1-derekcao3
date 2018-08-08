
public class Duck {
	int numberOfFriends;
	String favoriteFood;	
	void quack() {
		System.out.println("quack");
	}
	void waddle() {
		}
	Duck(String favoriteFood, int numberOfFriends) {
	       this.favoriteFood = favoriteFood;
	       this.numberOfFriends = numberOfFriends;
	}
	public static void main(String[] args) {
		 Duck daffy = new Duck("donuts",5);
		 daffy.quack(); 
	}
}
