package ch05_arr;

import java.util.Arrays;

//로또번호 추출
public class ArrEx11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] balls = new int[45];
		int[] lotto = new int[6];
		
		for(int i=0; i<balls.length; i++) {
			balls[i] = i+1;
		}
		for(int i=0; i<1000; i++) {
			int f = (int) (Math.random()*45);
			int t = (int) (Math.random()*45);
			int temp=balls[t];
			balls[t]=balls[f];
			balls[f]=temp;
		}
		for(int i=0; i<lotto.length; i++){
            lotto[i]=balls[i];
       }
		for(int x : lotto) {
			System.out.print(x +" ");
		}
		System.out.println();
		Arrays.sort(lotto);
		/*for(int i=0; i < lotto.length; i++) {
			boolean change = false;
			for(int j=0; j < lotto.length-i-1; j++) {
				if(lotto[j] > lotto[j+1]) {
					int temp=lotto[j];
					lotto[j]=lotto[j+1];
					lotto[j+1]=temp;
					change=true;
				}
			}
			if (!change) break;
		}
		*/
		System.out.print("sort: ");
		for(int x : lotto) {
			System.out.print(x +" ");
		}
	}
}
