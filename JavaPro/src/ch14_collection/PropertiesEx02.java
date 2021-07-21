package ch14_collection;
import java.io.*;
import java.util.*;
public class PropertiesEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		
		prop.setProperty("timeout", "30");
		prop.setProperty("language", "ÇÑ±Û");
		prop.setProperty("size", "10");
		prop.setProperty("capacity", "10");
		
		try {
			prop.store(new FileOutputStream("src/ch14_collection/prop_output.txt"), "Properties Example");
			prop.storeToXML(new FileOutputStream("src/ch14_collection/prop_output.xml"), "Properties Example");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
