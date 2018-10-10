package program;

//import flowers.rose;
import flowers.tulip;
import storage.Storage;

public class Program {

	public static void main(String[] args) {
		
		Storage storage = new Storage(3);
		//storage.add(new rose(10, 1));
		storage.add(new tulip(5, 1));
		//storage.add(new rose(10, 1));
		storage.add(new tulip(5, 1));
		
		System.out.println("Summ = " + storage.getFlowersPrice());

	}
}
