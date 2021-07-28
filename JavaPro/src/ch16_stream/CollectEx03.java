package ch16_stream;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import ch16_stream.Student3.Level;

public class CollectEx03 {
	public static void main(String[] args) {

		Student3[] stuArr = {
			new Student3("나자바", true,  1, 1, 300),	
			new Student3("김지미", false, 1, 1, 250),	
			new Student3("김자바", true,  1, 1, 200),	
			new Student3("이지미", false, 1, 2, 150),	
			new Student3("남자바", true,  1, 2, 100),	
			new Student3("안지미", false, 1, 2,  50),	
			new Student3("황지미", false, 1, 3, 100),	
			new Student3("강지미", false, 1, 3, 150),	
			new Student3("이자바", true,  1, 3, 200),	
			new Student3("나자바", true,  2, 1, 300),	
			new Student3("김지미", false, 2, 1, 250),	
			new Student3("김자바", true,  2, 1, 200),	
			new Student3("이지미", false, 2, 2, 150),	
			new Student3("남자바", true,  2, 2, 100),	
			new Student3("안지미", false, 2, 2,  50),	
			new Student3("황지미", false, 2, 3, 100),	
			new Student3("강지미", false, 2, 3, 150),	
			new Student3("이자바", true,  2, 3, 200)	
		};

			Map<Integer, List<Student3>> stuBan = Stream.of(stuArr)
					.collect(Collectors.groupingBy(Student3::getBan));
			
			for(Integer it: stuBan.keySet()) {
				System.out.println(it + "반");
				for(Student3 s : stuBan.get(it)) {
					System.out.println(s);
				}
				System.out.println();
			}
	 Map<Student3.Level, List<Student3>> stuLevel = Stream.of(stuArr)
			 .collect(Collectors.groupingBy(s->{
				 if(s.getScore()>=200) return Student3.Level.HIGH;
				 else if (s.getScore() >= 100) return Student3.Level.MID;
				 else return Student3.Level.LOW;
			 }));
	 for(Level it : stuLevel.keySet()) {
		 System.out.println(it+"반");
		 for(Student3 s : stuLevel.get(it)) {
			 System.out.println(s);
		 }
		 System.out.println();
	 }
	 Map<Student3.Level, Long> stuLevelCount = Stream.of(stuArr)
			 .collect(Collectors.groupingBy(s->{
				 if(s.getScore()>=200) return Student3.Level.HIGH;
				 else if (s.getScore() >= 100) return Student3.Level.MID;
				 else return Student3.Level.LOW;}, Collectors.counting() ));
	 TreeSet<Student3.Level> keySet2 = new TreeSet<>(stuLevelCount.keySet());
	 for(Level it : keySet2) {
		 System.out.println(it + "반: " + stuLevelCount.get(it)+ "명");
	 }
	 System.out.println();
	 
	 Map<Integer, Map<Integer, List<Student3>>> stuHakBan = Stream.of(stuArr)
				.collect(Collectors.groupingBy(Student3::getHak,Collectors.groupingBy(Student3::getBan)));
	 for(Map<Integer, List<Student3>> hak : stuHakBan.values()) {
		 for(List<Student3> ban : hak.values()) {
			 for(Student3 s : ban) {
				 System.out.println(s);
			 }
			 System.out.println();
		 }
	 }
	Map<Integer, Map<Integer, Student3>> stuHakBanTop = Stream.of(stuArr)
			 .collect(Collectors.groupingBy(Student3::getHak,Collectors.groupingBy(Student3::getBan,
					 Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Student3::getScore)), Optional::get))));
	
	for(Map<Integer,Student3> hak : stuHakBanTop.values()) {
		System.out.println();
		for(Student3 s : hak.values()) {
			System.out.println(s);
			System.out.println();
		}
	}
	Map<Integer, Map<Integer, Double>> stuHakBanAvg = Stream.of(stuArr)
			 .collect(Collectors.groupingBy(Student3::getHak,Collectors.groupingBy(Student3::getBan,
					 Collectors.averagingDouble(Student3::getScore)
					 )));
	
	for(Entry<Integer, Map<Integer, Double>> hak : stuHakBanAvg.entrySet()) {
		System.out.println(hak.getKey()+ "학년 ");
		for(Entry<Integer, Double> ban: hak.getValue().entrySet()) {
			System.out.println(ban.getKey()+"반 평균: "+ ban.getValue());
		}
		System.out.println();
	}
					 
}
}
