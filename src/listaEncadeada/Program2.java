package listaEncadeada;

public class Program2 {

	public static void main(String[] args) {
		
		ListGenerics<String> list = new ListGenerics<>();
		list.add("João");
		list.add("Maria");
		list.add("José");
		
		System.out.println(list.toString());
	}

}
