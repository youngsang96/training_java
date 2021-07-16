package ch12_API;
import java.io.*;
import java.util.Scanner;
public class ScannerEx01 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new File("src/ch12_API/data4.txt"));
		
		int cnt = 0;
		int totalsum = 0;
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			Scanner sc2 = new Scanner(line).useDelimiter(",");
			int sum =0;
			while(sc2.hasNextLine()) {
				sum +=sc2.nextInt();
			}
			cnt++;
			System.out.println(cnt + ": "+ line +", sum= "+ sum);
			totalsum+=sum;
			
		}
		System.out.println( "Line "+ cnt +", Total= "+ totalsum);
	}

}
