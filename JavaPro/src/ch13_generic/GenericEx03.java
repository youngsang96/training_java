package ch13_generic;
/*제네릭 : <T, M> 은 모든 문자가 가능 하다. 주로 영문 대문자 한글자를 쓴다
 *제네릭 class 구현  */

class Product<T, M>{
	private T kind;
	private M model;
	
	public T getKind(){
		return this.kind;
	}
	public M getModel() {
		return this.model;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public void setModel(M model) {
		this.model = model;
	}
	public String toString() {
		return "Product [Kind= " + kind +", model= "+model+"]";
	}
}
class Car{
	public String toString() {
		return "Car";
	}
}
class Tv{
	public String toString() {
		return "Tv";
	}
}
public class GenericEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product<Tv, String> product1 = new Product<Tv, String>();
		product1.setKind(new Tv());
		product1.setModel("스마트Tv");
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		System.out.println(product1);
		
		Product<Car, String> product2 = new Product<Car, String>();
		product2.setKind(new Car());
		product2.setModel("디젤");
		Car car = product2.getKind();
		String carModel = product2.getModel();
		System.out.println(product2);
		
	}

}
