import java.util.*;
class monk
{
	public static void sort(int a[],int x)
	{
		int i,j,temp=0;
		for(i=0;i<x-1;i++)
		{
			for(j=0;i<x-i-1;i++)
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter the no. of test cases:- ");
    	int t=sc.nextInt();
    	System.out.print("Enter number of cakes and number of friends:- ");
    	int n=sc.nextInt();
    	int m=sc.nextInt();
    	int c[] = new int[n];
    	int w[] = new int[n];
    	int l[] = new int[m];
    	int i;
    	for( i=0; i<m; i++ )
    	{
    		l[i]=sc.nextInt();
    	}
    	for( i=0; i<n; i++ )
    	{
    		w[i]=sc.nextInt();
    	}
    	for( i=0; i<n; i++ )
    	{
    		c[i]=sc.nextInt();
    	}
    }
}