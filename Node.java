package HashMap;

public interface Node <K> {
		K getkey();
		
		void setkey(K key);
		void setNext(Node<K> next);
		Node<K> getnext();
		
		
		
}
