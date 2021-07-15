package ch12_API;
/*
������ Wrapper Ŭ������ �⺻�ڷ������̿��� �ڵ� ����ȯ�� �����ϴ�. 
�̰��� �츮�� �ڽ�(Boxing) �� ��ڽ�(Unboxing)�̶� �Ѵ�
�ٸ� Ÿ���� Unboxing�� ���� (�⺻�� type�� auto Casting ����)
�ٸ� Ÿ���� boxing�� �Ұ��� 
equals(), hashCode(), toString() ��� �������̵� �Ǿ�����
compareTo() �������̵� 
*/

public class WrapperEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i = new Integer(100);
		Integer i2 = new Integer(123);
		int iii = i;
		double d = (double)(int)i; float f = i;
		Short s=(short)(int)i;
		Double d2=(double)(int)i;
		
		Double d3 = d;
		System.out.println("i == i2 : " + (i==i2));
		System.out.println("i.equals(i2) : " + i.equals(i2));
		System.out.println("i.compareTo(i2) : "+i.compareTo(i2));
		System.out.println("i.toString() : "+i.toString());
		System.out.println("MAX_VALUE : "+ Integer.MAX_VALUE);
		System.out.println("MIN_VALUE : "+ Integer.MIN_VALUE);
		System.out.println("SIZE= "+Integer.SIZE+ "bits");
		System.out.println("BYTES= "+Integer.BYTES+ "bytes");
		System.out.println("TYPE= "+ Integer.TYPE);
	}

}
