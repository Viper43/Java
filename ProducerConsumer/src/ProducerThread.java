public class ProducerThread extends Thread {
	//producer thread class
	
	PacketQueue pq = null;
	ProducerThread(PacketQueue pq) {
		this.pq = pq;
	}
	
	@Override
	public void run() {
		while(true) {
			
			try {
				pq.produce( ( int )( Math.random() * 10 ));
				Thread.sleep( ( long )( Math.random() * 1000 ) );
			}
			catch(final Exception e) {
				e.printStackTrace();
			}
		}
	}
}
