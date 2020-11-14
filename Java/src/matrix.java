import java.util.*;
import java.io.*;
class matrix
{	
	matrix(String f1,int n[][],int rows,int columns) throws FileNotFoundException
	{
		Scanner s = new Scanner(new File(f1));
		
		for (int i=0; i<rows; i++)
		{
			for (int j=0; j<columns; j++)
			{
				if(s.hasNextLine())
					n[i][j] = s.nextInt();
			}
		}
	}
	void add_sub(int a[][],int b[][],int add[][],int rows,int columns,int n)
	{
		for (int i = 0; i < rows; i++)
		{
			for (int j = 0; j < columns; j++)
			{
				add[i][j]=(int) (a[i][j]+(Math.pow(-1, n)*b[i][j]));
			}
		}
	}
	void mult(int a[][],int b[][],int mul[][],int rows,int columns,int n)
	{
		for (int i = 0; i < rows; i++)
		{
			for (int j = 0; j < n; j++)
			{
				mul[i][j] = 0;
				for(int k = 0; k < columns; k++)
				{
					mul[i][j]=mul[i][j]+(a[i][k]*b[k][j]);
				}
			}
		}
	}
	void display(int m[][],int row,int col,String s) throws IOException
	{
		FileWriter f = new FileWriter(s);
		for (int i=0; i<row; i++)
		{
			for (int j=0; j<col; j++)
			{
				System.out.print(m[i][j]+ "\t");
				f.write(m[i][j] + " ");
			}
			System.out.println();
			f.write("\n");
		}
		f.close();
	}
	public static void main(String args[])throws IOException
	{
		int r1,r2,c1,c2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rows and columns of First matrix:- ");
		r1=sc.nextInt();
		c1=sc.nextInt();
		
		System.out.println("Enter rows and columns of Second matrix:- ");
		r2=sc.nextInt();
		c2=sc.nextInt();
		
		int a[][]= new int[r1][c1];
		int b[][]= new int[r2][c2];
		int add[][], mul[][];
		//creating matrices
		matrix ob1 = new matrix("snc.txt",a,r1,c1);
		matrix ob2 = new matrix("dk.txt",b,r2,c2);
		while(true)
		{
			System.out.print("Provided options:-\n1) Subtraction\t2) Addition\t3) Multipliction\t4) Exit\nEnter Choice:- ");
			int ch = sc.nextInt();
			switch(ch)
			{
				case 1 :if( r1 == r2 && c1 == c2 )					//subtraction
						{
							add = new int[r1][c1];
							ob1.add_sub(a,b,add,r1,c1,ch);
							ob1.display(add, r1, c1, "result1.txt");
						}
						else
							System.out.println("Operation not possible");
						break;
				case 2 :if( r1 == r2 && c1 == c2 )					//addition
						{
							add = new int[r1][c1];
							ob1.add_sub(a,b,add,r1,c1,ch);
							ob1.display(add, r1, c1, "result1.txt");
						}
						else
							System.out.println("Operation not possible");
						break;
				case 3 :if( r2 == c1 )								//multiplication
						{
							mul = new int[r1][c2];
							ob1.mult(a,b,mul,r1,c1,c2);
							ob1.display(mul, r1, c2, "result2.txt");
						}
						else
							System.out.println("Operation not possible");
						break;
				case 4 :System.exit(0);
				default:System.out.println("Wrong choice:-");
						break;
			}
		}
	}
}