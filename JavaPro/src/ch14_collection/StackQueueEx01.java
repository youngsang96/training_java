package ch14_collection;
import java.util.*;
// Queue : First In First Out  
// Stack : Last In First Out

/*
 * Stack 클래스 : LIFO(Last in First out)
 *              Vector 클래스의 하위 클래스임
 *     void push(Object)   : 객체를 stack에 저장. 추가.
 *     Object pop()   : stack에서 객체 꺼냄. 리턴. stack에서 객체 제거
 *     Object peek()  : stack에서 객체를 조회.       
 * Queue 인터페이스 : FIFO (First in First out)
 *              LinkedList 클래스가 구현함.
 *     void offer(Object)  : 객체를 Queue에 저장. 추가
 *     Object poll()  : 객체를 Queue에서 꺼냄 저장. 리턴. Queue에서 제거        
 *     Object peek()  : Queue에서 객체를 조회.
 *     
 * LinkedList : Queue, List 인터페이스를 모두 구현.           
 */

public class StackQueueEx01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String cars[] = {"소나타", "그랜져", "SM5", "K9"};
	Stack<String> stack = new Stack<String>();
	for(String s : cars) stack.push(s);
	System.out.println("스택에 저장된 객체의 개수: "+ stack.size() + "->" + stack);
	System.out.println(stack.peek() + " : peek"); //LIFO
	System.out.println("스택에 저장된 객체의 개수: "+ stack.size() + "->" + stack);
	System.out.println(stack.pop()+" : pop"); //스택에서 꺼냄 LIFO
	System.out.println("스택에 저장된 객체의 개수: "+ stack.size() + "->" + stack);
	System.out.println("======================================");
	
	Queue<String> queue = new LinkedList<String>();
	for(String s : cars) queue.offer(s);
	System.out.println("큐에 저장된 객체의 개수: "+ queue.size() + "->" + queue);
	System.out.println(queue.peek()+ " : peek"); //FIFO
	System.out.println("큐에 저장된 객체의 개수: "+ queue.size() + "->" + queue);
	System.out.println(queue.poll()+ " : poll"); // 큐에서 꺼냄 FIFO
	System.out.println("큐에 저장된 객체의 개수: "+ queue.size() + "->" + queue);
	}
}
