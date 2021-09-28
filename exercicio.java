public class MinhaThread extends Thread {
	volatile long id = 0; 
	volatile long limite = 0;
	volatile long a;
	MinhaThread(long novoId, long novoLimite) {
		this.id = novoId;
		this.limite = novoLimite;
	}
	public void run() {
		for(int i = 0; i < limite; i++) {
			a = id + i;
			System.out.print("["+  id + "]"+"-"+ Main.x++);
			if (i == 1000 || i == 2000 || i == 3000 || i == 4000 || i == 5000 || i == 6000 || i == 7000 || i == 8000 || i == 9000) {
				System.out.print("\n ");
			}
		}
		System.out.println("\nTerminou thread " + id);
	}

}
