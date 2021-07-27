package ch16_stream;
class Student5 implements Comparable<Student5> {
	String name;
	int ban;
	int eng;
	int math;
	int kor;
    int score;
	Student5(String name, int ban, int eng, int math, int kor) { 
		this.name =name;
		this.ban =ban;
		this.eng =eng;
		this.math=math;
		this.kor=kor;
		score=eng+math+kor;
	}

	public String toString() { 
	    return String.format("[%s, %d, %d, %d, %d, %d]"
	    		, name, ban, eng, math, kor, score).toString(); 
	}

	

   public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBan() {
		return ban;
	}

	public void setBan(int ban) {
		this.ban = ban;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	// 총점 내림차순을 기본 정렬로 한다.
	public int compareTo(Student5 s) { 
		return (s.eng+s.math+s.kor) - (eng+math+kor);
	}
}