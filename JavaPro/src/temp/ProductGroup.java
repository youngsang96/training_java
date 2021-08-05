package temp;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


//product.txt
class Car {
	private int month;
	private int con;  //�԰�(1), ���(2) , ��ǰ(3)
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
public class ProductGroup {
	
	public Stream<Car> makeCar() throws FileNotFoundException {
			//���� �Ǹ� ������ Map ��ü�� �����ϱ�
		BufferedReader br 
		= new BufferedReader(new FileReader("src/temp/product.txt"));

		Stream<Car> car = br.lines()
				.map(s->{ 
					String[] str = s.split(",");
					String temp = "";
					try {	temp = str[4]; //��ǰ����
					} catch(ArrayIndexOutOfBoundsException e) {
						temp = "";	}
					return new Car(Integer.parseInt(str[0]),
							Integer.parseInt(str[1]),str[2],
							Integer.parseInt(str[3]),temp);
				});
			return car;	
	}
	
	public static void main(String[] args) throws IOException {
		//���� �Ǹ� ������ Map ��ü�� �����ϱ�
		ProductGroup pg = new ProductGroup();
		
		Stream<Car> car = pg.makeCar();
		
		
		  Map<Integer, List<Car>> map 
		  = car.collect(Collectors.groupingBy(s
		  ->s.getMonth())); 
		  System.out.println(map);
		 
		  
		
		  for (Map.Entry<Integer, List<Car>> e: map.entrySet())
		  {
		  System.out.println(e.getKey()); 
		  for (Car c : e.getValue()) {
		  System.out.println(c); }
		  
		  }
		 
		car = pg.makeCar();
		
		  Map<Integer, Long> map2 = car 
				  .filter(s -> s.getCon() == 1)
		  .collect(Collectors.groupingBy(Car::getMonth,
				  Collectors.counting()));
		  
		  System.out.println("���� ���� �Ǽ�");
		  for (Map.Entry<Integer, Long> e: map2.entrySet()) {
		  System.out.println(e.getKey()+"��:"+e.getValue());
		  
		  }
		 
		  car = pg.makeCar();
		
		  Map<Integer, Integer> map4 = car 
				  .filter(s -> s.getCon() == 1) // ����
		  .collect(Collectors .groupingBy(s->s.getMonth(),
				  Collectors.summingInt(Car ::  getQty))); 
		  System.out.println("���� �������"); 
		  for (Map.Entry<Integer, Integer> e:
		  map4.entrySet()) {
		  
		  System.out.println(e.getKey()+"��:"+e.getValue());
		  
		  }
		  
		  
		  car = pg.makeCar();
		  
		  Map<String, Integer> map5 = car
				  .filter(s -> s.getCon() == 3) // ��ǰ
				  .collect(Collectors
						  .groupingBy(s->s.getCar(), 
						Collectors.summingInt(Car :: getQty)));
		
		  System.out.println("ǰ�� ��ǰ����");
		 for (Map.Entry<String, Integer> e: map5.entrySet()) 
			 { System.out.println(e.getKey()+" :"+e.getValue());
						 
				 }
	}
}
