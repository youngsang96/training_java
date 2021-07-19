package ch13_generic;
/*���׸� : <T, M> �� ��� ���ڰ� ���� �ϴ�. �ַ� ���� �빮�� �ѱ��ڸ� ����
 *���׸� class ����  */

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
		product1.setModel("����ƮTv");
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		System.out.println(product1);
		
		Product<Car, String> product2 = new Product<Car, String>();
		product2.setKind(new Car());
		product2.setModel("����");
		Car car = product2.getKind();
		String carModel = product2.getModel();
		System.out.println(product2);
		
	}

}
