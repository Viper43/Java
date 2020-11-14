public class ApplicationThread extends Thread {
	//application thread class
	
	PacketQueue pq = null;
	ApplicationThread(PacketQueue pq) {
		this.pq = pq;
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				pq.consume();
				Thread.sleep(5000);
			}
			catch(final Exception e) {
				e.printStackTrace();
			}
		}
	}
}