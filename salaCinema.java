package cinema;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class salaCinema {

	public static void main(String[] args) {
		int fileira =10;
		int assento =20;
		int[][] sala = new int [fileira] [assento];  //matriz
		int desejaComprar=0;
		
		int ocupado = 1;
		int livre = 2;
		int coluna =0;
		int linha =0;
		
		for (int i=0; i<fileira;i++) {
			for(int k =0;k<assento;k++) { // adcionando numero em tds as posições, tds livres.
				sala[i][k] = livre;
			}
		}
		Scanner input = new Scanner (System.in);
		
		System.out.println("Informe quantos assentos deseja comprar: ");
		desejaComprar = input.nextInt();
		
		int i=0;
		while (i<desejaComprar) {
			System.out.println("Escolha a fileira que deseja ?");
			linha = input.nextInt();
					
			System.out.println("Escolha o seu assentos:");
			coluna = input.nextInt();
			
			if (linha > fileira || coluna > assento ) {
				System.out.println("Assento ou Fileira incorretos, escolha novamente.");
			}			
			else if(sala [linha][coluna] == livre) {
				sala[linha][coluna] = ocupado;
				System.out.println("Assento(s) reservados!");
				i++;
			}
			else if(sala [linha][coluna] == ocupado  ) {
				System.out.println("Este assento ja esta ocupado, escolha novamente.");
				i++;
			}
		}
		for(int a=0;a<fileira;a++) {
			for(int b=0;b<assento;b++) {
				if (sala[a][b] == ocupado) {
					System.out.println("Assentos ocupados: Fileira " + a + " Assento " + b);
				} else {
					System.out.println("Assentos livres:  Fileira " + a + " Assento " + b);
				}
			}
		}
    }
}
