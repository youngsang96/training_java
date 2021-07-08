package ch06_oop;

class Rectangle{
	int height;
	int width;
	
	void area(){
		System.out.println(width+"*"+height+"="+(width+height));
	}
	
	void length() {
		System.out.println("("+width+"+"+height+")*2="+(width+height)*2);
	}

	
}

public class Exam_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle();
		r.height = 10;
		r.width = 5;
		r.area();
		r.length();
		r.height = 30;
		r.width = 20;
		r.area();
		r.length();
	}

}
