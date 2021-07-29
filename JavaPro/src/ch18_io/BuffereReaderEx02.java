package ch18_io;

import java.io.*;

public class BuffereReaderEx02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br =
				new BufferedReader(new FileReader("buffered.txt"));
		String msg="";
		while((msg = br.readLine()) != null) {
			System.out.println(msg);
		}
	}

}
