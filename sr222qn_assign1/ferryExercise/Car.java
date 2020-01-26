package sr222qn_assign1.ferryExercise;

public class Car extends Vehicle{
	private static int space =5;
	private static int maxPassengers =4;
	private static int currentVPassengers=0; 
	private static int passengersCost=20;
	private static int vihicleCost=100;
	
	public Car() {
		super(space, maxPassengers, currentVPassengers, passengersCost, vihicleCost);
	}

}
