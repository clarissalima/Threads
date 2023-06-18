
public class VariasThreads {

	public static void main(String[] args) {

		new Thread(new Escrita()).start();
		new Thread(new Escrita()).start();

	}

}
