import java.util.*;
public class PathThroughGraph {
	
	
	public static int highestFactor(int num) {
		int i;
		for(i = num/2; i >= 1; i-- ) {
			if( num % i == 0 )
				break;
		}
		return i;
	}
	
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		if( ( 0 < M && M < (int)Math.pow(10,9) ) && ( 0 < N && N < (int)Math.pow(10,9) ) ) {
			
			int factorm[] = new int[10000];
			int factorn[] = new int[10000];
			int c = 0, i = 1, j = 1;
			boolean flag = false;
			
			factorm[0] = M;
			factorn[0] = N;
			
			while( M > 1 ) {
				factorm[i++] = highestFactor(M);
				M = highestFactor(M);
			}
			
			while( N > 1 ) {
				factorn[j++] = highestFactor(N);
				N = highestFactor(N);
			}
			
			int a = i, b = j;
			
			for(i = 0; i < a; i++ ) {
				
				for( j = 0; j < b; j++ ) {
					
					if( factorm[i] == factorn[j] ) {
						flag = true;
						break;
					}
						
				}
				if ( flag )
					break;
			}
			c = i + j;
			System.out.println(c);
		}
	}
}
