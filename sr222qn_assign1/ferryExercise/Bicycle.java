package sr222qn_assign1.ferryExercise;

public class Bicycle extends Vehicle{
	private static int space =1;
	private static int maxPassengers =1;
	private static int currentVPassengers=0; 
	private static int passengersCost=0;
	private static int vihicleCost=40;

	public Bicycle() {
		super(space, maxPassengers, currentVPassengers, passengersCost, vihicleCost);

	}
}
