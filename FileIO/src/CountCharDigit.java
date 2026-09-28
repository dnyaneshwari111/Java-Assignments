

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class CountCharDigit {

	public static void main(String[] args) {

			BufferedReader br = null;
			int charcount=0;
			int digitcount=0;
			try {
				br = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter 'q' to quit");
				int i;
				while((i = br.read()) != 'q')
				{
					char ch=(char)i;
//					if(ch !='\n'&& ch !='\r') {
//						//charcount++;
						if(Character.isAlphabetic(i))
							charcount++;
						else if(Character.isDigit(i)) {
							digitcount++;
						}
						System.out.println("You entered :"+ch);
					}
					System.out.println(" Total character :"+charcount);
					System.out.println(" Total digit :"+digitcount);
				}
				
			catch(IOException e) {
				e.printStackTrace();
			}
			finally {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		

		}

	}


