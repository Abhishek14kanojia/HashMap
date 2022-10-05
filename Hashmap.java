package HashMap;
import java.util.*;

import javax.management.ValueExp;
public class Hashmap<K, V> {
	private static final V value = null;

	private final int numOFBucket = 10;
	
	ArrayList<LL<K>> arrayList;

	private LL<K> linkedList;

	private K key;
	
	public Hashmap() {
		arrayList = new ArrayList<>();
		for (int i=0; i<numOFBucket; i++) {
			arrayList.add(null);
			
		}
	}
	public V get(K key) {
		int indexNumber = this.getBucketnumber(key);
		LL<K> linkedList = arrayList.get(indexNumber);
		if(linkedList == null) {
			return null;
		}
			MyMapNode<K, V> mapnode = (MyMapNode<K, V>)linkedList.search(key);
			return mapnode == null ? null : mapnode.getValue();
			
	}
	private int getBucketnumber(K key) {
		int hashcode = Math.abs(key.hashCode());
		
		
		return hashcode % this.numOFBucket;
	}
	
	public void add (K key, V value) {
		int index = this.getBucketnumber(key);
		LL<K> linkedList = this.arrayList.get(index);
		   	  linkedList = new LL<>();
		   	  this.arrayList.set(index, linkedList);
		   	  
	}
	MyMapNode<K, V> myMapNode = (MyMapNode<K, V>)linkedList.search(key)
	if (myMapNode == null) {
		myMapNode = new MyMapNode<>(key, null);
		linkedList.append(myMapNode);
		
	}else {
		V value;
		myMapNode.setValue(value);	
}

@Override
	public String toString() {
	return "Hashmap [arrayList=" + arrayList + "]";
}}}
								

