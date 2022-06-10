package equals_hashcode;

public class Program {

	public static void main(String[] args) {
		
		Client client1 = new Client("maria", "maria@hotmail");
		Client client2 = new Client("maria", "maria@hotmail");
		
		String s1 = new String("test");
		String s2 = new String("test");
		String s3 = "teste";
		String s4 = "teste";

		System.out.println(client1.hashCode());
		System.out.println(client2.hashCode());
		System.out.println(client1.equals(client2));
		System.out.println(client1 == client2);
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
	}

}
