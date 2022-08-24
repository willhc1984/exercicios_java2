package listaEncadeada;

public class Program2 {

	public static void main(String[] args) {
		
		ListGenerics<String> list = new ListGenerics<>();
		list.add("João");
		list.add("Maria");
		list.add("José");
		
		System.out.println(list.toString());
		
		ListGenerics<Double> list2 = new ListGenerics<>();
		list2.add(8.0);
		list2.add(6.0);
		list2.add(5.0);
		
		System.out.println(list2.toString());
	}

}
