import java.util.*;
import java.math.*;
public class permutation
{
	static void display(int a[],int s)
	{
		for(int j=0;j<s;j++)
			System.out.print(a[j]);
	}
	public static int fact(int n)
	{
		if( n == 0 )
			return 1;
		else
			return (n*fact(n-1));
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements:-");
		int n=sc.nextInt();
		int ar[] = new int[n];
		int p=fact(n)/fact(1);
		int temp=0;
		int k=0,c=0,j;
		while( p > 0 )
		{
			for(int i=1;i<=n;i++)
			{
				int num=(int)(Math.random()*(n))+1;
				
				if( k == 0 )
				{
					ar[k++]=num;
				}
				else
				{
					for(j=0;j<k;j++)
					{
						if(num == ar[j])
						{
							c=1;
							break;
						}
					}
					if(c==1)
						i--;
					else
						ar[k++]=num;
				}
				System.out.println("hola");
				
			}
			display(ar,n);
			k=0;
			System.out.println();
			p--;
		}
	}

}
