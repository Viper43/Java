import java.io.*;

class testqueue {
	
	public static void main(String args[])throws IOException {
		
		int i,ch;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.print("Enter the no. of students to maintain records:-");
		int n=Integer.parseInt(br.readLine());
		
		StudentQueue ob = new StudentQueue(n);
		
		while(true) {
			System.out.print("Provided options:-\n1) Insert\t2) Delete\t3) Traverse\t4) Exit\nEnter Choice:- ");
			ch = Integer.parseInt(br.readLine());
			
			switch(ch) {
				case 1 :if( n > 0 ) {
							System.out.println("Enter roll:-");
							int roll = Integer.parseInt(br.readLine());
							
							System.out.println("Enter name:-");
							String name = br.readLine();
							
							System.out.println("Enter marks:-");
							int marks = Integer.parseInt(br.readLine());
							
							ob.insert(roll,name,marks);
							n--;
						}
						else
							System.out.println("maximum size reached");
						break;
				case 2 :ob.delete();
						break;
				case 3 :ob.traverse();
						break;
				case 4 :System.exit(0);
				
				default:System.out.println("Wrong choice:-");
						break;
			}
		}
	}
}