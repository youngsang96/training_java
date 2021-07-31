package ch18_io;

import java.io.File;

public class FileEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "c:\\Program Files";
		File f1 = new File(filePath);
		String files[] = f1.list();
		for(String f : files) {
			File f2 = new File(filePath,f);
			if(f2.isDirectory()) {
				System.out.printf("%s : ���丮%n", f);
			}
			else if(f2.isFile()) {
				System.out.printf("%s : ����(%,dbyte)%n",f,f2.length());
					
			}
		}
	}

}
