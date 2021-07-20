package ch14_collection;
import java.util.*;

class StackQueuePriorityEx {
	public static void main(String[] args) {
		Queue pq = new PriorityQueue();
		pq.offer(3);  // pq.offer(new Integer(3)); ����ڽ�
		pq.offer(1);
		pq.offer(5);
		pq.offer(2);
		pq.offer(200);
		pq.offer(4);

		System.out.println(pq); // pq�� ���� �迭�� ���

		Object obj = null;

		// PriorityQueue�� ����� ��Ҹ� �ϳ��� ������.
		while((obj = pq.poll())!=null) 
			System.out.println(obj);
	}
}
