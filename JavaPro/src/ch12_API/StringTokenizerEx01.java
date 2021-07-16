package ch12_API;
import java.util.*;
public class StringTokenizerEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String source = "100,200,300,400";
		StringTokenizer st = new StringTokenizer(source,",");
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		System.out.println("==============================");
		
		String expression ="x=100*(200+300)/2";
		StringTokenizer st1 = new StringTokenizer(expression,"+-*/=()",false);
		
		while(st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}
	}

}
