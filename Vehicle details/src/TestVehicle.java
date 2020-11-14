import java.util.*;
public class TestVehicle {
	
	int end=0, n;
	public Vehicle v[];
	Scanner sc = new Scanner(System.in);
	
	TestVehicle(int n) {
		//Constructor
		
		this.n=n;
		v = new Vehicle[n];
	}
	
	void insertbus() {	
		//Inserts buses into array
		
		if( end == n )
			System.out.println("Insertion not possible as Array is full.........");
		
		else {
			System.out.println("Enter Fuel:-");
			int fuel=sc.nextInt();
			System.out.println("Enter Speed:-");
			int speed=sc.nextInt();
			
			v[end]= new Bus(fuel,speed);
			v[end].upCount();
				
			end++;
		}
	}
	
	void insertcar() {
		//Inserts cars into array
		
		if( end == n )
			System.out.println("Insertion not possible as Array is full.........");
		
		else {
			System.out.println("Enter Fuel:-");
			int fuel=sc.nextInt();
			System.out.println("Enter Speed:-");
			int speed=sc.nextInt();
			
			v[end] = new Car(fuel,speed);
			v[end].upCount();
			
			end++;
		}
	}
	
	void inserttruck()	{
		//Inserts trucks into array
		
		if( end == n )
			System.out.println("Insertion not possible as Array is full.........");
		
		else {
			System.out.println("Enter Fuel:-");
			int fuel = sc.nextInt();
			System.out.println("Enter Speed:-");
			int speed = sc.nextInt();
			
			v[end] = new Truck(fuel,speed);
			v[end].upCount();
			
			end++;
		}
	}
	
	void delete(int position) {
		//Deletes vehicles from array
		
		int i;
		--position;
			
		if( end == 0 )
			System.out.println("Deletion not possible as Queue is empty");
		
		else {
			for( i = position; i < end-1; i++ ) {
				
				v[i].downCount();
				v[i]=v[i+1];
			}
			end--;
			System.out.println("Successful");
		}
	}
	
	void calculate() {
		//Calculates the total Fuel
		
		if( Bus.busCount > 0 ) {
			double busAvgSpeed = Bus.totalSpeed/Bus.busCount;
			System.out.println("Total Fuel Amount of Bus is :-  " +Bus.totalFuel  + "and Average Speed is :-  " + busAvgSpeed );		
		}
		
		if( Car.carCount > 0 ) {
			double carAvgSpeed = Car.totalSpeed/Car.carCount;
			System.out.println("Total Fuel Amount of Car is :-  " + Car.totalFuel + "and Average Speed is :-  " + carAvgSpeed );		
		}
		
		if( Truck.truckCount > 0 ) {
			double truckAvgSpeed = Truck.totalSpeed/Truck.truckCount;
			System.out.println("Total Fuel Amount of Truck is :-  " + Truck.totalFuel + "and Average Speed is :-  " + truckAvgSpeed );		
		}
	}
	
	public static void main(String args[])	{		
		//main
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of vehicles to be inserted :   ");
		int n=sc.nextInt();
		
		TestVehicle ob = new TestVehicle(n);
		
		while(true) {
			
			System.out.print("Provided options:-\n1) Insert Bus\t2) Insert Car\t3) Insert Truck\t4) Delete\t5) Calculate\t6) Exit\nEnter Choice:- ");
			int ch=sc.nextInt();
			
			switch(ch) {
				
				case 1 :ob.insertbus();
						break;
				case 2 :ob.insertcar();
						break;
				case 3 :ob.inserttruck();
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