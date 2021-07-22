package ch14_collection;
import java.io.*;
import java.util.*;

class Student4 implements Comparable<Student3>{
	String stuno;
	String name;
	int kor;
	int math;
	int eng;
	int tot;
	
	Student4(String stuno, String name, int kor, int math, int eng) {
		this.stuno = stuno;
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		this.tot = kor+math+eng;
	}
	
	@Override
	public String toString() {
		return "Student4 [stuno=" + stuno + ", name=" + name + ", kor=" + kor + ", math=" + math + ", eng=" + eng
				+ ", tot="+ tot + "]";
	}

	@Override
	public int compareTo(Student3 o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
public class Exam05 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new File("src/ch14_collection/student.txt"));
		List<Student4> li = new ArrayList<Student4>();
		Map<String, Student4> map = new HashMap<String, Student4>();
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			String[] str = line.split(",");
			Student4 s = new Student4(str[0], str[1], Integer.parseInt(str[2]), Integer.parseInt(str[3]), Integer.parseInt(str[4]));
			li.add(s);
			map.put(s.stuno,s);
			System.out.println(s);
		}
		System.out.println();
		System.out.println("총점순 프린트 (Comparator)");
		//Comparator
		Collections.sort(li, new Comparator<Student4>() {
            @Override
            public int compare(Student4 s1, Student4 s2) {
                if (s1.tot < s2.tot) {
                    return -1;
                } else if (s1.tot > s2.tot) {
                    return 1;
                }
                return 0;
            }
        });
		printList(li);
		
		Scanner sc2 = new Scanner(System.in);
		while(true) {
		System.out.print("학번을 입력하세요 : ");
		String input = sc2.nextLine();
		
		Student4 s = map.get(input);
		if(li.indexOf(s) == -1) {
			System.out.println(input + " : 없는 학번입니다.");
			break;
		}else System.out.println("등수는 " + (li.indexOf(s)+1)+"등 입니다.");
		}
	}
	static void printList(List<Student4> li) {
		for (Student4 s : li) {
			System.out.println(s);
		}
	}
}

