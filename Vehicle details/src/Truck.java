public class Truck extends Vehicle {
	
	static int truckCount = 0,totalFuel = 0,totalSpeed = 0;
	
	Truck(int fuel,int speed) {
		super.fuelAmount( fuel );
		super.averageSpeed( speed);
	}
	public void upCount() {
		truckCount++;
		totalFuel += get_fuel();
		totalSpeed += get_speed();
	}
	public void downCount() { 
		truckCount--;
		totalFuel -= get_fuel();
		totalSpeed -= get_speed();
	}
}