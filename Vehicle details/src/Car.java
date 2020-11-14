public class Car extends Vehicle {
	
	static int carCount = 0,totalFuel = 0,totalSpeed = 0;
	
	Car(int fuel,int speed) {
		super.fuelAmount( fuel );
		super.averageSpeed( speed);
	}
	public void upCount() {
		carCount++;
		totalFuel += get_fuel();;
		totalSpeed += get_speed();;
	}
	public void downCount() { 
		carCount--;
		totalFuel -= get_fuel();
		totalSpeed -= get_speed();
	}
}
