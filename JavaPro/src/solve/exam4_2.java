package solve;
class Card{
	String kind;
	int number;
	static int width=100;
	static int height=250;
	
	Card(String kind, int number){
		this.kind = kind;
		this.number=number;
	}
	
	Card(){
		
	}
	
	public String toString() {
		return kind + ":"+ number+"("+width+","+height+")";
	}
}
public class exam4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card c1=new Card("Heart",1);
		System.out.println(c1);
		Card c2=new Card("Spade",1);
		System.out.println(c2);
		Card.width=50;
		Card.height=80;
		System.out.println(c1);
		System.out.println(c2);
		Card c3=new Card();
		c3.kind="Clova";
		c3.number=8;
		System.out.println(c3);
	}

}
