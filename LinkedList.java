package Collection;

public class LinkedList {
	public ListNode head = null;
	public LinkedList(ListNode head) {
		this.head=head;
	}
	
	
	public void insertNode(ListNode preNode,int data) {
		ListNode newNode = new ListNode(data);
		if(head==null) {
			this.head=newNode;
		}
		else {
			newNode.link=preNode.link;
			preNode.link=newNode;
		}
		
	}
	
	public void insertNode(int data) {
		ListNode newNode = new ListNode(data);
		if(head==null) {
			this.head=newNode;
		}
		else {
			ListNode currNode = head;
			while(currNode.link!=null) {
				currNode = currNode.link;
			}
			currNode.link=newNode;
		}
	}
	public ListNode insertNthNode(int data,int n) {
		ListNode newNode = new ListNode(data);
		ListNode currNode = head;
		if(head==null) {
			this.head=newNode;
		}
		while(n!=0) {
			if(currNode!=null) {
				//System.out.println("Last Node");
				break;
			}
			currNode=currNode.link;
			n-=1;
		}
		return currNode;
	}
	
	public void PrintNode() {
		ListNode curr = head;
		while(curr!=null) {
			System.out.println(curr.data);
			curr=curr.link;
		}
	}

	public static void main(String[] args) {
		ListNode headNode = new ListNode(5);
		LinkedList l = new LinkedList(headNode);
		l.insertNode(4);
		l.insertNode(3);
		l.insertNode(2);
		l.insertNthNode(3, 1);
		l.PrintNode();
	}

}
