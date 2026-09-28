package FILEIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factors {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=null;
		try {
			
			br=new BufferedReader(new InputStreamReader(System.in));
			while(true)
			{
				System.out.println("Enter the number. Enter '00' to stop");
				String input =br.readLine();
				
				if(input.equals("00")) {
					System.out.println("Program terminated.");
					break;
				}
				
				int num=Integer.parseInt(input);
				System.out.println("FactorS of"+num +"are :");
				
				for(int i=1;i<=num;i++) {
					if(num%i==0) {
						System.out.print(i+",");
					}
					
				}
					System.out.println();
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}catch (NumberFormatException e) {
			System.out.println("Please enter a valid integer");
		}
		finally 
		{
			try 
			{
				if(br!=null) 
				{
					br.close();
				}
			}
			catch(IOException e) 
			{
				e.printStackTrace();
			}
		}
			
		

	}

}
