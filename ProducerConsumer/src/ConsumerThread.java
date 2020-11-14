public class ConsumerThread extends Thread {
	//consumer thread class
	
	PacketQueue pq = null;
	ConsumerThread(PacketQueue pq) {
		this.pq = pq;
	}
	@Override
	public void run() {
		while(true) {
			
			try {
				pq.consume();
				Thread.sleep((long)(Math.random()*1000));
			}
			catch(final Exception e) {
				e.printStackTrace();
			}
		}
	}
}