package testBase;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;



public class TestBase {
	
	static Properties p;
	
	public static void loadproperty() 
	{
		File f= new File(System.getProperty("user.dir")+"/src/main/java/configuration/config.properties");
		
		try {
			FileReader fr= new FileReader(f);
			p= new Properties();
			p.load(fr);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
		
	

	public static String config(String key)
	{
		loadproperty(); 
		String x=p.getProperty(key);
		return x;
	}
	
	public static void loadproperty1() 
	{
		File f= new File(System.getProperty("user.dir")+"/src/main/java/configuration/Or.properties");
		
	
			try {
				FileReader fr= new FileReader(f);
				p= new Properties();
				p.load(fr);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	

	}
	
	public static By getelement(String key)
	{
		loadproperty1();
		By loc=null;
		String elevalue=p.getProperty(key);
		String loctype=elevalue.split(":")[0];
		String locvalue=elevalue.split(":")[1];
		
		switch (loctype) {
		case "name":
			loc=By.name(locvalue);
			break;
			
		case "id":
			loc=By.id(locvalue);
			break;

		}
		return loc;
		
		
		
	}
}
