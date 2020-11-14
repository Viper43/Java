import java.util.*;
public class TestShape {
	//main class
	
	int end = 0, n;
	public Shape s[];
	Scanner sc = new Scanner(System.in);
	
	TestShape(int n) {
		//Constructor
		
		this.n = n;
		s = new Shape[n];
	}
	
	void insert_Cube() {	
		//Inserts Manager into array
		
		if( end == n )
			System.out.println("Insertion not possible as Array is full.........");
		
		else {
			System.out.println("Enter side of Cube :-");
			double side = sc.nextDouble();
				
			s[end]= new Cube(side);
				
			end++;
		}
	}
	
	void insert_RectangularPrism() {
		//Inserts TechnicalStaff into array
		
		if( end == n )
			System.out.println("Insertion not possible as Array is full.........");
		
		else {
			System.out.println("Enter length of Rectangular Prism :-");
			double length = sc.nextDouble();
			System.out.println("Enter breadth of Rectangular Prism :-");
			double breadth = sc.nextDouble();
			System.out.println("Enter height of Rectangular Prism :-");
			double height = sc.nextDouble();
			
			s[end]= new RectangularPrism(length, breadth, height);
				
			end++;		
		}
	}
	
	void insert_Sphere() {
		//Inserts Labour into array
		
		if( end == n )
			System.out.println("Insertion not possible as Array is full.........");
		
		else {
			System.out.println("Enter radius of Sphere :-");
			double radius = sc.nextDouble();
				
			s[end]= new Sphere(radius);
				
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
			for( i=position; i<end-1; i++ ) {
				s[i]=s[i+1];
			}
			end--;
			System.out.println("Successful");
		}
	}
	
	void calculate() {
		//Calculates the avarage Volume
		int i;
		double avgVolume = 0.0;
		
		for( i = 0; i < end; i++ ) {
			
			avgVolume += s[i].showVolume();
			System.out.println(s[i].toString());
		}
		if( end == 0 )
			System.out.println("Queue is empty");
		else
			System.out.println("Average Volume is :-  " + avgVolume/end);
	}
	
	public static void main(String args[])	{		
		//main
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of Shapes to be inserted :   ");
		int n = sc.nextInt();
		
		TestShape ob = new TestShape(n);
		
		while(true) {
			
			System.out.print("Provided options:-\n1) Insert Cube\t2) Insert Rectangular Prism\t3) Insert Sphere\t4) Delete\t5) Calculate\t6) Exit\nEnter Choice:- ");
			int ch = sc.nextInt();
			
			switch(ch) {
				
				case 1 :ob.insert_Cube();;
						break;
				case 2 :ob.insert_RectangularPrism();;
						break;
				case 3 :ob.insert_Sphere();;
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
