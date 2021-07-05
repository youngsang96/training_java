package ch04_Control;

public class exam_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		int num2 = 1;
		int fib = 1;
		for(fib=1; fib <1000; ) {
			System.out.print(fib+" ");
			fib = num + num2;
			num = num2;
			num2 = fib;
			}
		}
	}

