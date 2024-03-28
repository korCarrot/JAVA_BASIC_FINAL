package interfaceEx3;

public class InstanceOfEx {

	public static void main(String[] args) {
		
		Taxi taxi=new Taxi();
		Bus bus=new Bus();
		
		
		ride(taxi);
		
		
		//System.out.println(taxi instanceof Taxi);
		
		//System.out.println(taxi instanceof Bus);
		
		
		
		ride(bus);
		
		//System.out.println(bus instanceof Bus);
		
		

	}
	
	static void ride(Vehicle vehicle){
		
		
		if(vehicle instanceof Bus bus) {
			//Bus bus=(Bus) vehicle;
			bus.checkFare();
		}
		vehicle.run();
	}

}
