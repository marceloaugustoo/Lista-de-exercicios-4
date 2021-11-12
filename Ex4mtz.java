package br.com.generation.lista4;
import java.util.Scanner;
public class Ex4mtz {

	public static void main(String[] args) {
		
		int matriz [][] = new int[3][3];
		int soma = 0, diago = 0;
		Scanner scan = new Scanner(System.in);
		
		for (int linha = 0;linha < matriz.length;linha++) {
			
			for (int coluna = 0;coluna < matriz[linha].length; coluna++) {
				
				System.out.printf("Digite o valor da posição %d | %d: ",linha,coluna);
				matriz [linha][coluna] = scan.nextInt();
				soma += matriz[linha][coluna];
				
				if (linha == coluna) {
					diago += matriz[linha][coluna];
				}
				
			}
			
		}
		
		System.out.println("A soma de todos os valores da matriz é: " + soma);
		System.out.println("A soma dos valores da diagonal principal da matriz é: " + diago);
		
		scan.close();
	}

}
