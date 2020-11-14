import java.util.*; 
public class EvenOdd { 
	
	public static int count = 0;
	
	public static void convert_To_Len_th_base(int n, int arr[], int len, int L) { 
		int sum = 0;
		for (int i = 0; i < L; i++)	{ 
			sum += arr[n % len];
			n /= len;
			
		}
		if( sum % 2 == 0 )
			count++;
	} 
	public static void print(int arr[], int len, int L) {
		
		for (int i = 0; i < (int)Math.pow(len, L); i++)	{ 
				convert_To_Len_th_base(i, arr, len, L);
		} 
	}  
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int low = sc.nextInt();
		int high = sc.nextInt();
		int k = sc.nextInt();
		
		if( ( 0 <= low && low <= high && high <= (int)Math.pow(10, 9) ) && ( k <= (int)Math.pow(10, 6) ) ) {
			int arr[] = new int[high - low + 1];
			int i = 0;
			while( low <= high ) {
				arr[i++] = low++;
			}
			
			int len = arr.length;
			
			// function call 
			print(arr, len, k);
			System.out.print(count);
		}
	} 
} 