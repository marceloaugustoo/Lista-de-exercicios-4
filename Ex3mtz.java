package br.com.generation.lista4;
import java.util.Scanner;
public class Ex3mtz {

	public static void main(String[] args) {
		
		int n1 [][] = new int[4][6];
		int n2 [][] = new int[4][6];
		int m1 [][] = new int[4][6];
		int m2 [][] = new int[4][6];
		Scanner scan = new Scanner(System.in);
		
		for (int linha = 0;linha < n1.length;linha++) {
			
			for (int coluna = 0;coluna < n1[linha].length; coluna++) {
				
				System.out.printf("Digite o valor da posição %d | %d da matriz n1: ",linha,coluna);
				n1 [linha][coluna] = scan.nextInt();
				
				System.out.printf("Digite o valor da posição %d | %d da matriz n2: ",linha,coluna);
				n2 [linha][coluna] = scan.nextInt();
				
				m1[linha][coluna] = n1[linha][coluna] + n2[linha][coluna];
				m2[linha][coluna] = n1[linha][coluna] - n2[linha][coluna];
			}
			
		}
		System.out.println("znMatriz m1:");
		
		for (int linha = 0;linha<m1.length;linha++) {
			
			for (int coluna = 0; coluna < m1[linha].length;coluna++) {
				
				System.out.print(m1[linha][coluna] + "|");
				
			}
			System.out.println();
		}
		System.out.println("\nMatriz m2:");
		
		for (int linha = 0;linha<m2.length;linha++) {
			
			for (int coluna = 0; coluna < m2[linha].length;coluna++) {
				
				System.out.print(m2[linha][coluna] + "|");
				
			}
			System.out.println();
		} 
		
		scan.close();
	}

}
