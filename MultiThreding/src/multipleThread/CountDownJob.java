package multipleThread;

public class CountDownJob implements Runnable {

	private Thread t;
	private String name;
	private int num;
	
	public CountDownJob(String name, int num) {
		super();
		this.name = name;
		this.num = num;
		this.t=new Thread(this);
		
	}

	@Override
	public void run() {
		while(num>0) {
			System.out.println(name +"thread prints :"+num);
			num--;
		}
		
	}
	public Thread getT() {
		return t;
		
	}

}
