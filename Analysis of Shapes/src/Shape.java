public class Shape {
	//base class
	
	private double data, volume ;
	
	Shape() {
		data = 0.0;
		volume = 0.0;
	}
	
	Shape(double data) {
		this();
		this.data = data;
	}
	
	double get_data() {
		return data;
	}
	
	public double showVolume() {
		return 0;
	
	}
	@Override
	public String toString() {
		return "";
	}
}