package solve;
import java.util.Calendar;

public class ex4_4 {
    static String[][] amon = new String[12][7];
    static int year;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 year = Integer.parseInt("2021"); 
        
         int END_DAY = 0; 
        
         Calendar sDay = Calendar.getInstance();       // 시작일 
         Calendar eDay = Calendar.getInstance();       // 끝일

         // 월의 경우 0 부터 11까지의 값을 가지므로 1을 빼주어야 한다. 
         // 예를 들어, 2004년 11월 1일은 sDay.set(2004, 10, 1);과 같이 해줘야 한다. 
         for(int mon = 0; mon < 12 ; mon+=1) {
         sDay.set(year, mon, 1);       
         eDay.set(year, mon+1, 1);

         // 다음달의 첫날에서 하루를 빼면 현재달의 마지막 날이 된다. 
         // 12월 1일에서 하루를 빼면 11월 30일이 된다. 
         eDay.add(Calendar.DATE, -1);  
       
         //Calendar.DAY_OF_WEEK 일요일 1: 월요일 2: 화요일 3 ....토요일 7
         // 시작일 요일이  
         int START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK); 
         // 마지막일 요일 
         int END_DAY_OF_WEEK = eDay.get(Calendar.DAY_OF_WEEK); 
         // 마지막  날짜를 얻어온다. 
         END_DAY = eDay.get(Calendar.DATE); 
         
         int col = 0;
         String montstr="";
        
         // 시작일 공백 만일 1일이 수요일이라면 공백을 세 번 찍는다
         for(int j=1; j < START_DAY_OF_WEEK; j++) {  montstr+="   ";  }

         for(int i=1, n=START_DAY_OF_WEEK ; i <= END_DAY; i++, n++) { 
               	montstr+=(i < 10)? "  "+i : " "+i;
                if(n%7==0) { 
                amon[mon][col]=montstr;
                montstr="";
                col++;
               }
         } 
         // 마지막일 공백 
         for(int j=END_DAY_OF_WEEK; j < 7; j++) {  montstr+="   ";  }
         
         amon[mon][col]=montstr;
          }
      
        
         printCalendar();
   } 
   
   public static void printCalendar(){
   
    
    for (int i = 0 ; i < 10 ; i+=3) {
     
     System.out.print("      " + year +"년 " + (i+1) +"월"+"\t\t");
     System.out.print("      " + year +"년 " + (i+2) +"월"+"\t\t");
     System.out.println("      " + year +"년 " + (i+3) +"월"+"\t");
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
