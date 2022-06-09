package generics;

import java.util.ArrayList;
import java.util.List;

public class PrintServiceGenerics<T> {
	
	private List<T> list = new ArrayList<>();

	public void addValue(T value) {
		list.add(value);
	}
	
	public T first() {
		return list.get(0);
	}
	
	public void print() {
		if(!list.isEmpty()) {
			System.out.println(list.get(0));
		}
		for(int i=1; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}


}
