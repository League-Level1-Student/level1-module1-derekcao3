

public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		
		// 1. Create a RaceCar and place it in 5th position
		RaceCar racecar = new RaceCar("Jake Paul", 5);
		// 2. Print the RaceCar's position in the race
		System.out.println(racecar.getPositionInRace());
		// 3. Crash the RaceCar
		racecar.crash();
		// 4. If the car is damaged. Bring it in for a pit stop.
		racecar.pit();
		// 5. Help the car move into first place.
		int pos = racecar.getPositionInRace();
		for (int i = 0; i < pos; i++) {
			racecar.overtake();
		}
	}
}
