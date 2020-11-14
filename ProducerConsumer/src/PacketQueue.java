public class PacketQueue {
	//packet wueue class
	
	int n, circularQueue[], rear, front, size;
	PacketQueue(int n) {
		this.n = n;
		size = this.n;
		rear = -1;
		front = -1;
		circularQueue = new int[n];
	}
	public void produce(int packet)throws Exception {								//produce method
	
		if( size == 0 )							//overflow check
			System.out.println("Stock is full. Cannot Produce more Packets.............");
		else {
			if( front == -1 ) {
				front = 0;
				circularQueue[++rear] = packet;
				size--;
				System.out.println("Packet is Produced......");
			}
			else {
				rear = ( rear + 1 ) % n;
				circularQueue[rear] = packet;
				size--;
				System.out.println("Packet is Produced......");
			}
		}
	}
	public void consume()throws Exception {							//consume method
		if( size == n )							//underflow check
			System.out.println("No Packets to Consume.............");
		else {
			front = ( front + 1 ) % n;
			System.out.println("Packet is Consumed.........");
			size++;	
		}
	}
}