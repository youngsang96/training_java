package ch14_collection;
import java.util.*;
// Queue : First In First Out  
// Stack : Last In First Out

/*
 * Stack Ŭ���� : LIFO(Last in First out)
 *              Vector Ŭ������ ���� Ŭ������
 *     void push(Object)   : ��ü�� stack�� ����. �߰�.
 *     Object pop()   : stack���� ��ü ����. ����. stack���� ��ü ����
 *     Object peek()  : stack���� ��ü�� ��ȸ.       
 * Queue �������̽� : FIFO (First in First out)
 *              LinkedList Ŭ������ ������.
 *     void offer(Object)  : ��ü�� Queue�� ����. �߰�
 *     Object poll()  : ��ü�� Queue���� ���� ����. ����. Queue���� ����        
 *     Object peek()  : Queue���� ��ü�� ��ȸ.
 *     
 * LinkedList : Queue, List �������̽��� ��� ����.           
 */

public class StackQueueEx01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String cars[] = {"�ҳ�Ÿ", "�׷���", "SM5", "K9"};
	Stack<String> stack = new Stack<String>();
	for(String s : cars) stack.push(s);
	System.out.println("���ÿ� ����� ��ü�� ����: "+ stack.size() + "->" + stack);
	System.out.println(stack.peek() + " : peek"); //LIFO
	System.out.println("���ÿ� ����� ��ü�� ����: "+ stack.size() + "->" + stack);
	System.out.println(stack.pop()+" : pop"); //���ÿ��� ���� LIFO
	System.out.println("���ÿ� ����� ��ü�� ����: "+ stack.size() + "->" + stack);
	System.out.println("======================================");
	
	Queue<String> queue = new LinkedList<String>();
	for(String s : cars) queue.offer(s);
	System.out.println("ť�� ����� ��ü�� ����: "+ queue.size() + "->" + queue);
	System.out.println(queue.peek()+ " : peek"); //FIFO
	System.out.println("ť�� ����� ��ü�� ����: "+ queue.size() + "->" + queue);
	System.out.println(queue.poll()+ " : poll"); // ť���� ���� FIFO
	System.out.println("ť�� ����� ��ü�� ����: "+ queue.size() + "->" + queue);
	}
}
