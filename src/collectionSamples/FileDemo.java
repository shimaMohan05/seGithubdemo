package collectionSamples;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		File f=new File(System.getProperty("user.dir")+"\\Myfile.txt");
		f.createNewFile();//to create a file
		FileWriter wr=new FileWriter("Myfile.txt");
		wr.write("hello everyone");
		System.out.println("written");
		
	}

}
