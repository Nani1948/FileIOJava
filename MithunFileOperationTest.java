package StreamClasses;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MithunFileOperationTest {
	 public static void writeTheDataFromTextUsingOutputStream() throws IOException {
	    	FileOutputStream fos1=new FileOutputStream("C:/Users/knand/eclipse-workspace/Basic/resources/sample.txt");
	    	String text="Hello World";
	    	fos1.write(text.getBytes());
	    	fos1.write(70);
	    	fos1.close();
			
		}
	 public static void readTheDataFromTextUsingInputStream() throws IOException {
	    	FileInputStream fos2=new FileInputStream("C:/Users/knand/eclipse-workspace/Basic/resources/sample.txt");
	    	int i=fos2.read();
	    	while(i!=-1) {
	    	System.out.println((char)i);
	    	}
	    	fos2.close();
			
		}
		public static void main(String []args) throws IOException {
			writeTheDataFromTextUsingOutputStream();
			readTheDataFromTextUsingInputStream();
		}
}
