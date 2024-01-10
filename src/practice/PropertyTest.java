package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyTest {

	public static void main(String[] args) throws IOException {
		File f =new File("./"+"/\\newFiletest.properties");
		FileInputStream fi=new FileInputStream(f);
		Properties p=new Properties();
		p.load(fi);
		String bname = p.getProperty("bname");
		String version=p.getProperty("version");
		System.out.println(bname +" : "+version );
		
		
	}

}