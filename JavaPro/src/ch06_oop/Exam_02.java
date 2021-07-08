package ch06_oop;

class Rectangle2{ 
	int width; 
	int height; 
	
	public Rectangle2() {
		
	} 
	public Rectangle2(int x, int y) {
		this.width=x; 
		this.height=y; 
		}
	
	void area(){
		System.out.println(width+"*"+height+"="+(width+height));
	}
	
	void length() {
		System.out.println("("+width+"+"+height+")*2="+(width+height)*2);
	}
}


public class Exam_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle2[] rarr=new Rectangle2[3];
		for(int i=0; i < rarr.length; i++) {
			rarr[i]= new Rectangle2(i+10, i+20);
			System.out.print(i+"번쨰 사각형 넓이:");
			rarr[i].area();
			System.out.print(i+"번쨰 사각형 둘레:");
			rarr[i].length();
		}
	}

}
