public class Employee {
	//parent class
	
	private int eId, basicSal;
	private double ta, da, hra, ma, grossSal;
	private String eName;
	
	//get methods
	String get_Name() {
		return this.eName;
	}
	int get_eId() {
		return this.eId;
	}
	double get_ta() {
		return this.ta;
	}
	double get_da() {
		return this.da;
	}
	double get_hra() {
		return this.hra;
	}
	double get_ma() {
		return this.ma;
	}
	int get_basicSal() {
		return this.basicSal;
	}
	
	//set methods
	void set_eName(String eName) {
		this.eName = eName;
	}
	void set_eId(int eId) {
		this.eId = eId;
	}
	void set_ta(double ta) {
		this.ta = ta;
	}
	void set_da(double da) {
		this.da = da;
	}
	void set_hra(double hra) {
		this.hra = hra;
	}
	void set_ma(double ma) {
		this.ma = ma;
	}
	void set_basicSal(int basicSal) {
		this.basicSal = basicSal;
	}
	double calculateSalary() {
		grossSal = ta + da + hra + ma + basicSal;
		return grossSal;
	}
	@Override
	public String toString() {
		return ("Employee Id :-  " + eId + "\tEmployee Name :-  " + eName + "\tGross Salary :-  " + grossSal);
	}
}