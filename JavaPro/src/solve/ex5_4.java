package solve;
class Rectangle2 {
	int width, height, serialNo;
	static int sno;
	int area() {
		return width*height;
	}
	int length() {
		return (width+height) * 2;
	}
	public String toString() {
		return serialNo + "���簢�� : (" + width +"," + height +
				") => ����:" + area() + ",  �ѷ�:" + length();
	}
}

public class ex5_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle2[] arr = new Rectangle2[3];
		int totalArea = 0;
		int totalLength = 0;
		for(int i=0;i<arr.length;i++) {
			arr[i] = new Rectangle2();
			arr[i].width = i * 5 + 10;
			arr[i].height = i * 5 + 20;
			arr[i].serialNo = ++Rectangle2.sno; 
			System.out.println(arr[i]);
			totalArea += arr[i].area();
			totalLength += arr[i].length();
		}
		System.out.println("��ü �簢�� �������� : " + totalArea);
		System.out.println("��ü �簢�� �ѷ����� : " + totalLength);

	}

}
