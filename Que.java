package Collection;

public class Que {	
	
	public static void main(String[] args) {
		// LinkedList 형식으로 Queue 만들기
		QueueNodeManager q = new QueueNodeManager();
		q.push(1);
		q.push(2);
		q.push(3);
		q.push(4);
		q.push(5);
		//q.peek();
		//q.peek();
		System.out.println(q.pop().getValue());
		System.out.println(q.pop().getValue());
		System.out.println(q.pop().getValue());

		System.out.println(q.size());

	}

}
