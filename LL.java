package HashMap;


public class LL <K>{
	private Node<K> head;
	private Node <K> tail;
	
	public Node<K>search(K key){
		
		Node<K> temp = head;
		while(temp != null) {
			if (temp.getkey().equals(key)) {
			return temp;
	}
	temp = temp.getnext();
		}
		return null ;
	}
	public void append (Node<K> myNode) {
		if (this.head == null) {
			this.head = myNode;
			
		}
		if (this.tail == null) {
			this.tail = myNode;
			
		}else {
			this.tail.setNext(myNode);
			this.tail = myNode;
			
		}
	}
	@Override
	public String toString() {
		return "LL [head=" + head + "]";
	}
	public void mynodes() {
		System.out.println(" my Nodes is : " + head );
	}
}
