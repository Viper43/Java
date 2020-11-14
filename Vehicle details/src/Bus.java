public class Bus extends Vehicle {
	
	static int busCount = 0, totalFuel = 0, totalSpeed = 0;
	
	Bus(int fuel,int speed) {
		super.fuelAmount( fuel );
		super.averageSpeed( speed);
	}
	public void upCount() {
		busCount++;
		totalFuel += get_fuel();
		totalSpeed += get_fuel();
	}
	public void downCount() { 
		busCount--;
		totalFuel -= get_fuel();
		totalSpeed -= get_speed();
	}
}