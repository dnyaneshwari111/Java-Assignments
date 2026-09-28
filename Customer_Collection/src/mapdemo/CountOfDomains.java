package mapdemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

public class CountOfDomains {

	public static void main(String[] args) {
		
		String Filename="D:/JavaCodes/Customer_Collection/src/mapdemo/emails.txt";
		Map<String,Integer>map=new HashMap<>();
		
		try 
		{
			BufferedReader br=new BufferedReader(new FileReader(Filename));
			
			String email;
			
			while((email=br.readLine()) != null) {
					email=email.trim();
			
				if(email.length()==0) {
					continue;}
				
				int position=email.indexOf("@");
				
				if(position !=-1)
				{
					String domain=email.substring(position+1);
					if(map.containsKey(map))
					{
						map.put(domain, map.get(domain)+1);
					}
					else {
						map.put(domain, 1);
					}
					
				}
			
			}
			
			br.close();
			System.out.println("Ocuurance of Domain :");
			for(Map.Entry<String, Integer>entry:map.entrySet()) {
				System.out.println(entry.getKey()+"="+entry.getValue());
			}
		
		}
				catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
				
		}
		
}
