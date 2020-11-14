import java.io.*;
public class StudentQueue {
	
	int front = -1, end = 0, n;
	public Student obj[];
	StudentQueue(int n) {
		this.n = n;
		obj = new Student[n];
	}
	
	void insert(int roll, String name, int marks) {
		if( front == -1 ) {
			obj[end] = new Student(roll, name, marks);
			front++;
			end++;
		}
		else {
			if( end < n )
				obj[end]=new Student(roll,name,marks);
			end++;
		}
	}
	
	void delete() {
		if( front == end )
			System.out.println("Deletion not possible as Queue is empty");
		else
			front++;
	}
	
	void traverse() {
		int i;
		if( front > end )
			System.out.println("Queue is empty");
		else {
			for(i=front;i<end;i++) {
				System.out.println(obj[i].toString());
			}
		}
	}
}