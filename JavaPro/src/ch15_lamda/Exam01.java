package ch15_lamda;

interface LambdaExam01
{void method(int num);
}
public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LambdaExam01 f = x -> {
			int sum=0;
			for(int i=1; i<=x; i++) {
				sum+=i;
				}
			System.out.println(sum);	
		};
		
		f.method(10);
		f = x -> {
			int sum=1;
			for(int i=1; i<=x; i++) {
				sum*=i;
				}
			System.out.println(sum);	
		};
		f.method(4);
	}

}
