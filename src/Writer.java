import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;

public class Writer {
	public void write(String tag, String value) {
		File file = new File("C:\\Users\\adefe\\OneDrive - Georgia Gwinnett College\\Document\\School\\Ggc\\Fall_2019\\ITEC_3860_Software_Development\\Git\\TeamAvengers-Fall2018\\src\\data\\textfile\\test4");
		if(file.exists()) {
			System.out.print("FIle already exists");
			System.exit(1);
		}
		
		PrintWriter printWriter = null;
		try {
			printWriter = new PrintWriter(file);
			
				printWriter.print(tag+": " + value);
			
		}
		catch(IOException ioe) {
			System.out.println("There is an error. We are working to fix it.");
		   System.out.println(ioe);
		}
		finally {
			printWriter.close();
			//System.out.println("Write(): Execution complete");
		}
		
	}
	

}
