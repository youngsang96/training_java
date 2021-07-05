package ch05_arr;

public class ArrEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score1[] = {90,80,70,};
		
		int score2[] = new int[5];
		for(int i=0; i<score1.length; i++) {
			score2[i] = score1[i];
		}
		for(int a : score2) {
			System.out.println(a);
		}
	}

}
