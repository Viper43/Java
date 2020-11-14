import java.util.*;
public class ProducerConsumerTest {
	//main class
	
	public static void main(String args[])throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of Queue :-  ");
		int n = sc.nextInt();
		PacketQueue pq = new PacketQueue(n);
		ProducerThread p = new ProducerThread(pq);
		ConsumerThread c = new ConsumerThread(pq);
		p.start();
		c.start();
	}
}