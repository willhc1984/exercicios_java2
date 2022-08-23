package listaEncadeada;

public class NodeGenerics<T> {
	
	private T value;
	private NodeGenerics<T> next;
	
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	public NodeGenerics<T> getNext() {
		return next;
	}
	public void setNext(NodeGenerics<T> next) {
		this.next = next;
	}
	
	

}
