import java.util.*;
import java.math.*;
public class DigitPairs {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if( n <= 500 ) {
			
			int countPairs = 0, i, num, max, min, j;
			int array[] = new int[n];
			int digits[] = new int[9];
			
			for( i = 0; i < n; i++ ) {
				
				num = sc.nextInt();
				max = Math.max(array[i] % 10, Math.max((array[i] / 10) % 10, array[i] / 100));
				min = Math.min(array[i] % 10, Math.min((array[i] / 10) % 10, array[i] / 100));
				
				array[i] = (( 11 * max ) + ( 7 * min )) % 100;
				
			}
			
			//make pairs
			for( i = 0; i < n; i++ ) {
				
				for( j = 0; j < n; j++ ) {
					
					if( array[i] / 10 == array[j] / 10 && i == j && digits[array[i] / 10] <= 2 )
						digits[array[i] / 10]++;
					
				}
			}
			
			for( i = 0; i < n; i++ ) {
				
				countPairs += digits[i];
			}
			
			System.out.print(countPairs);
			
		}
		
	}
}
