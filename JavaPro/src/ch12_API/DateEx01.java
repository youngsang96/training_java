package ch12_API;
import java.text.*;
import java.util.*;
/*
 * Date Ŭ���� ����
 * 
 * SimpleDateFormat : ����ȭ Ŭ����.
 *   String format(Date) : Date Ÿ���� ��ü�� ����ȭ�� ���ڿ��� �����Ͽ� ����.
 *   Date   parse(String) : ����ȭ�� ���ڿ��� Date ��ü�� ����
 */

public class DateEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date now = new Date();
		System.out.println(now);
		/*
		 * yyyy : �⵵�� 4�ڸ� ���
		 * MM   : ��
		 * dd   : ����
		 * HH   : 0 ~ 23��,
		 * hh   : 1 ~ 12��  
		 * mm   : ��
		 * ss   : ��
		 * E    : ����
		 * a    : ����, ����
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
		strDate = "2019�� 12�� 31��";
		SimpleDateFormat sf3 = new SimpleDateFormat("yyyy�� MM�� dd��");
		try {
			day = sf3.parse(strDate);
		}catch(ParseException e1) {
			e1.printStackTrace();
		}
	SimpleDateFormat sf4 = new SimpleDateFormat("yyyy-MM-dd�� E���� �Դϴ�.");
	System.out.println(sf4.format(day));
	}

}
