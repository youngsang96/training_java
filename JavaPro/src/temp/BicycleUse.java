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
		
		
		  
		System.out.println("=======1. 일별, 연령대별 자전거 총 등록자 수=======");
		  
		  Map<Integer, Map<Integer,Integer>> map1 =
				   bicycle
				          .collect(Collectors.groupingBy(Bicycle::getMonth,
				        		  Collectors.groupingBy(Bicycle::getAge,
				        		  Collectors.summingInt(Bicycle::getNumber)
				        		  )));
		 
		 
		  
		  
		  for(Entry<Integer, Map<Integer,Integer>> a: map1.entrySet()) {
			  System.out.println(a.getKey()+" 월");
			  TreeMap<Integer,Integer> treeMap = new TreeMap<>(a.getValue());
			  
			  for(Entry<Integer,Integer> b: treeMap.entrySet()) {
				  System.out.println(b.getKey()+"대 :"+ b.getValue()+"명");
			  }
		  }
		  
		  System.out.println();
		  System.out.println("=======2. 성별, 연령대별 자전거 총 등록자 수=======");
		 
			
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
				  System.out.println(b.getKey()+"대 :"+b.getValue()+"명");
			  }
			  System.out.println();
		  }
		  
		  System.out.println();
		  System.out.println("=======2. 성별, 연령대별 자전거 총 등록자 수=======");
		  System.out.println();
		  bicycle = bu.makeBicycle();	
			Map<Integer, Integer> Male = bicycle
					.filter(s -> s.getSex().contains("Male"))
					.collect(Collectors.groupingBy(s->s.getMonth(),
							Collectors.summingInt(Bicycle::getNumber)));
			System.out.println("<남성의 월별 등록자 현황>");
			for(Map.Entry<Integer, Integer> e : Male.entrySet()) {
				System.out.println(e.getKey()+"월:"+e.getValue()+"명");
			}
			
			System.out.println("=================");
			
			bicycle = bu.makeBicycle();
			Map<Integer, Integer> Female = bicycle
					.filter(s -> s.getSex().contains("Female"))
					.collect(Collectors.groupingBy(s->s.getMonth(),
							Collectors.summingInt(Bicycle::getNumber)));
			System.out.println("<여성의 월별 등록자 현황>");
			for(Map.Entry<Integer, Integer> e : Female.entrySet()) {
				System.out.println(e.getKey()+"월:"+e.getValue()+"명");
			}
			System.out.println();

}
}