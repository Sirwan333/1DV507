package sr222qn_assign1.ferryExercise;

import java.util.ArrayList;
import java.util.Iterator;

public class FerryI implements Ferry  {
	private ArrayList<Passenger> passengersArray = new ArrayList<Passenger>();
	private ArrayList<Vehicle> vehiclesArray = new ArrayList<Vehicle>();
	int passengersNumber=0;
	int vehiclesNumber=0;
	int money =0;
	
	@Override
	public int countPassengers() {

		return passengersNumber;
	}

	@Override
	public int countVehicleSpace() {

		return vehiclesNumber;
	}

	@Override
	public int countMoney() { 
		
		int moneySum = 0;
		for (Vehicle v : this.vehiclesArray) 
		{
			moneySum += v.totalVCost();
		}
		Passenger p = new Passenger();
		moneySum += (p.passengersCost() * this.passengersArray.size());
		this.money = money + moneySum;
		return this.money;
	}

	@Override
	public Iterator<Vehicle> iterator() {
		return new VehicleIterator();
	}

	@Override
	public void embark(Vehicle v) {
		if (this.vehiclesArray.contains(v)) 
		{
			System.err.println("The Vehicle was embarked");
		} 
		else 
		{
			this.vehiclesNumber += v.countVSpace();
			if (this.vehiclesNumber >= 200) 
			{
				throw new IndexOutOfBoundsException ("error");
			}
			passengersNumber += v.countVPassengers();
			vehiclesArray.add(v);
		}
	}

	@Override
	public void embark(Passenger p) {
		passengersNumber++;
		if (passengersNumber >= 200) 
		{
			throw new IndexOutOfBoundsException("error");
		} 
		else 
		{
			passengersArray.add(p);
		}
	}

	@Override
	public void disembark() {
		passengersArray.clear();
		vehiclesArray.clear();
		passengersNumber=0;
		vehiclesNumber=0;
	}

	@Override
	public boolean hasSpaceFor(Vehicle v) {
		vehiclesNumber += v.countVSpace();
		if (this.vehiclesNumber <= 200) 
		{
			vehiclesNumber -= v.countVSpace();
			return true;
		}
		else 
		{
		vehiclesNumber -= v.countVSpace();
		return false;
		}
	}
	
	@Override
	public boolean hasRoomFor(Passenger p) {
		if(this.passengersArray.size()<200) 
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public class VehicleIterator implements Iterator<Vehicle> {
		private int in;
		
		public VehicleIterator() {

			in = 0;
		}

		public boolean hasNext() {
			return in < vehiclesArray.size();
		}

		public Vehicle next() {
			return vehiclesArray.get(in++);
		}
	}
	
	public String toString() { 

		String niceString = "Status of the ferry\n"+"Money Earned: "+countMoney()+"\n"+
		"Total Passengers on Board: "+countPassengers()+"\n"+
		"Total Vehicle Space on Board: "+countVehicleSpace();

		return niceString;
	}
}