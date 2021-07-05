package solve;

public class ex2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= new int[10];
		int count=0;
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random() * 10) + 1;
		}
		for(int a : arr) {
			System.out.print(a+": ");
			for(int b=0; b<a; b++) {
				System.out.print("*");
			}
		System.out.println();
	}
}
}