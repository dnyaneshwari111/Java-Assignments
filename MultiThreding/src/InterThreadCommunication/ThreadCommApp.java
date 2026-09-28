package InterThreadCommunication;

public class ThreadCommApp {
	public static void main(String[]args) {
		
		stock s= new stock();
		
		Producer p= new Producer(s);
		Consumer c=new Consumer(s);
		
		p.getT().start();
		c.getT().start();
		
		try {
			Thread.sleep(200);   
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		p.setBrun(false);
		c.setbRun(false);
		
		try {
			c.getT().join();
			p.getT().join();
			
			}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Alive : "+p.getT().isAlive());
		System.out.println("Alive : "+c.getT().isAlive());
		
		
		System.out.println("Qty Produced : "+s.getqtyProduced());
		System.out.println("Qty Consumed : "+s.getqtyConsumed());
	}

}
