package ch04_Control;

public class exam_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int sum2 = 0;
		for(int i = 1; i<=100; i++) {
			if (i%2 == 0 || i%3 == 0){
				sum +=i;
			}else if((i%2 != 0 && i%3 != 0)){
				sum2 +=i;
			}
		}
		System.out.println("2�� ����̰ų� 3�� ����� ������= " +sum);
		System.out.println("2�� ������ƴϰ� 3�� ����� �ƴ� ������= " +sum2);
	}

}
