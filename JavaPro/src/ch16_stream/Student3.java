package ch16_stream;

class Student3 {
	String name;
	boolean isMale; // ����
	int hak;		// �г�
	int ban;		// ��
	int score;

	Student3(String name, boolean isMale, int hak, int ban, int score) { 
		this.name	= name;
		this.isMale	= isMale;
		this.hak	= hak;
		this.ban	= ban;
		this.score  = score;
	}

	String	getName()  { return name;}
	boolean isMale()   { return isMale;}
	int		getHak()   { return hak;}
	int		getBan()   { return ban;}
	int		getScore() { return score;}

	public String toString() { 
		return String.format("[%s, %s, %d�г� %d��, %3d��]", name, isMale ? "��":"��", hak, ban, score); 
	}

	enum Level {
		HIGH, MID, LOW
	}
}