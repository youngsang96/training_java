package ch18_io;
import java.io.*;

public class ObjectInputStreamEx01 {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		// TODO Auto-generated method stub
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.ser"));
		Customer c1 = (Customer)ois.readObject();
		Customer c2 = (Customer)ois.readObject();
		
		System.out.println("°í°´1 : " + c1);
		System.out.println("°í°´2 : " + c2);
	}

}
