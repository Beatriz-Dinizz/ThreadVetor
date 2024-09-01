package controller;

public class ThreadVetor extends Thread {
	private int numero;
	private int[] vetor;

	public ThreadVetor(int numero, int[] vetor) {
		this.numero = numero;
		this.vetor = vetor;
	}
	
	@Override
	public void run() {
		long tempoInicial= System.nanoTime();
		
		if(numero % 2 == 0) {
			int soma = 0;
			
			for(int i = 0; i < vetor.length; i++) {
				soma += vetor[i];
			}
		} else {
			int soma = 0;
			for(int valor : vetor) {
				soma += valor;
			}
		}
		
		long tempoFinal = System.nanoTime();
		double tempoExecucao = tempoFinal - tempoInicial;
		System.out.println("A Thread de número " + numero + " levou " + tempoExecucao + " segundos para percorrer o vetor.");
	}
}
