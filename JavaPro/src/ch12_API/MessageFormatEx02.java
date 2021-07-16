package ch12_API;
import java.util.*;
import java.io.*;
import java.text.MessageFormat;

public class MessageFormatEx02 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String tableName = "CUST_INFO";
		String filename = "src/ch12_API/data4.txt";
		String msg = "INSERT INTO " + tableName +" VALUES({0},{1},{2},{3});";
		Scanner s = new Scanner(new File(filename));
		
		String pattern = "{0},{1},{2},{3}";
		MessageFormat mf = new MessageFormat(pattern);
		while(s.hasNextLine()) {
			String line = s.nextLine();
			Object[] objs = mf.parse(line);
			System.out.println(MessageFormat.format(msg, objs));
		}
		s.close();
	}

}
