package ch03_operator;

public class OpEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5,y=0;
		System.out.println("x="+x+"y="+y); //5,0
		y= x++; //y=5
		System.out.println("x="+x+"y="+y); //x=6, y=5
		System.out.println("x="+ x++); //x=6
		System.out.println("x="+ ++x); // x가 7이었고 선반영되어 x=8
		x= y--;
		System.out.println("x="+x+"y="+y); //x=5, y=4
		x= --y;
		System.out.println("x="+x+"y="+y); 
	}

}
