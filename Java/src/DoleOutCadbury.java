import java.util.Scanner;
public class DoleOutCadbury {
	public static int breakAndCount(int l, int b) {
		
		if( l == b )
			return 1;
		else {
			
			int max = Math.max(l, b);
			int min = Math.min(l, b);
			l = min;
			b = max - min;
			return ( 1 + breakAndCount(l, b));
		}
	}
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int p = sc.nextInt();
		int q = sc.nextInt();
		int r = sc.nextInt();
		int s = sc.nextInt();
		
		int i, j, count = 0,k = 0;
		
		
		if( ( 0 < p && p < q && q < 1501 ) && ( 0 < r && r < s && s < 1501 ) ) {
			
			int columns = ( q - p + 1) * ( s - r + 1 );
			int array[][] = new int[2][columns];
			
			for( i = p; i <= q; i++ ) {
				
				for( j = r; j <= s; j++ ) {
					
					array[0][k] = i;
					array[1][k] = j;
					
					count += breakAndCount(array[0][k], array[1][k]);
					
					k++;
				}
			}			
			System.out.println(count);
		}
	}
}