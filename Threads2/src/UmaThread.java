
public class UmaThread extends Thread {

	private static Runnable identificacao;
	private int delay;

	public UmaThread(String identifacacao, int delay) {
		super(identificacao);
		this.delay = delay;
	}

	public void run() {
		String identificacao = this.getName();
		try {
			sleep(delay);
		} catch (InterruptedException e) {

			System.out.println("Thread: " + identificacao + " foi interrompida");
		}
		System.out.print(">>" + identificacao + " " + delay);
	}

}
