package ch05_arr;

public class ArrEx16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= new int[10];
		int count=0;
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random() * 100) + 1;
			for(int j=0; j<i; j++) {
				if(arr[i]==arr[j]) {
					i--;
				}
			}
		}
		for(int i=0; i < arr.length; i++) {
			for(int j=0; j < arr.length-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					}
			}

		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}
}
