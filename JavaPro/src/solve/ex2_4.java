package solve;

public class ex2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 2) {
			System.out.println("command line에 두개의 파라미터만 입력하세요");
			System.out.println("java Ex4 12 15");
			return; //main 메서드 종료
		}
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int num=2;
		while(num < ((a>b)? a: b)) {
		if(a%num ==0 && b%num ==0) {
			System.out.println(num);
		}
		num++;	
		}
	}
}

