public class Sphere extends Shape {
	//derived class Sphere
	
	double r, volume = 0.0;
	
	Sphere(double r) {
		super(r);
		this.r = super.get_data();
	}
	
	public double showVolume() {
		volume = (4 * 3.14 * r * r * r) / 3;
		return volume;
	}
	@Override
	public String toString() {
		return ("Volume of Sphere is :-  " + volume);
	}
}