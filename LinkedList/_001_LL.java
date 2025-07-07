class _001_LL{
	Class node{
	int data;
	Node next;
	
	public Node(int data){
		this.data=data;
		this.next=null;
	}
	}

	Node head = null, tail=null;

	public void insert(int n){
		Node newnode = new Node();
		if (head == null){
			head == newnode;
			tail = newnode;
		}
		else{
			tail.next = newnode;
			tail = newnode;
		}
	}

	public void insert_mid(int pos, int n){
	Node newnode = new Node(n);
	if (head == null){
		head = newnode
		tail = newnode;
	}
	else{
		Node c = head, p = null;
		int count=1;
		if(pos == 1){
			newnode.next = head;
			head = newnode;
			return;
		}
	}
	while (count=pos && c!=null){
		pc;
		c=c.next;
	}
	

	}

	public static void main(String[] args){
		System.out.println("Hello World!");
		
	}
}
