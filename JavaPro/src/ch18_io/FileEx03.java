package ch18_io;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

class FileEx03 {
	public static void main(String[] args){
		String currDir = System.getProperty("user.dir");
		File dir = new File(currDir);
		SimpleDateFormat df =new SimpleDateFormat("yyyy-MM-dd HH:mma");
		File[] files = dir.listFiles();
		for(File f :  files) {
			String name = f.getName();
			String attribute = "";	String size = "";
			if(f.isDirectory()) {
				attribute = "DIR";
			} else {
				size = f.length() + "";
				attribute  = f.canRead()  ? "R" : " ";	
				attribute += f.canWrite() ? "W" : " ";
				attribute += f.isHidden() ? "H" : " ";		}
			System.out.printf("%s %3s %6s %s%n", 
	df.format(new Date(f.lastModified())), attribute, size, name );
		}	}} // end of class