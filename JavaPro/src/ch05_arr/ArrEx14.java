package ch05_arr;

public class ArrEx14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int arr[][]={{1},{10,20},{30,40,50},{60,70,80,90},{60,70,80,90,100}};	
	int row[]=new int[arr.length];
	int maxcol=0;
	for(int i=0; i<arr.length; i++) {
		if(maxcol < arr[i].length) {
			maxcol= arr[i].length;
		}
	}
	int col[]=new int[maxcol];
	for(int i= 0; i<arr.length; i++) {
		for(int j=0; j<arr[i].length; j++) {
			row[i]+=arr[i][j];
			col[j]+=arr[i][j];

		}
		System.out.println(i+"row(행)의 합: "+ row[i]);
	}
	for(int i=0; i<col.length; i++) {
		System.out.println(i + "column(열)의 합: "+col[i]);
	}
	}

}
