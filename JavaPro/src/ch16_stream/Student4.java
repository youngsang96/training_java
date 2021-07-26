package ch16_stream;

public class Student4 {
	private String name;
	private int score;
	public Student4(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student4 [name=" + name + ", score=" + score + "]";
	}

	
}
