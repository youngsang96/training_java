package ch14_collection;
import java.io.*;
import java.util.*;
/*
 * Properties 클래스 Hashtable 테이블의 하위 클래스임.
 * Hashtable은 Map 인터페이스의 구현 클래스이므로 Properties  
 * 클래스도 Map을 구현한 클래스다.
 * (key,value) 자료형이 모두 String임. 제넥릭표현은 안한다.
 * - 텍스트파일에 Properties 객체를 추가할 수 있는 기능이 있다.
 */

public class PropertiesEx01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties pr = new Properties();
		System.out.println(pr);
		// FileㅑㅜputStream : a.properties파일을 지정 > 읽어올 준비
		FileInputStream fis = new FileInputStream("src/ch14_collection/a.properties");
		pr.load(fis);
		System.out.println(pr);
		
		//pr.get("name") : Key가 name인 객체의 Value를 리턴
		System.out.println("이름: "+pr.getProperty("name"));
		// pr.getProperty : Hashtable이 이전에 사용되던 get 메서드
		System.out.println("전화번호:"+pr.getProperty("tel"));
		pr.put("subject", "컴퓨터공학");
		System.out.println(pr);
		// FileOutputStream : 파일 생성하기
		FileOutputStream fos = new FileOutputStream("src/ch14_collection/a.properties");
		
		pr.store(fos, "#save");
	}

}
