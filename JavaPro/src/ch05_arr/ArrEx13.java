package ch05_arr;
/*
����	����	����	����	���
1���л� :100	80	90	270 	 90.00 
2���л� :80	95	100	275 	 91.67 
3���л� :60	65	70	195 	 65.00 
4���л� :85	70	75	230 	 76.67 
5���л� :90	90	80	260 	 86.67 
��������:	415	400	415	
�������:	83.00 	80.00 	83.00 	
*/


public class ArrEx13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score[][]= {{100,80,90},{80,95,100},{60,65,70},{85,70,75},{90,90,80}};
		int total[] = new int[3];
		System.out.println("\t����\t ����\t ����\t ����\t ���\t");
		
		for(int i=0; i<score.length; i++) {
			int sum=0;
			System.out.print(i+1 +"�� �л�: ");
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j]+"\t");
				sum+=score[i][j];
				total[j]+=score[i][j];
			}
			System.out.printf("%d  \t  %.2f  \n",sum, (double)sum/score[i].length);
		}
		System.out.print("��������: \t");
		for(int i=0; i<total.length; i++) {
			System.out.print(total[i]+"\t");
		}System.out.println();
		System.out.print("�������: \t");
		for(int i=0; i<total.length; i++) {
			System.out.printf("%.2f \t", (double) total[i]/score.length);
		}
	}
}
