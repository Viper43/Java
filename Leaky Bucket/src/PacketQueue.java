public class PacketQueue {
	//packet queue class
	
	int n, circularQueue[], rear, front, size, fiftypercent;
	
	//constructor
	PacketQueue(int n) throws Exception {
		this.n = n;
		size = this.n;
		rear = -1;
		front = -1;
		circularQueue = new int[n];
		fiftypercent = (int) Math.ceil(n/2);
		for( int i = 0; i < fiftypercent; i++ ) {
			produce( ( int )( Math.random() * 10 ) );
		}
	}
	
	//produce method
	synchronized public void produce(int packet)throws Exception {
	
		if( size == 0 )						//overflow check
			System.out.println("Stock is full. Cannot Produce more Packets.............");
		else {
			if( front == -1 ) {
				front = 0;
				circularQueue[++rear] = packet;
				size--;
				System.out.println("Packet is Produced......");
				this.notify();
			}
			else {
				rear = ( rear + 1 ) % n;
				circularQueue[rear] = packet;
				size--;
				System.out.println("Packet is Produced......");
				this.notify();
			}
		}
	}
	
	//consume method
	synchronized public void consume()throws Exception {
		if( size == n ) {					//underflow check
			System.out.println("No Packets to Consume.............");
			this.wait();
			for( int i = 0; i < fiftypercent; i++ ) {
				produce( ( int )( Math.random() * 10 ) );
			}
		}
		else {
			front = ( front + 1 ) % n;
			System.out.println("Packet is Consumed.........");
			size++;	
		}
	}
}