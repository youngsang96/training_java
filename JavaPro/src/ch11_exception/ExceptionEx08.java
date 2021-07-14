package ch11_exception;
	
public class ExceptionEx08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(AutoCloseableUse cr= new AutoCloseableUse();){
			System.out.println("process");
			System.out.println();
		}
	}
	}
class AutoCloseableUse implements AutoCloseable{
	public void close() {
		System.out.println("close()∞° »£√‚µ ");
	}
}
