package corejava.collectionframwork;

import java.util.LinkedList;
import java.util.Queue;

public class LinkListQueue {
	
	public static void main(String[] args) {
		Queue<Integer> queue= new LinkedList<>();
		
		queue.offer(4);
		queue.offer(9);
		queue.offer(1);
		queue.offer(8);
		
		System.out.println(queue.peek());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
	}

}
