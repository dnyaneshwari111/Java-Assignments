
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;

import java.io.FileWriter;

import java.io.IOException;

import java.io.InputStreamReader;



public class SourceToDestination extends Thread {
	String source,destination;
	
	SourceToDestination(String source,String destination){
		this.source=source;
		this.destination=destination;
	}
	
	public void run() {
		

        try {

           FileInputStream fis=new FileInputStream(source);
           FileOutputStream fos=new FileOutputStream(destination);
           
           int ch;
           
           while ((ch = fis.read()) != -1) {

               fos.write(ch);

           }


           fis.close();

           fos.close();

         
           System.out.println("File copied successfully!");

       } catch (IOException e) {

           System.out.println(e);

       }
           


           
    }

}

