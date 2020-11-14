import java.util.*;
public class Swayamvar {
	
	public static char bride[], groom[];
	public static int bfront = 0, gfront = 0, b;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no. of brides and grooms:-  ");
		int i;
		int n = sc.nextInt();
		
		int countCouples = 0;
		
		if (n >= 1 && n <= 10000 ) {
			
			String g = "",b = "";
			b=sc.next();
			g=sc.next();
			
			
			bride = new char[n];
			groom = new char[n];
			
			//inserting grooms
			
			for(i = 0; i < n; i++) {
				bride[i] = b.charAt(i);
			}
			//inserting grooms
			for(i = 0; i < n; i++) {
				groom[i] = g.charAt(i);
			}
			
			//selecting the grooms
			
			int val = n - gfront;
			
			while(bfront < n ) {
				
				
				
				if( bride[bfront] == groom[gfront] ) {
					
					bfront++;
					gfront++;
					countCouples++;
					val = n - gfront;
					
				}
				else {
					if( val > 0 ) {
						int j = gfront + 1;
						char c = groom[gfront];
						while(j < n) {
							
							groom[j-1] = groom[j];
							
							j++;
						}
						val--;
						groom[n-1] = c;
					}
					else
						break;
					
					
				}
			}
			System.out.println(n-countCouples);
			
		}
		else
			System.exit(0);
	}

}
