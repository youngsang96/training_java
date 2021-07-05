package solve;

import java.util.Scanner;

public class exam1_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("¼ıÀÚ¸¦ ÀÔ·ÂÇÏ¼¼¿ä");
		int num = scan.nextInt();
		int result = 0;
		int temp = num;
		while(temp != 0) {
			result *=10; 
			result += temp % 10;
			temp /= 10;
		}
		if(num == result) {
			System.out.println("ÁÂ¿ì´ëÄª¼ö ");
		} else {
			System.out.println("ÁÂ¿ì´ëÄª¼ö¾Æ´Ô");
		}
	}
}

