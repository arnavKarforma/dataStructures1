
public class LinkedList<T> {

	Node<T> head;

	public void insert(T t) {
		Node<T> node = new Node<>();
		node.data = t;

		if (head == null) {
			head = node;
		} else {
			Node<T> n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
	}

	public void show() {
		Node<T> n = head;
		while (n.next != null) {
			System.out.println(n.data);
			n = n.next;
		}
		System.out.println(n.data);
	}

	public void insertStart(T t) {
		Node n1 = head;
		Node<T> node = new Node<>();
		node.data = t;
		head = node;
		node.next = n1;
	}

	public void insertAt(T t, int index) {
		if (index == 0) {
			insertStart(t);
		} else {
			Node<T> node = new Node<>();
			node.data = t;
			Node<T> n = head;

			for (int i = 0; i < index - 1; i++) {
				if (n.next != null)
					n = n.next;
			}
			Node priorNext = n.next;
			n.next = node;
			node.next = priorNext;
		}

	}

	public void deleteAt(int index) {
		if (index == 0) {
			head = head.next;
		} else {
			Node<T> node = new Node<>();
			Node<T> n = head;
			for (int i = 0; i < index - 1; i++) {
				if (n.next != null)
					n = n.next;
				else {
					System.out.println("No element is there at this index" + index);
					break;
				}
			}
			if (n.next == null) {
				n = null;
			} else
				n.next = n.next.next;

		}
	}
	public void delete(T t){
		Node<T> n = head;
		while (n.next != null){
			if(n.next.data == t){
				Node<T> nodeToBeRemoved = n.next;
				n.next = nodeToBeRemoved.next;
			}
			else{
				System.out.println("The item to be removed is not present");
				break;
			}
		}
	}
}
