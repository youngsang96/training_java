package temp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BicycleUse {
	
	public Stream<Bicycle> makeBicycle() throws Exception{
		
	BufferedReader br 
	= new BufferedReader(new FileReader("src/temp/assignment.txt"));

	Stream<Bicycle> bicycle = br.lines()
			.map(s->{ 
				String[] str = s.split(",");
				
			    return new Bicycle(Integer.parseInt(str[0]),
						str[1],Integer.parseInt(str[2]),
						Integer.parseInt(str[3]));
			});
    return bicycle;	
	}
		

	public static void main(String[] args) throws Exception {
       BicycleUse bu = new BicycleUse();
		
		Stream<Bicycle> bicycle = bu.makeBicycle();
		
		
		  
		System.out.println("=======1. �Ϻ�, ���ɴ뺰 ������ �� ����� ��=======");
		  
		  Map<Integer, Map<Integer,Integer>> map1 =
				   bicycle
				          .collect(Collectors.groupingBy(Bicycle::getMonth,
				        		  Collectors.groupingBy(Bicycle::getAge,
				        		  Collectors.summingInt(Bicycle::getNumber)
				        		  )));
		 
		 
		  
		  
		  for(Entry<Integer, Map<Integer,Integer>> a: map1.entrySet()) {
			  System.out.println(a.getKey()+" ��");
			  TreeMap<Integer,Integer> treeMap = new TreeMap<>(a.getValue());
			  
			  for(Entry<Integer,Integer> b: treeMap.entrySet()) {
				  System.out.println(b.getKey()+"�� :"+ b.getValue()+"��");
			  }
		  }
		  
		  System.out.println();
		  System.out.println("=======2. ����, ���ɴ뺰 ������ �� ����� ��=======");
		 
			
		  bicycle = bu.makeBicycle();
		  Map<String, Map<Integer,Integer>> map2 =
				   bicycle
				          .collect(Collectors.groupingBy(Bicycle::getSex,
				        		  Collectors.groupingBy(Bicycle::getAge,
				        		  Collectors.summingInt(Bicycle::getNumber)
				        		  )));
		 
		  
		  
		  for(Entry<String, Map<Integer,Integer>> a: map2.entrySet()) {
			  System.out.println(a.getKey());
			  TreeMap<Integer,Integer> treeMap = new TreeMap<>(a.getValue());
			  for(Entry<Integer,Integer> b: treeMap.entrySet()) {
				  System.out.println(b.getKey()+"�� :"+b.getValue()+"��");
			  }
			  System.out.println();
		  }
		  
		  System.out.println();
		  System.out.println("=======2. ����, ���ɴ뺰 ������ �� ����� ��=======");
		  System.out.println();
		  bicycle = bu.makeBicycle();	
			Map<Integer, Integer> Male = bicycle
					.filter(s -> s.getSex().contains("Male"))
					.collect(Collectors.groupingBy(s->s.getMonth(),
							Collectors.summingInt(Bicycle::getNumber)));
			System.out.println("<������ ���� ����� ��Ȳ>");
			for(Map.Entry<Integer, Integer> e : Male.entrySet()) {
				System.out.println(e.getKey()+"��:"+e.getValue()+"��");
			}
			
			System.out.println("=================");
			
			bicycle = bu.makeBicycle();
			Map<Integer, Integer> Female = bicycle
					.filter(s -> s.getSex().contains("Female"))
					.collect(Collectors.groupingBy(s->s.getMonth(),
							Collectors.summingInt(Bicycle::getNumber)));
			System.out.println("<������ ���� ����� ��Ȳ>");
			for(Map.Entry<Integer, Integer> e : Female.entrySet()) {
				System.out.println(e.getKey()+"��:"+e.getValue()+"��");
			}
			System.out.println();

}
}