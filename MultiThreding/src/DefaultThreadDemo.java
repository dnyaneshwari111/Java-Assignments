
public class DefaultThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t=Thread.currentThread();
		System.out.println("Name : "+t.getName());
		System.out.println("Priority : "+t.getPriority());
		
		//t.setName("app thred");
		

	}

}
