package solve;
import java.util.Calendar;

public class ex4_4 {
    static String[][] amon = new String[12][7];
    static int year;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 year = Integer.parseInt("2021"); 
        
         int END_DAY = 0; 
        
         Calendar sDay = Calendar.getInstance();       // ������ 
         Calendar eDay = Calendar.getInstance();       // ����

         // ���� ��� 0 ���� 11������ ���� �����Ƿ� 1�� ���־�� �Ѵ�. 
         // ���� ���, 2004�� 11�� 1���� sDay.set(2004, 10, 1);�� ���� ����� �Ѵ�. 
         for(int mon = 0; mon < 12 ; mon+=1) {
         sDay.set(year, mon, 1);       
         eDay.set(year, mon+1, 1);

         // �������� ù������ �Ϸ縦 ���� ������� ������ ���� �ȴ�. 
         // 12�� 1�Ͽ��� �Ϸ縦 ���� 11�� 30���� �ȴ�. 
         eDay.add(Calendar.DATE, -1);  
       
         //Calendar.DAY_OF_WEEK �Ͽ��� 1: ������ 2: ȭ���� 3 ....����� 7
         // ������ ������  
         int START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK); 
         // �������� ���� 
         int END_DAY_OF_WEEK = eDay.get(Calendar.DAY_OF_WEEK); 
         // ������  ��¥�� ���´�. 
         END_DAY = eDay.get(Calendar.DATE); 
         
         int col = 0;
         String montstr="";
        
         // ������ ���� ���� 1���� �������̶�� ������ �� �� ��´�
         for(int j=1; j < START_DAY_OF_WEEK; j++) {  montstr+="   ";  }

         for(int i=1, n=START_DAY_OF_WEEK ; i <= END_DAY; i++, n++) { 
               	montstr+=(i < 10)? "  "+i : " "+i;
                if(n%7==0) { 
                amon[mon][col]=montstr;
                montstr="";
                col++;
               }
         } 
         // �������� ���� 
         for(int j=END_DAY_OF_WEEK; j < 7; j++) {  montstr+="   ";  }
         
         amon[mon][col]=montstr;
          }
      
        
         printCalendar();
   } 
   
   public static void printCalendar(){
   
    
    for (int i = 0 ; i < 10 ; i+=3) {
     
     System.out.print("      " + year +"�� " + (i+1) +"��"+"\t\t");
     System.out.print("      " + year +"�� " + (i+2) +"��"+"\t\t");
     System.out.println("      " + year +"�� " + (i+3) +"��"+"\t");
           System.out.print(" SU MO TU WE TH FR SA  \t"); 
           System.out.print(" SU MO TU WE TH FR SA  \t"); 
           System.out.println(" SU MO TU WE TH FR SA  \t"); 
     
      for(int j = 0 ; j < 7 ; j++){
       if (amon[i][j]==null) amon[i][j]="";
       if (amon[i+1][j]==null) amon[i+1][j]="";
       if (amon[i+2][j]==null) amon[i+2][j]="";
       
       
     System.out.println(String.format("%21s",amon[i][j])+"\t"+String.format("%21s",amon[i+1][j])+"\t"+String.format("%21s",amon[i+2][j])+"\t");
  
    }
    System.out.println();
   }
} 
}
