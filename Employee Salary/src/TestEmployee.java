import java.util.Scanner;
public class TestEmployee {
	
	int end=0, n;
	public Employee e[];
	Scanner sc = new Scanner(System.in);
	
	TestEmployee(int n) {
		//Constructor
		
		this.n = n;
		e = new Employee[n];
	}
	
	void insert_Manager() {	
		//Inserts Manager into array
		
		if( end == n )
			System.out.println("Insertion not possible as Array is full.........");
		
		else {
			System.out.println("Enter employee Id :-");
			int eId = sc.nextInt();
			System.out.println("Enter employee Name :-");
			String eName = sc.next();
			System.out.println("Enter basic Salary :-");
			int basicSal = sc.nextInt();
				
			e[end]= new Manager(eId, eName, basicSal);
				
			end++;
		}
	}
	
	void insert_TechnicalStaff() {
		//Inserts TechnicalStaff into array
		
		if( end == n )
			System.out.println("Insertion not possible as Array is full.........");
		
		else {
			System.out.println("Enter employee Id :-");
			int eId = sc.nextInt();
			System.out.println("Enter employee Name :-");
			String eName = sc.next();
			System.out.println("Enter Basic Salary :-");
			int basicSal = sc.nextInt();
				
			e[end]= new TechnicalStaff(eId, eName, basicSal);
				
			end++;		
		}
	}
	
	void insert_Labour()	{
		//Inserts Labour into array
		
		if( end == n )
			System.out.println("Insertion not possible as Array is full.........");
		
		else {
			System.out.println("Enter employee Id :-");
			int eId = sc.nextInt();
			System.out.println("Enter employee Id :-");
			String eName = sc.next();
			System.out.println("Enter Speed:-");
			int basicSal = sc.nextInt();
				
			e[end]= new Labour(eId, eName, basicSal);
				
			end++;
		}
	}
	
	void delete(int position) {
		//Deletes Employee objects from array
		
		int i;
		--position;
			
		if( end == 0 )
			System.out.println("Deletion not possible as Queue is empty");
		
		else {
			for( i = position; i < end-1; i++ ) {
				e[i]=e[i+1];
			}
			end--;
			System.out.println("Successful");
		}
	}
	
	void calculate() {
		//Calculates the avarage salary
		int i, maxpos = 0, minpos = 0 ;
		double avgSalary = 0.0,  max = 0.0, min = 9999999.0;
		
		for( i = 0; i<end; i++ ) {
			if ( e[i].calculateSalary() > max ) {
				max = e[i].calculateSalary();
				maxpos = i;
			}
			if ( e[i].calculateSalary() < min ) {
				min = e[i].calculateSalary();
				minpos = i;
			}
				
			avgSalary += e[i].calculateSalary();
		}
		if( end == 0 )
			System.out.println("Queue is empty");
		else {
			avgSalary = avgSalary / end;
			System.out.print("Details of Employee with maximum salary :-  ");
			System.out.println(e[maxpos].toString());
			System.out.print("Details of Employee with minimum salary :-  ");
			System.out.println(e[minpos].toString());
			System.out.println("Average salary is :-  " + avgSalary);
		}
		
	}
	
	public static void main(String args[])	{		
		//main
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of Employees to be inserted :   ");
		int n = sc.nextInt();
		
		TestEmployee ob = new TestEmployee(n);
		
		while(true) {
			
			System.out.print("Provided options:-\n1) Insert Manager\t2) Insert Technical Staff\t3) Insert Labour\t4) Delete\t5) Calculate\t6) Exit\nEnter Choice:- ");
			int ch = sc.nextInt();
			
			switch(ch) {
				
				case 1 :ob.insert_Manager();
						break;
				case 2 :ob.insert_TechnicalStaff();
						break;
				case 3 :ob.insert_Labour();
						break;
				case 4 :System.out.println("Enter the position of element you want to delete :-  ");
						int position = sc.nextInt();
						ob.delete(position);
						break;
				case 5 :ob.calculate();
						break;
				case 6 :System.exit(0);
				
				default:System.out.println("Wrong choice:-");
						break;
			}
		}
	}
}