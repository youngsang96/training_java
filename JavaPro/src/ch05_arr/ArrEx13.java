package ch05_arr;
/*
국어	영어	수학	총점	평균
1번학생 :100	80	90	270 	 90.00 
2번학생 :80	95	100	275 	 91.67 
3번학생 :60	65	70	195 	 65.00 
4번학생 :85	70	75	230 	 76.67 
5번학생 :90	90	80	260 	 86.67 
과목총점:	415	400	415	
과목평균:	83.00 	80.00 	83.00 	
*/


public class ArrEx13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score[][]= {{100,80,90},{80,95,100},{60,65,70},{85,70,75},{90,90,80}};
		int total[] = new int[3];
		System.out.println("\t국어\t 영어\t 수학\t 총점\t 평균\t");
		
		for(int i=0; i<score.length; i++) {
			int sum=0;
			System.out.print(i+1 +"번 학생: ");
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j]+"\t");
				sum+=score[i][j];
				total[j]+=score[i][j];
			}
			System.out.printf("%d  \t  %.2f  \n",sum, (double)sum/score[i].length);
		}
		System.out.print("과목총점: \t");
		for(int i=0; i<total.length; i++) {
			System.out.print(total[i]+"\t");
		}System.out.println();
		System.out.print("과목평균: \t");
		for(int i=0; i<total.length; i++) {
			System.out.printf("%.2f \t", (double) total[i]/score.length);
		}
	}
}
