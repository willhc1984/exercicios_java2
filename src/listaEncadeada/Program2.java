package listaEncadeada;

public class Program2 {

	public static void main(String[] args) {
		
		ListGenerics<String> list = new ListGenerics<>();
		list.add("Jo�o");
		list.add("Maria");
		list.add("Jos�");
		
		System.out.println(list.toString());
	}

}
