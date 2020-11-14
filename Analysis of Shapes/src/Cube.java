public class Cube extends Shape {
	//Derived class Cube
	
	 public double a, volume = 0.0;
	
	Cube(double a) {
		super(a);
		this.a = super.get_data();
	}
	
	public double showVolume() {
		volume = a * a * a;
		return volume;
	}
	@Override
	public String toString() {
		return ("Volume of Cube is :-  " + volume);
	}
}