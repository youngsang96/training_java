package ch18_io;
import java.io.*;
public class DataInputStreamEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int score = 0;
		
		try {
			FileInputStream fis = new FileInputStream("score.dat");
			DataInputStream dis = new DataInputStream(fis);
			while(true) {
				score = dis.readInt();
				System.out.println(score);
				sum += score;
			}
		}catch (IOException e) {
			//e.printStackTrace();
		}
		System.out.println("гу╟Х: "+sum);
	}

}
