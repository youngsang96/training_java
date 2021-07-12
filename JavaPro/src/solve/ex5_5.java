package solve;
class Rectangle3{
	int width;
	int height;
	int serialNo;
	static int sno;

	Rectangle3(int w, int h){
		width=w;
		height=h;
		serialNo=++sno;
	}
	int area() {
		return width*height;
	}
	int length(){
		return (width+height)*2;
	}
	boolean isSquare() {
		return width==height;
	}
	void info() {
		System.out.println
		(serialNo+"번사각형 : ("+width+","+height+") 넓이:"+area()+
				", 둘레:"+length()+(isSquare()?" 정사각형":" 직사각형"));
	}
}
public class ex5_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle3[] recarr= new Rectangle3[3];
		recarr[0] = new Rectangle3(10,10);
		recarr[1] = new Rectangle3(20,10);
		recarr[2] = new Rectangle3(25,25);
		for(Rectangle3 r : recarr) {
			r.info();
		}

	}

}
