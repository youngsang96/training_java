package ch04_Control;

public class ControlEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int i = 0;
		for(i =1;i<=10;i++) {sum+=i;}
		System.out.println("1~10������ ��:" +sum);
		System.out.println("while ������ �̿��ϱ�");
		sum = 0;
		i = 0;
		while(i<=10) {sum +=i; i++;}
		System.out.println("1~10������ ��:" +sum);
		System.out.println("do while ������ �̿��ϱ�");
		sum = 0;
		i = 0;
		do {
			sum +=i;
			i++;
		}while(i <= 10);
		System.out.println("1~10������ ��:" +sum);
	}

}
