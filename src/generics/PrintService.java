package generics;

import java.util.ArrayList;
import java.util.List;

public class PrintService {
	
	private List<Integer> list = new ArrayList<>();

	public List<Integer> getList() {
		return list;
	}

	public void setList(List<Integer> list) {
		this.list = list;
	}

	public void addValue(Integer value) {
		list.add(value);
	}
	
	public int first() {
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
