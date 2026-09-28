package InterThreadCommunication;

public class Producer implements Runnable{

	private Thread t;
	private stock s;
	private Boolean brun;
	
	
	public  Producer(stock s) {
		this.t=new Thread(this);
		this.s=s;
		this.brun=true;
		
	}
	
	@Override
	public void run() {
		while(brun) {
			s.Produce();
		}
		
	}

	public Thread getT() {
		return t;
	}

	public void setBrun(Boolean brun) {
		this.brun = brun;
	}

		
	

}
