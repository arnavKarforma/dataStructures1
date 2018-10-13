
public class LinkedListTest {
public static void main(String[] args) {
	LinkedList<String> ls1 = new LinkedList<>();
	ls1.insert("t1");
	ls1.insert("t2");
	ls1.insert("t3");
	ls1.insert("t4");
	ls1.show();
	System.out.println("After first insert");
	ls1.delete("t3");
	ls1.show();
}
}
