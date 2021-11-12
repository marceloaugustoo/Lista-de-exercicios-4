package br.com.generation.lista4;
import java.util.Scanner;
public class Ex1vtr {

	public static void main(String[] args) {
		
		double []vetor = new double [5];
		double maior = 0;
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < vetor.length;i++) {
			
			System.out.printf("\nDigite a pontuação %d: ",i+1);
			vetor[i] = scan.nextDouble();
			
			if (vetor[i]>maior) {
				maior = vetor[i];
			}
		}
		
		System.out.printf("A maior pontuação digitada foi: %.2f ",maior);
		
		scan.close();
	}

}
