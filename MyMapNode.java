package HashMap;

public class MyMapNode<K, V> implements Node<K> {
	K key;
	V value;
	Node<K> next;
	
	public MyMapNode(K key, V value) {
		super ();
		this.key = key;
		this.value = value;
		this.next = null;
		
	}

	@Override
	public K getkey() {
		// TODO Auto-generated method stub
		return key;
	}

	@Override
	public void setkey(K key) {
		// TODO Auto-generated method stub
		this.key = key;
		
	}
	public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
    
	@Override
	public void setNext(Node<K> next) {
		// TODO Auto-generated method stub
		this.next = next;
		
		
	}

	@Override
	public Node<K> getnext() {
		// TODO Auto-generated method stub
		return next;
	}

	@Override
	public String toString() {
		return "MyMapNode [key=" + key + ", value=" + value + ", next=" + next + "]";
		
		}

}
