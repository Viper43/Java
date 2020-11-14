public class RectangularPrism extends Shape {
	//derived class Rectangular Prism
	
	double l, b, h, volume = 0.0;
	
	RectangularPrism(double l, double b, double h) {
		super(l);
		this.l = super.get_data();
		this.b = b;
		this.h = h;
	}
	
	public double showVolume() {
		volume = l * b * h;
		return volume;
	}
	@Override
	public String toString() {
		return ("Volume of Rectangular Prism is :-  " + volume);
	}
}
