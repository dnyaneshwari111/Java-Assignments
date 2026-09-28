package CustomThred;

public class CustomThreds extends Thread {

	public  void run()
	{
		for(int i=1;i<=5;i++) {
			System.out.println("Child thred "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
	
	CustomThreds ct=new CustomThreds();
	ct.run();

}
}

