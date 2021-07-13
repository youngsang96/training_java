package ch08_eum;
enum Lottery{
	Kwang, Car, Computer, MobilePhone, Book, Giftcard
}
public class EnumEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = (int)(Math.random()*6);
		
		Lottery lottery = Lottery.values()[num];
		System.out.println(lottery + "ø° ¥Á√∑µ«ºÃΩ¿¥œ¥Ÿ!!");
	}

}
