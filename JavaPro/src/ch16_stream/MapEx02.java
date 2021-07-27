package ch16_stream;

import java.io.*;


class Car {
	private int month;
	private int con;  //입고(1), 출고(2) , 반품(3)
	private String car;
	private int qty;
	private String remark;
	public Car() {}
	public Car(int month, int con, String car, int qty, String remark) {
		super();
		this.month = month;
		this.con = con;
		this.car = car;
		this.qty = qty;
		this.remark = remark;
	}
	//getter
	public int getMonth() {
		return month;
	}
	public int getCon() {
		return con;
	}
	public String getCar() {
		return car;
	}
	public int getQty() {
		return qty;
	}
	public String getRemark() {
		return remark;
	}
	@Override
	public String toString() {
		return "Car [month=" + month + ", con=" + con + ", car=" + car + ", qty=" + qty + ", remark=" + remark + "]";
	}
	
}

public class MapEx02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("src/ch16_stream/product.txt"));
		
		br.lines()
		.map(s->{
			String[] str = s.split(","); String temp= "";
			try { temp = str[4];}
			catch(ArrayIndexOutOfBoundsException e) {
				temp="";
			}
			return new Car(Integer.parseInt(str[0]),
						Integer.parseInt(str[1]),
						str[2],
						Integer.parseInt(str[3]),
						temp);
		})
		.filter(s->s.getCar().equals("라쎄티")&& s.getCon() == 1)
		.forEach(s -> System.out.println(s));
	}

}
