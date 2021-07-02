package ch04_Control;
// (1) + (1+2) + (1+2+3) + ..... + (1+2+3+4+5+6+...+10) = 220 Ãâ·Â
public class exam_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
        for(int i=1;i<=10;i++) {
            System.out.print("(");
        	for(int j=1;j<=i;j++) {
        		sum+=j;
                System.out.printf("%d"+((i!=j)?"+":""),j);  
            }
        	
            System.out.print(")"+ ((i ==10)?"=":"+"));
        }
        System.out.println(sum);
    }
}