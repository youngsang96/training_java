package ch12_API;
import java.text.*;
import java.util.*;
/*
 * Date 클래스 예제
 * 
 * SimpleDateFormat : 형식화 클래스.
 *   String format(Date) : Date 타입의 객체를 형식화된 문자열로 변경하여 리턴.
 *   Date   parse(String) : 형식화된 문자열을 Date 객체로 리턴
 */

public class DateEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date now = new Date();
		System.out.println(now);
		/*
		 * yyyy : 년도는 4자리 출력
		 * MM   : 월
		 * dd   : 일자
		 * HH   : 0 ~ 23시,
		 * hh   : 1 ~ 12시  
		 * mm   : 분
		 * ss   : 초
		 * E    : 요일
		 * a    : 오전, 오후
		 */

		SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss E a");
		String dispDate = sf.format(now);
		System.out.println(dispDate);
		String strDate = "2019-09-21";
		SimpleDateFormat sf2 = new SimpleDateFormat("yyyy-MM-dd");
		Date day = null;
		try {
			day = sf2.parse(strDate);
		}catch(ParseException e1) {
			e1.printStackTrace();
		}
		
		System.out.println(day);
		System.out.println(sf.format(day));
		strDate = "2019년 12월 31일";
		SimpleDateFormat sf3 = new SimpleDateFormat("yyyy년 MM월 dd일");
		try {
			day = sf3.parse(strDate);
		}catch(ParseException e1) {
			e1.printStackTrace();
		}
	SimpleDateFormat sf4 = new SimpleDateFormat("yyyy-MM-dd은 E요일 입니다.");
	System.out.println(sf4.format(day));
	}

}
