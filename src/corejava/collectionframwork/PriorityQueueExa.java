package corejava.collectionframwork;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExa {
public static void main(String[] args) {
	Queue<Integer> queue= new PriorityQueue<>(Comparator.reverseOrder());
	
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
