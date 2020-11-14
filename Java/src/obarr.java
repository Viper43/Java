import java.io.*;
class Stud
{
	int roll,marks;
	String name;
	Stud(int roll,String name,int marks)
	{
		this.roll=roll;
		this.name=name;
		this.marks=marks;
	}
	@Override
	public String toString()
	{
		return ("Roll no.:-" + roll + " Name:-" + name + " Marks:-"+ marks);
	}
}
class obarr
{
	public static void main(String args[])throws IOException
	{
		int i;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("Enter the no. of students :-");
		int n=Integer.parseInt(br.readLine());
		Stud ob[] = new Stud[n];
		for(i=0;i<n;i++)
		{
			System.out.println("Enter roll:-");
			int roll=Integer.parseInt(br.readLine());
			System.out.println("Enter name:-");
			String name=br.readLine();
			System.out.println("Enter marks:-");
			int marks=Integer.parseInt(br.readLine());
			ob[i]= new Stud(roll,name,marks);
		}
		for(i=0;i<n;i++)
		{
			String s=ob[i].toString();
			System.out.println(s);
		}
	}
}