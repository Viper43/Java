public class Labour extends Employee {
	//Derived class
	Labour(int eId, String eName, int basicSal ) {
		super.set_basicSal(basicSal);
		super.set_eId(eId);
		super.set_eName(eName);
		
		super.set_ta(0.1 * basicSal);
		super.set_da(0.3 * basicSal);
		super.set_hra(0.1 * basicSal);
		super.set_ma(0.1 * basicSal);
	}
}