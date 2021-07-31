package ch18_io;
import java.io.*;

public class RandomAccessFileEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sumkor = 0;
		int sumeng =0;
		int summath = 0;
		int no = 4;
		
		try {
		RandomAccessFile raf = new RandomAccessFile("score2.dat","r");
			while(true) {
				raf.seek(no);
				sumkor+=raf.readInt();
				sumeng+=raf.readInt();
				summath+=raf.readInt();
				no+=16;
				
			}
		}catch(FileNotFoundException e) {
			//e.printStackTrace();
		}catch (EOFException e) {
			//e.printStackTrace();
		}catch(IOException e) {
			//e.printStackTrace();
		}
		
		System.out.println("국어 점수 합: "+ sumkor);
		System.out.println("엉어 점수 합: "+ sumeng);
		System.out.println("수학 점수 합: "+ summath);
	}

}
