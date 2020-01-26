package sr222qn_assign1.ferryExercise;

import java.util.ArrayList;

public class Vehicle {
	ArrayList<Passenger> passengersArr = new ArrayList<Passenger>();
	protected int space =0;
	protected int maxPassengers =0;
	protected int currentVPassengers=0; 
	protected int passengersCost=0;
	protected int vihicleCost=0;
	
	public Vehicle(int space, int maxPassengers, int currentVPassengers, int passengersCost, int vihicleCost) {
		this.space = space ;
		this.maxPassengers = maxPassengers ;
		this.currentVPassengers = currentVPassengers ;
		this.passengersCost = passengersCost ;
		this.vihicleCost = vihicleCost ;
	}
	
	public int countVSpace() {
		return space;
	}
	
	public int countVPassengers() {
		return this.passengersArr.size();
	}
	
	public void addVPassengers(Passenger passenger)throws IndexOutOfBoundsException {
		if (this.maxPassengers > this.passengersArr.size()) 
		{
            passengersArr.add(passenger);

        } 
		else 
		{
        	 throw new IndexOutOfBoundsException("Max Passengers");
        }
	}
	
	public int totalVCost() {

		return this.vihicleCost + (passengersArr.size() * passengersCost);
    }
}
