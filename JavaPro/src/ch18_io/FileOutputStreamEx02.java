package ch18_io;
import java.io.*;
import java.util.Date;

public class FileOutputStreamEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		firstMethod();}
	public static void firstMethod() {
		secondMethod();
	}
	public static void secondMethod() {
	try {
		throw new Exception("파일에 예외 메세지 저장하기");
	}catch(Exception e) {
		e.printStackTrace();
		try {
			
			/*
			 * ("error.log",true) 
			 *  "error.log" : 생성할 파일의 이름. 파일 없으면 생성. 
			 *  				파일이 있으면 내용 변경
			 *   true/false : true : 파일이 있는 경우 기존의 내용에 
			 *   					  새로운 내용을 추가
			 *                false :파일이 있는 경우 기존의 내용을 
			 *                       새로운 내용으로 변경 
			 */

			FileOutputStream fos = new FileOutputStream("error.log", true);
			fos.write(("1:" + e.getMessage()+"\n\n").getBytes());
			fos.write(("2:===================\n\n"+(new Date())+"\n\n").getBytes());
			e.printStackTrace(new PrintStream(fos));
			fos.write("3:===============\n\n".getBytes());
		}catch (Exception e1) {
			e1.printStackTrace();
		}
	}
	}
}
