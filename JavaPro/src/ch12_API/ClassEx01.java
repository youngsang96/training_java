package ch12_API;

public class ClassEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s = new Sample(); s.num=99;
		System.out.println(s);
		Sample e;
		try {
			Class<?> c = Class.forName("ch12_API.Sample");
			e = (Sample) c.newInstance();
			e.num=10;
			System.out.println(e);
			System.out.println(e==s);
		}catch(InstantiationException e1) {
			e1.printStackTrace();
		}catch(IllegalAccessException e1) {
			e1.printStackTrace();
		}catch(ClassNotFoundException e1) {
			e1.printStackTrace();
		}
	}
}

	class Sample{
		int num;
		@Override
		public String toString() {
			return num+" ";
	}
}
