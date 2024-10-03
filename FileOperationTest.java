package StreamClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperationTest {
	public static void readTextFromFileUsingInputStream() throws IOException {
		File fil=new File("C:/Users/knand/eclipse-workspace/com.restarssuredtraining.qa/src/test/resources/studentsbody.json");
		FileInputStream fis=new FileInputStream(fil);
		int ch=0;
		while((ch=fis.read())!=-1){
			System.out.print((char)ch);
			
		}
		System.out.println();
		fis.close();
	}
	public static void readTextFromFileUsingReader() throws IOException {
		File myfil=new File("C:/Users/knand/eclipse-workspace/com.restarssuredtraining.qa/src/test/resources/studentsbody.json");
		FileReader fr=new FileReader(myfil);
		int ch=0;
		while((ch=fr.read())!=-1){
			System.out.print((char)ch);
			
		}
		System.out.println();
		fr.close();
	}
   
	public static void writeTextToFileUsingOutputStream() throws IOException {
		FileOutputStream fos=new FileOutputStream("C:/Users/knand/eclipse-workspace/com.restarssuredtraining.qa/src/test/resources/config.properties");
		String text="Hello";
		char[]data=text.toCharArray();
		for(char ch:data) {
			fos.write(ch);
		}
		fos.close();
	}
	public static void writeTextToFileUsingFileWriterStream() throws IOException {
		File myfil1=new File("C:/Users/knand/eclipse-workspace/com.restarssuredtraining.qa/src/test/resources/config2.properties");
		FileWriter fw=new FileWriter(myfil1);
		fw.write("Hello World!");
		fw.close();
		
	}
	
	public static void main(String []args) throws IOException {
		//readTextFromFileUsingInputStream();
		//readTextFromFileUsingReader();
		//writeTextToFileUsingOutputStream();
		//writeTextToFileUsingFileWriterStream();
		
	}
	
}

