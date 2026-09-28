import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[]args) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter source name: ");

        String source = br.readLine();
		
        System.out.print("Enter destination file name : ");

        String destination = br.readLine();
        
        SourceToDestination t= new SourceToDestination(source,destination);
        
        t.start();
        t.join();
	}
}
