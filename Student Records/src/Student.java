class Student {
	
	int roll, marks;
	String name;
	
	Student(int roll,String name,int marks) {
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return ("Roll no.:-" + roll + " Name:-" + name + " Marks:-"+ marks);
	}
}