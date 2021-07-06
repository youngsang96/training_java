package ch05_arr;

public class ArrEx15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score[][]= {{90,80,70},{95,85,75},{70,80,75},{75,70,85},{70,75,80}};
		int total[][] = new int[score.length+1][score[0].length+1];
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				total[i][j]+=score[i][j];
				total[i][score[i].length]+=score[i][j];
				total[score.length][j]+=score[i][j];
				total[score.length][score[i].length]+=score[i][j];
			}
	}
		for(int i=0; i<total.length; i++) {
			System.out.print(i+"¹øÂ°: ");
			for(int j=0; j<total[i].length; j++) {
				System.out.printf("%5d", total[i][j]);
			}
			System.out.println();
	}
	}


}

