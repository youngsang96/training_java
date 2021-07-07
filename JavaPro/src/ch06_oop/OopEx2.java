package ch06_oop;

public class OopEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//OopEx1에 Phone 클래스가 존재
		Phone[] parr = new Phone[3];
		for(int i=0; i<parr.length; i++) {
			Phone p = new Phone();
			parr[i] = p;
			parr[i].no=i + "1234";
		}
		for(int i=0; i<parr.length; i++) {
			System.out.printf("parr[%d].no=%s\n",i,parr[i].no);
			parr[i].send((i==0)?parr[parr.length-1].no : parr[i-1].no);
		}
	}

}
