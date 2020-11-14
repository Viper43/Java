public class Manager extends Employee {
	//Derived class
	Manager(int eId, String eName, int basicSal ) {
		super.set_basicSal(basicSal);
		super.set_eId(eId);
		super.set_eName(eName);
		
		super.set_ta(0.15 * basicSal);
		super.set_da(0.7 * basicSal); 
		super.set_hra(0.24 * basicSal);
		super.set_ma(0.2 * basicSal);
	}
}