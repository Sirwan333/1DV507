package sr222qn_assign1.ferryExercise;

public class Lorry extends Vehicle{
	private static int space =40;
	private static int maxPassengers =2;
	private static int currentVPassengers=0; 
	private static int passengersCost=20;
	private static int vihicleCost=300;
	
	public Lorry() {
		super(space, maxPassengers, currentVPassengers, passengersCost, vihicleCost);
	}

}
