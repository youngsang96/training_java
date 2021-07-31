package ch18_io;
import java.io.*;

public class RandomAccessFileEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = {	1, 100,  90,  90,
			    2,  70,  90, 100,
				3, 100, 100, 100, 
				4,  70,  60,  80, 
				5,  70,  90, 100
			   };

		try {
			RandomAccessFile raf = new RandomAccessFile("score2.dat","rw");
			for(int i = 0; i<score.length; i++) {
				System.out.println("pointer: "+ raf.getFilePointer()+" ----> " +score[i]);
				raf.writeInt(score[i]);
			}
			while(true) {System.out.println(raf.readInt());
		}
		}catch (EOFException eof) {
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
