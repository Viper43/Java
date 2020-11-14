import java.util.*;
public class LeakyBucketTest {
	//main class
	
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of Queue :-  ");
		int n = sc.nextInt();
		PacketQueue pq = new PacketQueue(n);
		NetworkThread nt = new NetworkThread(pq);
		ApplicationThread a = new ApplicationThread(pq);
		nt.start();
		a.start();
	}
}