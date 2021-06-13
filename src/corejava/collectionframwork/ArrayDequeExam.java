package corejava.collectionframwork;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeExam {
	public static void main(String[] args) {

		ArrayDeque<Integer> queue = new ArrayDeque<>();

		queue.offer(4);
		queue.offerFirst(5);
		queue.offer(1);
		queue.offer(8);

		System.out.println(queue.peekLast());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);

	}
}