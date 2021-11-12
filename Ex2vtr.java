package br.com.generation.lista4;
import java.util.Scanner;
public class Ex2vtr {

	public static void main(String[] args) {
		
		int []dado = new int [10];
		int conta6 = 0;
		double media = 0,soma = 0;
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < dado.length;i++) {
			
			System.out.printf("\nDigite o valor do %dº dado lançado: ",i+1);
			dado[i] = scan.nextInt();
			
			soma += dado[i];
			if (dado[i] == 6) {
				conta6 ++;
			}
			media = soma/i;
		}
		
		System.out.printf("A media dos lançamentos é: %.2f ",media);
		System.out.printf("\nO dado teve %d ocorrencia(s) de maior pontuação.",conta6);
		
		scan.close();
	}

}