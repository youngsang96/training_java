package solve;

public class ex3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= new int[11];
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random() * 10) + 1;
	}
	for(int i=0; i<=4; i++) {
		arr[i+5] = arr[i];
	}
	for(int a : arr) {
		System.out.print(a+" ");
	}
	}
}
