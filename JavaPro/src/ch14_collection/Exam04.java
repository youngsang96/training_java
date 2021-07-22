package ch14_collection;
import java.io.*;
import java.util.*;

class Student3 implements Comparable<Student3>{
	String stuno;
	String name;
	int kor;
	int math;
	int eng;
	int tot;
	
	Student3(String stuno, String name, int kor, int math, int eng) {
		this.stuno = stuno;
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		this.tot = kor+math+eng;
	}
	
	@Override
	public String toString() {
		return "Student3 [stuno=" + stuno + ", name=" + name + ", kor=" + kor + ", math=" + math + ", eng=" + eng
				+ ", tot="+ tot + "]";
	}
	
	@Override
	public int compareTo(Student3 o) {
		return stuno.compareTo(o.stuno);
	}

}
	
public class Exam04 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new File("src/ch14_collection/student.txt"));
		List<Student3> li = new ArrayList<Student3>();
		
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			String[] str = line.split(",");
			Student3 s = new Student3(str[0], str[1], Integer.parseInt(str[2]), Integer.parseInt(str[3]), Integer.parseInt(str[4]));
			li.add(s);
			System.out.println(s);
		}
		System.out.println();
		
		System.out.println("1. 학번순 프린트 (Comparable)");
		//Comparable
		Collections.sort(li);
		printList(li);
		System.out.println();
		
		System.out.println("2. 이름순 프린트 (Comparator)");
		Collections.sort(li, new Comparator<Student3>() {
			//Comparator
			@Override
            public int compare(Student3 s1, Student3 s2) {
             return s1.name.compareTo(s2.name);
            }
            });
		printList(li);
		System.out.println();
		
		System.out.println("3. 총점순 프린트 (Comparator)");
		//Comparator
		Collections.sort(li, new Comparator<Student3>() {
            @Override
            public int compare(Student3 s1, Student3 s2) {
                if (s1.tot < s2.tot) {
                    return -1;
                } else if (s1.tot > s2.tot) {
                    return 1;
                }
                return 0;
            }
        });
		printList(li);
	}

	static void printList(List<Student3> li) {
		for (Student3 s : li) {
			System.out.println(s);
		}
	}
}
