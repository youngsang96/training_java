package ch12_API;
import java.util.*;

public class CloneEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		int[] arrClone = arr.clone();
		
		System.out.println("arr= "+Arrays.toString(arr));
		System.out.println("arrClone= "+Arrays.toString(arrClone));
		arrClone[0] = 6;
		System.out.println("==========================");
		System.out.println("arr= "+Arrays.toString(arr));
		System.out.println("arrClone= "+Arrays.toString(arrClone));
	}

}
