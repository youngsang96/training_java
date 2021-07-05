package ch05_arr;

public class ArrEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,30,40,50};
		for(int a : arr) {
			System.out.print(a+" ");
		}
		System.out.println();
		for(int i=0; i <arr.length; i++) {
			System.out.println("arr["+i+"]=" + arr[i]);
		}
		System.out.println();
		arr = new int[] {100, 200 ,300};
		for(int a : arr) {
			System.out.print(a+" ");
		}
	}

}
