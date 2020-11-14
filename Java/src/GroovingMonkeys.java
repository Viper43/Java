import java.util.*;
public class GroovingMonkeys {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = "", word = "";
		
		int s=97;
		int time = 0;
		int testCase = sc.nextInt();
		int noOfMonkeys = sc.nextInt();
		
		if ( testCase >= 1 && testCase <= 10 && noOfMonkeys >= 1 && noOfMonkeys <= 10000 ) {
			
			int monkey[] = {'a','b','c','d','e','f'};
			str = "abcdef";
			int i;
			
			char namMonkey[] = new char[noOfMonkeys];
			char changePos[] = new char[noOfMonkeys];
			
			for( i = 0; i < noOfMonkeys; i++ ) {
				
				monkey[i] = sc.nextInt();
			}
			
			do {
				word = " ";
				for( i = 0; i < noOfMonkeys; i++ ) {
					
					changePos[monkey[i] - 1] = namMonkey[i];
				}
				
				
				
				for( i = 0; i < noOfMonkeys; i++ ) {
					
					namMonkey[i] = changePos[i];
					
					word = word + changePos[i];
				}
				
				time++;
				word = word.trim();
				
			}while( !str.equals(word) );
			
		}
		
		System.out.print(time);
	}

}