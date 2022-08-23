package listaEncadeada;

public class ListGenerics<T> {
	
	private NodeGenerics<T> head;
	
	public void add(T value) {
		NodeGenerics<T> node = new NodeGenerics<T>();
		node.setValue(value);
		node.setNext(head);
		head = node;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		NodeGenerics<T> p = head;
		while(p != null) {
			sb.append(p.getValue() + " ");
			p = p.getNext();
		}
		
		sb.append("]");		
		return sb.toString();
	}

}
