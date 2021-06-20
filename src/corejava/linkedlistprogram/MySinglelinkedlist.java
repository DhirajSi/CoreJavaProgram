package corejava.linkedlistprogram;

public class MySinglelinkedlist {
	Node head = null;

	public void add(int data) {
		
		Node toAdd = new Node(data);
		
		if(isEmpty()) {
			head=toAdd;
			return;
		}
		
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = toAdd;
	}
	public void toPrintAll() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data +" ");
			temp = temp.next;
		}
	}
	
	
	boolean isEmpty() {
		return head==null;
	}

	class Node {
		int data;
		Node next;

		public Node(int data) {
			super();
			this.data = data;
			next = null;
		}

//		@Override
//		public String toString() {
//			return "Node [data=" + data + ", next=" + next + "]";
//		}

	}
//	@Override
//	public String toString() {
//		return "MySinglelinkedlist [head=" + head + "]";
//	}


}
