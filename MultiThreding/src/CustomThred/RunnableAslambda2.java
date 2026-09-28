package CustomThred;

public class RunnableAslambda2 {
	public static void main(String[]args){
		
	System.out.println("Prime number from 1 too 100");
		Thread t=new Thread(()->{
			for(int i=2;i<100;i++) {
				if(isPrime(i))
					System.out.println(i);
			}System.out.println();
		});
		t.start();
	}
			
		private static boolean isPrime(int n)
		{
				if(n<=1) 
					return false;
					
					for(int i=2;i<Math.sqrt(n);i++)
					{
						if(n%i==0)
							return false;
					}
					return true;
				
		
	}
}
				
	


