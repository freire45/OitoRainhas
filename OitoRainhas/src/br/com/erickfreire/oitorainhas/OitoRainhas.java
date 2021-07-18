package br.com.erickfreire.oitorainhas;

import java.util.Scanner;

/**
 * Programa em Java que testa a possibilidade de colocar oito rainhas em um tabuleiro de xadrez onde elas não podem estar na mesma linha
 * mesma coluna ou na mesma diagonal
 * @author Erick Freire
 * @version 1 - Criado em 17-07-2021 as 19:00
 */

public class OitoRainhas {

	public static void main(String[] args) {
		
		int[][] tabuleiro =  new int[8][8];
		
		Scanner entrada = new Scanner(System.in);
		
		int linha = 0;
		int coluna = 0;
		int opcao = 0;
		int verificalinha = 0;
		int verificacoluna = 0;
		int verificadiagonal = 0;
		
		for(int i=0; i < 8; i++) {
			for(int j=0; j<8; j++) {
				tabuleiro[i][j] = 0;
			}
		}
		
		System.out.println("Tabuleiro de Damas tente colocar uma rainha: \n");
		
		for(int i=0; i < 8; i++) {
			for(int j=0; j<8; j++) {
				System.out.printf("%d ", tabuleiro[i][j]);
				
				if(j == 7)
					System.out.println();
			}
		}
		
		System.out.print("\nDigite 1 - para inserir uma Rainha ou 9 - Para sair: ");
		opcao = entrada.nextInt();
		
		
		
		while(opcao != 9) {
			
			System.out.print("\nDigite uma linha: ");
			linha = entrada.nextInt();
			
			while(linha < 1 || linha > 8) {
				System.out.print("\nErro : Digite uma linha: ");
				linha = entrada.nextInt();
			}
			
			System.out.print("\nDigite uma coluna: ");
			coluna = entrada.nextInt();
			
			while(coluna < 1 || coluna > 8) {
				System.out.print("\nErro : Digite uma coluna: ");
				coluna = entrada.nextInt();
			}
			
			if (tabuleiro[linha-1][coluna-1] == 0) {
				
			    for(int i = 0; i < 8; i++) {
			    	if(tabuleiro[linha-1][i] == 0) {
			    		verificalinha = 0;
			    		
			    	} else {
			    		
			    		verificalinha = 1;
			    	}
				
			    }
			    
			    for(int i = 0; i < 8; i++) {
			    	if(tabuleiro[i][coluna-1] == 0) {
			    		verificacoluna = 0;
			    		
			    	} else {
			    		
			    		verificacoluna = 1;
			    	}
			    	
			    }
			    
			    
			    if(verificalinha == 0 && verificacoluna == 0) {
			    	tabuleiro[linha-1][coluna-1] = 1;
			    } else {
			    	System.out.println("\nNão é possível adicionar uma rainha\n");
			    }
			    
			    
			
			} else {
				System.out.println("\nNão é possível adicionar uma rainha\n");
			}
			
			System.out.println();
			
			for(int i=0; i < 8; i++) {
				for(int j=0; j<8; j++) {
					System.out.printf("%d ", tabuleiro[i][j]);
					
					if(j == 7)
						System.out.println();
				}
			}
			
			System.out.print("\nDigite 1 - para inserir uma Rainha ou 9 - Para sair: ");
			opcao = entrada.nextInt();
			
			
			
		}
		
		
		System.out.println("\nPrograma Finalizando...");
		
		
		

	}
	

}
