package sr222qn_assign1.ferryExercise;

public class FerryMain {

	public static void main(String[] args) {
		FerryI ferry = new FerryI();
		
		Bus bus = new Bus();
		Bus bus1 = new Bus();
		Car c = new Car();
		Car c1 = new Car();
		Bicycle bi = new Bicycle();
        Bicycle bi1 = new Bicycle();
        Bicycle bi2 = new Bicycle();
        Lorry lo = new Lorry();
        Lorry lo1 = new Lorry();
        Lorry lo2 = new Lorry();
        Passenger passenger = new Passenger();
        Passenger passenger2 = new Passenger();
        Passenger passenger3 = new Passenger();
        Passenger passenger4 = new Passenger();
        Passenger passenger5 = new Passenger();
        Passenger passenger6 = new Passenger();
        Passenger passenger7 = new Passenger();
  

        c.addVPassengers(new Passenger());
        c.addVPassengers(new Passenger());
        c.addVPassengers(new Passenger());
        c.addVPassengers(new Passenger());
        
        c1.addVPassengers(new Passenger());
        c1.addVPassengers(new Passenger());
        c1.addVPassengers(new Passenger());
        c1.addVPassengers(new Passenger());
        
        bi.addVPassengers(new Passenger());
        
        bi1.addVPassengers(new Passenger());
        
        bi2.addVPassengers(new Passenger());
        
        bus.addVPassengers(new Passenger());
        bus.addVPassengers(new Passenger());
        bus.addVPassengers(new Passenger());
        bus.addVPassengers(new Passenger());
        bus.addVPassengers(new Passenger());
        bus.addVPassengers(new Passenger());
        bus.addVPassengers(new Passenger());
        bus.addVPassengers(new Passenger());
        bus.addVPassengers(new Passenger());
        bus.addVPassengers(new Passenger());
        bus.addVPassengers(new Passenger());
        bus.addVPassengers(new Passenger());
        bus.addVPassengers(new Passenger());
        bus.addVPassengers(new Passenger());
        bus.addVPassengers(new Passenger());
        bus.addVPassengers(new Passenger());
        bus.addVPassengers(new Passenger());
        bus.addVPassengers(new Passenger());
        bus.addVPassengers(new Passenger());
        bus.addVPassengers(new Passenger());
        
        bus1.addVPassengers(new Passenger());
        bus1.addVPassengers(new Passenger());
        bus1.addVPassengers(new Passenger());
        bus1.addVPassengers(new Passenger());
        bus1.addVPassengers(new Passenger());
        bus1.addVPassengers(new Passenger());
        bus1.addVPassengers(new Passenger());
        bus1.addVPassengers(new Passenger());
        bus1.addVPassengers(new Passenger());
        bus1.addVPassengers(new Passenger());
        bus1.addVPassengers(new Passenger());
        bus1.addVPassengers(new Passenger());
        bus1.addVPassengers(new Passenger());
        bus1.addVPassengers(new Passenger());
        bus1.addVPassengers(new Passenger());
        bus1.addVPassengers(new Passenger());
        bus1.addVPassengers(new Passenger());
        bus1.addVPassengers(new Passenger());
        bus1.addVPassengers(new Passenger());
        bus1.addVPassengers(new Passenger());
        
        lo.addVPassengers(new Passenger());
        lo.addVPassengers(new Passenger());

        lo1.addVPassengers(new Passenger());
        lo1.addVPassengers(new Passenger());

        lo2.addVPassengers(new Passenger());
        lo2.addVPassengers(new Passenger());
        
        ferry.embark(bus);
        ferry.embark(bus1);
        ferry.embark(c);
        ferry.embark(c1);
        ferry.embark(bi);
        ferry.embark(bi1);
        ferry.embark(bi2);
        ferry.embark(lo);
        ferry.embark(lo1);
        ferry.embark(lo2);
        ferry.embark(passenger);
        ferry.embark(passenger2);
        ferry.embark(passenger3);
        ferry.embark(passenger4);
        ferry.embark(passenger5);
        ferry.embark(passenger6);
        ferry.embark(passenger7);
     
        System.out.println("Is there room for more passengers? " + ferry.hasRoomFor(passenger));
        System.out.println(ferry.toString());
         
	
	
	}

}
