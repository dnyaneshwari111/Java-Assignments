package InterThreadCommunication;

public class stock {

	private int qtyProduced;
	private int qtyConsumed;
	private volatile boolean bProduced;
	
	public stock() {
		
	}
	
	public synchronized void Produce(){
		if(bProduced) {
			try {
				this.wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		qtyProduced++;
		System.out.println("Produced : "+qtyProduced);
		bProduced=true;
		notify();
		}
	
	public synchronized void Consumer() {
		if(!bProduced) {
			try {
				this.wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		qtyConsumed++;
		System.out.println("Consumed : "+qtyConsumed);
		bProduced=false;
		notify();
		}
	
	public int getqtyProduced() {
		return qtyProduced;
	}
	
	public int getqtyConsumed(){
		return qtyConsumed;
	}
}
