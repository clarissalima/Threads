
public class Escrita implements Runnable {

	private int i;
	private static int cont = 0;
	private int identificacao;

	@Override
	public void run() {
		while (true) {
			System.out.println("Numero (" + identificacao + "): " + i++);

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
	}

	public Escrita() {
		cont++;
		identificacao = cont;
	}

}
