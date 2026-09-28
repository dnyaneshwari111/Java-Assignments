package FilesDisplay;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DisplayFilesapp implements Runnable {

	private Thread t;
	private String path;
	
	
	public DisplayFilesapp(String path) {
		super();
		this.path = path;
		this.t=new Thread(this);
	}


	@Override
	public synchronized void run() {
		File file=new File(path);
	
		System.out.println("File path"+file.getAbsolutePath());
		System.out.println("size"+file.length());
		System.out.println("Readable "+file.canRead());
		FileReader fr=null;
		try {
			if(file.canRead()) {
				fr=new FileReader(file);
				
				int i;
				while( (i=fr.read())!=-1)
						System.out.println((char)i);
					System.out.println("************");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}
	public Thread getT() {
		return t;
	}
	
}
