package temp;

public class Bicycle {
     private int month;    //
     public String sex;   //����
     private int age;  //���ɴ�
     private int number;  //�ű԰����ڼ�
	 
     
     public Bicycle(int month,String sex, int age,int number){
    	  this.month = month;
    	  this.sex = sex;
    	  this.age = age;
    	  this.number = number;
     }
     
    

	//getter
     public int getMonth() {
 		return month;
 	}
     
     public String getSex() {
  		return sex;
  	}
     
     public int getAge() {
  		return age;
  	}
     
     public int getNumber() {
  		return number;
  	}



	@Override
	public String toString() {
		return "Bicycle [month=" + month + ", sex=" + sex + ", age=" + age + ", number=" + number + "]";
	}

	
     
     
}
