public class TechnicalStaff extends Employee {
	//Derived class
	
	TechnicalStaff(int eId, String eName, int basicSal ) {
		
		super.set_basicSal(basicSal);
		super.set_eId(eId);
		super.set_eName(eName);
		
		super.set_ta(0.1 * basicSal);
		super.set_da(0.5 * basicSal);
		super.set_hra(0.2 * basicSal);
		super.set_ma(0.2 * basicSal);
	}
}