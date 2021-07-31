package ch18_io;
import java.io.*;
import java.util.Date;

public class FileEx02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f1 = new File("c:/temp1");
		System.out.printf("%s 폴더생성: %b\n", f1.getAbsolutePath(),f1.mkdir());
		
		File f2 = new File("c:/temp1/test.txt");
		System.out.printf("%s 폴더생성: %b\n", f2.getAbsolutePath(),f2.createNewFile());
		System.out.printf("파일이름: %s, 파일크기: %,d byte\n", f2.getName(),f2.length());
		
		File f3 = new File("c:/temp1/test2.txt");
		System.out.printf("%s -> %s 이름변경: %b\n", f2.getName(),f3.getName(),f2.renameTo(f3));
		
		System.out.printf("%s 파일 최종 수정 시간: %s\n", f3.getName(), new Date(f3.lastModified()));
		System.out.printf("%s 파일삭제: %b\n",f3.getName(),f3.delete());
		
		
	}

}
