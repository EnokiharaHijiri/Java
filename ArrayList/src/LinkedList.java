class LinkListIterator implements Iterator{
	int current;
	LinkedList list;
	LinkListIterator(LinkedList list){
		this.list = list;
		this.current =0;
	}
	public boolean hasNext(){
		return current < list.length();
	}
	public int next(){
		return list.get(current++);
	}
}

public class LinkedList implements Aggregate{
	class Node{
		public int value;
		public Node next;
		
	}
	private Node head;
	private Node tail;
	private int length;
	
	public LinkedList(){
		head =null;
		tail= null;
		length=0;
	}
	public Iterator iterator(){
		return new LinkListIterator(this);
	}
	
	public void add(int index){	
		Node node =new Node();
		node.value = index;
		node.next = null;
		if(head == null){
			head = node;
			tail = node;	
		}else{
			tail.next = node;
			tail = node;
		}
		length = length+1;
	}
	
	int length(){
		return length;
	}
	
	int get(int index){
		Node node = head;
		for(int i = 0;i<index;i++){
			node = node.next;
		}
		return node.value;
	}
	
	void show(){
		Node node = head;
		for(int i = 0;i<length;i++){
			System.out.println(node.value);
			node = node.next;
			
		}
	}
	void remove(int index){
		Node node = head;
		int count =0 ;
		for(int i = 0;i<index;i++){
			System.out.println(node.value);
			node = node.next;	
			count =i;
		}	
		
	}
}
