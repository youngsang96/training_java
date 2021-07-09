package solve;
class Cube{
	int hor; int ver; int height;
	Cube(int x){
		this.hor=x;
		this.ver=x;
		this.height=x;
	}
	int volume() {
		return hor*ver*height;
	}
	int surfaceArea() {
		return 6*hor*ver;
	}
}
public class ex5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// µÎ Á¤À°¸éÃ¼ °´Ã¼ »ý¼º
	    Cube a = new Cube(3);
	    Cube b = new Cube(5);
	    
	    // µÎ Á¤À°¸éÃ¼ÀÇ ºÎÇÇ¿Í °Ñ³ÐÀÌ Ãâ·Â
	    System.out.printf("Á¤À°¸éÃ¼ aÀÇ ºÎÇÇ: %d, °Ñ³ÐÀÌ: %d\n", a.volume(), a.surfaceArea());
	    System.out.printf("Á¤À°¸éÃ¼ bÀÇ ºÎÇÇ: %d, °Ñ³ÐÀÌ: %d\n", b.volume(), b.surfaceArea());

	}

}
