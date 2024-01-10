package practice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		File f=new File(System.getProperty("user.dir")+"//new.txt");
		System.out.println("New file created");
		FileWriter wr=new FileWriter(f);
		wr.write("New File created");
		wr.write("\n next line also write");
		wr.close();
		Scanner sc=new Scanner(f);
		while (sc.hasNextLine())
		System.out.println(sc.nextLine());	
		f.delete();
		
	}

}
