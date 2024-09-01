package view;

import java.util.Random;
import controller.ThreadVetor;

public class Principal {

	public static void main(String[] args) {
		int[] vetor = new int[1000];
		Random random = new Random();
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = random.nextInt(100) + 1;
		}
		
		ThreadVetor thread1 = new ThreadVetor(1, vetor);
		ThreadVetor thread2 = new ThreadVetor(2, vetor);
		
		thread1.start();
		thread2.start();
	}
}
