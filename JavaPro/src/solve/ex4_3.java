package solve;
class Circle{
	double r = 1;
	int x=0; int y=0;
	int no;
	static int count=0;
	
	Circle(int r ,int x, int y){
		this.r=r;
		this.x=x;
		this.y=y;
	}
	Circle(int x, int y){
		this.x=x;
		this.y=y;
	}
	Circle(int r){
		this.r=r;
	}
	
	double area() {
		return (Math.PI)*r*r;
	}
	
	double length() {
		return 2*(Math.PI)*r;
	}
	
	void move(int a, int b) {
		this.x=this.x+a;
		this.y=this.y+b;
	}
	
	void scale(double m) {
		this.r=this.r*m;
	}
	public String toString() {
		return count +"����:" +" ������:"+ r+", ��ǥ:("+x+","+y+"), ����:"+area()+", �ѷ�:"+length();
	}
}
public class ex4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle[] carr=new Circle[3];
		carr[0] = new Circle(10,10,10); //������ : 10, (10,10) ��ǥ
		carr[1] = new Circle(20,20);    //������ : 1, (20,20) ��ǥ
		carr[2] = new Circle(100);      //������ : 100, (0,0) ��ǥ
		for(Circle c : carr) {
			Circle.count++;
			System.out.println(c);
			c.move(10,10);
			System.out.println(c);
			c.scale(3);
			System.out.println(c);
	}

}
}
