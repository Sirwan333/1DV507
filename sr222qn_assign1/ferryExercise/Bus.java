package sr222qn_assign1.ferryExercise;

public class Bus extends Vehicle{
	private static int space =20;
	private static int maxPassengers =20;
	private static int currentVPassengers=0; 
	private static int passengersCost=15;
	private static int vihicleCost=200;

	public Bus() {
		super(space, maxPassengers, currentVPassengers, passengersCost, vihicleCost);

	}

}
