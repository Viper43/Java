import java.util.*;
public class searching 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i;
		
		System.out.println("Enter size of array :-  ");
		int n=sc.nextInt();
		
		//declaration of array
		int array[] = new int[n];
		
		System.out.println("Enter elements in array :-  ");
		
		for(i = 0; i < n; i++)
		{
			array[i]=sc.nextInt();
		}
		
		
		//sorting of array in ascending order
		int avg=0,evencount=0;
		for(i=0;i<n;i++)
		{
			if(array[i]%2==0)
			{
				avg = avg + array[i];
				evencount++;
			}
		}
		//display
		avg = avg / evencount;
			System.out.print(avg);
	}
}